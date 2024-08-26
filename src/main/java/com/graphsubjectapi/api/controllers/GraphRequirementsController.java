package com.graphsubjectapi.api.controllers;

import com.graphsubjectapi.api.models.DependencyModel;
import com.graphsubjectapi.api.models.RequirementsModel;
import com.graphsubjectapi.api.services.GraphRequirementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GraphRequirementsController {
    @Autowired
    private GraphRequirementsService graphRequirementsService;

    @GetMapping(value="/getRequirements")
    public ResponseEntity<List<RequirementsModel>> getRequirements(@RequestParam(value = "offset") Integer offset,
                                                                   @RequestParam(value = "limit") Integer limit) {
        return ResponseEntity.ok(graphRequirementsService.getRequirements(offset, limit));
    }

    @GetMapping(value = "/getRequirementsBySubjectId")
    public ResponseEntity<RequirementsModel> getRequirementsBySubjectId(@RequestParam(value = "subjectId") String subjectId) {
        return ResponseEntity.ok(graphRequirementsService.getRequirementsBySubjectId(subjectId));
    }

    @PostMapping(value = "/insertRequirement")
    public ResponseEntity<List<RequirementsModel>> insertRequirement(@RequestBody DependencyModel dependencyModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(graphRequirementsService.insertRequirement(dependencyModel));
    }

    @DeleteMapping(value = "/deleteRequirement")
    public ResponseEntity<Integer> deleteRequirement(@RequestParam(value = "subjectId") Integer subjectId,
                                     @RequestParam(value = "dependencyId") Integer dependencyId) {
        return ResponseEntity.ok(graphRequirementsService.deleteRequirement(subjectId, dependencyId));
    }

    @DeleteMapping(value = "/deleteAllSubjectRequirements")
    public ResponseEntity<Integer> deleteRequirement(@RequestParam(value = "subjectId") Integer subjectId) {
        return ResponseEntity.ok(graphRequirementsService.deleteAllSubjectRequirements(subjectId));
    }
}
