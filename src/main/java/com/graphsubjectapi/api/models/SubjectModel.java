package com.graphsubjectapi.api.models;

import com.graphsubjectapi.api.entity.SubjectEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class SubjectModel {
    private Integer semester;
    private String name;
    private Integer workload;
    private String subjectId;

    public SubjectModel(SubjectEntity subjectEntity) {
        this.semester = subjectEntity.getSemester();
        this.name = subjectEntity.getName();
        this.workload = subjectEntity.getWorkload();
        this.subjectId = subjectEntity.getSubjectId();
    }
}