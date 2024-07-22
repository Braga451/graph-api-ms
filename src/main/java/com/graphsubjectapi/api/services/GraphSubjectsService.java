package com.graphsubjectapi.api.services;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.repository.SubjectRepository;
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
}
