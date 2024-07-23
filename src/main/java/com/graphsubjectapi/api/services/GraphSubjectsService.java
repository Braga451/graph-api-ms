package com.graphsubjectapi.api.services;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.models.SubjectModel;
import com.graphsubjectapi.api.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphSubjectsService {
    @Autowired
    private SubjectRepository subjectRepository;
    final Logger logger = LoggerFactory.getLogger(GraphSubjectsService.class);

    public SubjectEntity insertSubject(SubjectModel subjectModel) {
        logger.info("insertSubject({})", subjectModel);

        return subjectRepository.save(new SubjectEntity(
                null, subjectModel.getSemester(),
                subjectModel.getName(), subjectModel.getWorkload(),
                subjectModel.getSubjectId(), null
        ));
    }

    public List<SubjectEntity> getSubjects(Integer offset, Integer limit) {
        logger.info("getSubjects({}, {})", offset, limit);
        if (limit > 25)
            throw new IndexOutOfBoundsException("Max limit (25) exceed");
        return subjectRepository.findAll(PageRequest.of(offset, limit)).toList();
    }

    public List<SubjectEntity> getSubjectsBySubjectId(List<String> subjectsId) {
        logger.info("getSubjectsBySubjectId({})", subjectsId);

        return subjectRepository.findAllBySubjectIdIn(subjectsId);
    }

    @Transactional
    public Integer updateSubject(SubjectModel subjectModel) {
        logger.info("updateSubject({})", subjectModel);

        return subjectRepository.fullUpdateBySubjectId(
                subjectModel.getSemester(),
                subjectModel.getName(), subjectModel.getWorkload(),
                subjectModel.getSubjectId()
        );
    }

    @Transactional
    public Integer deleteSubject(String subjectId) {
        logger.info("deleteSubject({subjectId})");

        return subjectRepository.deleteBySubjectId(subjectId);
    }
}
