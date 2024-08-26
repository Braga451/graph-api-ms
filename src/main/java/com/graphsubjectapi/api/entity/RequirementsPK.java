package com.graphsubjectapi.api.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequirementsPK implements Serializable {
    private Integer subjectId;
    private Integer dependencyId;
}
