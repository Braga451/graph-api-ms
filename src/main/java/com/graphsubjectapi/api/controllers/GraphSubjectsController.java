package com.graphsubjectapi.api.controllers;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.models.CourseGradeModel;
import com.graphsubjectapi.api.services.GraphSubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GraphSubjectsController {
    @Autowired
    GraphSubjectsService graphSubjectsService;
    @GetMapping(value="/getSubjects")
    public List<SubjectEntity> getSubjects(@RequestParam(value = "offset") Integer offset,
                                           @RequestParam(value = "limit") Integer limit) {
        return ResponseEntity.ok(graphSubjectsService.getSubjects(offset, limit)).getBody();
    }

    @PostMapping(value = "/getSubjectsInCourse")
    public List<SubjectEntity> getSubjectsInCourse(@RequestBody CourseGradeModel courseGradeModel) {
        return ResponseEntity.ok(graphSubjectsService.getSubjectsBySubjectId(courseGradeModel.getSubjectsId())).getBody();
    }
}
