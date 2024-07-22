package com.graphsubjectapi.api.graph;

import com.graphsubjectapi.api.entity.RequirementEntity;
import com.graphsubjectapi.api.entity.SubjectEntity;
import lombok.Data;

import java.util.*;

@Data
public class AdjacencyList {
    private List<SubjectEntity> nodes;
    private Map<String, List<String>> edges;

    public AdjacencyList(List<SubjectEntity> nodes, List<RequirementEntity> edges) {
        this.nodes = nodes;

        Map<Integer, String> idToSubjectId = new HashMap<>();
        Map<String, List<String>> formattedEdges = new HashMap<>();

        for (SubjectEntity node : nodes) {
            idToSubjectId.put(node.getId(), node.getSubjectId());
            formattedEdges.put(node.getSubjectId(), new ArrayList<>());
        }

        for (RequirementEntity edge: edges) {
            if (Objects.isNull(idToSubjectId.get(edge.dependencyId))) {
                throw new NullPointerException("Missing dependecy at: ".concat(idToSubjectId.get(edge.getSubjectId())));
            }

            formattedEdges.get(idToSubjectId.get(edge.getSubjectId())).add(idToSubjectId.get(edge.getDependencyId()));
        }

        this.edges = formattedEdges;
    }
}
