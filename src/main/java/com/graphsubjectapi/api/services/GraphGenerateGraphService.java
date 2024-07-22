package com.graphsubjectapi.api.services;

import com.graphsubjectapi.api.entity.RequirementEntity;
import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.graph.AdjacencyList;
import com.graphsubjectapi.api.models.CourseGradeModel;
import com.graphsubjectapi.api.repository.RequirementRepository;
import com.graphsubjectapi.api.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphGenerateGraphService {
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private RequirementRepository requirementRepository;

    public AdjacencyList generateGraph(CourseGradeModel courseGradeModel) {
        List<SubjectEntity> nodes = subjectRepository.findAllBySubjectIdIn(courseGradeModel.getSubjectsId());
        List<Integer> nodesIds = nodes.stream().map(SubjectEntity::getId).toList();
        List<RequirementEntity> unformattedEdges = requirementRepository.findAllBySubjectIdIn(nodesIds);

        return new AdjacencyList(nodes, unformattedEdges);
    }
}
