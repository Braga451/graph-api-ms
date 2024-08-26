package com.graphsubjectapi.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DependencyModel {
    private Integer subjectId;
    private Integer dependencyId;
}
