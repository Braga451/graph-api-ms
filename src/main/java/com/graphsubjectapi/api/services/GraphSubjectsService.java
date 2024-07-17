package com.graphsubjectapi.api.services;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.repository.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphSubjectsService {
    @Autowired
    private SubjectRepository subjectRepository;
    final Logger logger = LoggerFactory.getLogger(GraphSubjectsService.class);

    public List<SubjectEntity> getSubjects(Integer lowerLimit, Integer upperLimit) {
        logger.info("getSubjects({}, {})", lowerLimit, upperLimit);
        return subjectRepository.findAllByIdBetween(lowerLimit, upperLimit);
    }
}
