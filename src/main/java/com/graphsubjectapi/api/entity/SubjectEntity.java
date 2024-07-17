package com.graphsubjectapi.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="subjects")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name = "semester", nullable = false)
    public Integer semester;

    @Column(name = "name", length = 250, nullable = false)
    public String name;
    @Column(name = "workload", nullable = false)
    public Integer workload;
    @Column(name = "subject_id", length = 25, nullable = false)
    public String subjectId;
}
