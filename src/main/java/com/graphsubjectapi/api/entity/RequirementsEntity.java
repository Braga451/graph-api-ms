package com.graphsubjectapi.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name = "requirements")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@IdClass(RequirementsPK.class)
public class RequirementsEntity {
    @PrimaryKeyJoinColumns(value = {
            @PrimaryKeyJoinColumn(name = "subject_id", referencedColumnName = "id"),
            @PrimaryKeyJoinColumn(name = "dependency_id", referencedColumnName = "id")
    })

    @Id
    @Column(name = "subject_id", nullable = false)
    private Integer subjectId;

    @Id
    @Column(name = "dependency_id", nullable = false)
    private Integer dependencyId;
}
