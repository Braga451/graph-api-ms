package com.graphsubjectapi.api.controllers;

import com.graphsubjectapi.api.graph.AdjacencyList;
import com.graphsubjectapi.api.models.CourseCurriculumModel;
import com.graphsubjectapi.api.services.GraphGenerateGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphGenerateGraphController {
    @Autowired
    private GraphGenerateGraphService graphGenerateGraphService;

    @PostMapping(value = "/generateGraph")
    public AdjacencyList generateGraph(@RequestBody CourseCurriculumModel courseCurriculumModel) {
        return ResponseEntity.ok(graphGenerateGraphService.generateGraph(courseCurriculumModel)).getBody();
    }
}
