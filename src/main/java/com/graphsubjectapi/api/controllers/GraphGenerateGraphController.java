package com.graphsubjectapi.api.controllers;

import com.graphsubjectapi.api.graph.AdjacencyList;
import com.graphsubjectapi.api.models.CourseGradeModel;
import com.graphsubjectapi.api.services.GraphGenerateGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphGenerateGraphController {
    @Autowired
    GraphGenerateGraphService graphGenerateGraphService;
    @PostMapping(value = "/generateGraph")
    AdjacencyList generateGraph(@RequestBody CourseGradeModel gradeModel) {
        return ResponseEntity.ok(graphGenerateGraphService.generateGraph(gradeModel)).getBody();
    }
}
