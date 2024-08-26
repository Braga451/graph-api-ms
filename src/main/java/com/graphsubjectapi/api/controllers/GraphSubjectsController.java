package com.graphsubjectapi.api.controllers;

import com.graphsubjectapi.api.entity.SubjectEntity;
import com.graphsubjectapi.api.models.CourseCurriculumModel;
import com.graphsubjectapi.api.models.SubjectModel;
import com.graphsubjectapi.api.services.GraphSubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GraphSubjectsController {
    @Autowired
    GraphSubjectsService graphSubjectsService;

    @PostMapping(value = "/insertSubject")
    public ResponseEntity<SubjectModel> insertSubject(@RequestBody SubjectModel subjectModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(graphSubjectsService.insertSubject(subjectModel));
    }

    @GetMapping(value="/getSubjects")
    public ResponseEntity<List<SubjectModel>> getSubjects(@RequestParam(value = "offset") Integer offset,
                                           @RequestParam(value = "limit") Integer limit) {
        return ResponseEntity.ok(graphSubjectsService.getSubjects(offset, limit));
    }

    @GetMapping(value = "/getSubjectBySubjectId")
    public ResponseEntity<SubjectModel>  getSubjectBySubjectId(@RequestParam(value = "subjectId") String subjectId) {
        return ResponseEntity.ok(graphSubjectsService.getSubjectBySubjectId(subjectId));
    }

    @PostMapping(value = "/getSubjectsInCourse")
    public ResponseEntity<List<SubjectModel>> getSubjectsInCourse(@RequestBody CourseCurriculumModel courseCurriculumModel) {
        return ResponseEntity.ok(graphSubjectsService.getSubjectsBySubjectId(courseCurriculumModel.getSubjectsId()));
    }

    @PutMapping(value = "/updateSubject")
    public ResponseEntity<Integer> updateSubject(@RequestBody SubjectModel subjectModel) {
        return ResponseEntity.ok(graphSubjectsService.updateSubject(subjectModel));
    }

    @DeleteMapping(value = "/deleteSubject")
    public ResponseEntity<Integer> deleteSubject(@RequestParam String subjectId) {
        return ResponseEntity.ok(graphSubjectsService.deleteSubject(subjectId));
    }

}
