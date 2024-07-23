package com.graphsubjectapi.api.graph;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.models.SubjectModel;
import lombok.Data;

import java.util.*;

@Data
public class AdjacencyList {
    private List<SubjectModel> nodes;
    private Map<String, List<String>> edges;

    public AdjacencyList(List<SubjectEntity> subjects) {
        this.nodes = new ArrayList<>();
        this.edges = new HashMap<>();

        for (SubjectEntity subject : subjects) {
            SubjectModel subjectModel = new SubjectModel(
                    subject.getSemester(),
                    subject.getName(),
                    subject.getWorkload(),
                    subject.getSubjectId()
            );

            nodes.add(subjectModel);
            edges.put(subjectModel.getSubjectId(), new ArrayList<>());

            List<SubjectEntity> reqs = subject.getRequirements();

            reqs.forEach(req -> edges.get(subjectModel.getSubjectId()).add(req.getSubjectId()));
        }
    }
}
