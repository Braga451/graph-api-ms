package com.graphsubjectapi.api.models;

import lombok.Data;
@Data
public class SubjectModel {
    private Integer semester;
    private String name;
    private Integer workload;
    private String subjectId;
}