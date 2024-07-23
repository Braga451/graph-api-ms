package com.graphsubjectapi.api.services;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.graph.AdjacencyList;
import com.graphsubjectapi.api.models.CourseCurriculumModel;
import com.graphsubjectapi.api.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphGenerateGraphService {
    @Autowired
    private SubjectRepository subjectRepository;

   public AdjacencyList generateGraph(CourseCurriculumModel courseCurriculumModel) {
        List<SubjectEntity> nodes = subjectRepository.findAllBySubjectIdIn(courseCurriculumModel.getSubjectsId());

        return new AdjacencyList(nodes);
    }
}
