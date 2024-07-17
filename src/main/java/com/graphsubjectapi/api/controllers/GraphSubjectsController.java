package com.graphsubjectapi.api.controllers;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.services.GraphSubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GraphSubjectsController {
    @Autowired
    GraphSubjectsService graphSubjectsService;
    @GetMapping(value="/getSubjects")
    public List<SubjectEntity> getSubjects(@RequestParam(value = "lowerLimit") Integer lowerLimit,
                                           @RequestParam(value = "upperLimit") Integer upperLimit) {
        return graphSubjectsService.getSubjects(lowerLimit, upperLimit);
    }
}
