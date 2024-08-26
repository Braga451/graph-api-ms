package com.graphsubjectapi.api.services;

import com.graphsubjectapi.api.entity.RequirementsEntity;
import com.graphsubjectapi.api.models.DependencyModel;
import com.graphsubjectapi.api.models.RequirementsModel;
import com.graphsubjectapi.api.repository.RequirementsRepository;
import com.graphsubjectapi.api.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GraphRequirementsService {
    private final Logger logger = LoggerFactory.getLogger(GraphRequirementsService.class);

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private RequirementsRepository requirementsRepository;

    public List<RequirementsModel> getRequirements(Integer offset, Integer limit) {
        logger.info("getRequirements({}, {})", offset, limit);
        if (limit > 25)
            throw new IndexOutOfBoundsException("Max limit (25) exceed");
        return subjectRepository.findAll(PageRequest.of(offset, limit)).stream().map(RequirementsModel::new).toList();
    }

    public RequirementsModel getRequirementsBySubjectId(String subjectId) {
        logger.info("getRequirementsBySubjectId({})", subjectId);

        return new RequirementsModel(subjectRepository.findBySubjectId(subjectId));
    }

    public List<RequirementsModel> insertRequirement(DependencyModel dependencyModel) {
        Integer subjectId = dependencyModel.getSubjectId();
        Integer dependencyId = dependencyModel.getDependencyId();

        logger.info("insertRequirement({}, {})", subjectId, dependencyId);

        requirementsRepository.save(new RequirementsEntity(subjectId, dependencyId));

        return subjectRepository.findAllByIdIn(List.of(subjectId, dependencyId)).stream().map(RequirementsModel::new).toList();
    }

    @Transactional
    public Integer deleteRequirement(Integer subjectId, Integer dependencyId) {
        logger.info("deleteRequirement({}, {})", subjectId, dependencyId);

        return requirementsRepository.deleteBySubjectIdAndDependencyId(subjectId, dependencyId);
    }

    @Transactional
    public Integer deleteAllSubjectRequirements(Integer subjectId) {
        logger.info("deleteAllSubjectRequirements({})", subjectId);

        return requirementsRepository.deleteBySubjectId(subjectId);
    }
}
