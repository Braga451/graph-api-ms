package com.graphsubjectapi.api.models;

import com.graphsubjectapi.api.entity.SubjectEntity;
import lombok.Data;

import java.util.List;

@Data
public class RequirementsModel {
    private String subjectId;
    private String name;
    private List<String> requirements;

    public RequirementsModel(SubjectEntity subjectEntity) {
        this.subjectId = subjectEntity.getSubjectId();
        this.name = subjectEntity.getName();
        this.requirements = subjectEntity.getRequirements().stream().map(SubjectEntity::getSubjectId).toList();
    }
}
