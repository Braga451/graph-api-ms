package com.graphsubjectapi.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class SubjectModel {
    private Integer semester;
    private String name;
    private Integer workload;
    private String subjectId;
}