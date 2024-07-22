package com.graphsubjectapi.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="requirements")
public class RequirementEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "req_id", nullable = false)
    private Integer reqId;
    @Column(name = "subject_id", nullable = false)
    public Integer subjectId;
    @Column(name = "dependency_id", nullable = false)
    public Integer dependencyId;
}
