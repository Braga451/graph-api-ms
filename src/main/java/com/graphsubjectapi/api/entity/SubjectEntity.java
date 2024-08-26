package com.graphsubjectapi.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="subjects")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;
    
    @Column(name = "semester", nullable = false)
    public Integer semester;

    @Column(name = "name", length = 250, nullable = false)
    public String name;
    
    @Column(name = "workload", nullable = false)
    public Integer workload;
    
    @Column(name = "subject_id", length = 25, nullable = false)
    public String subjectId;

    @ManyToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.DETACH})
    @JoinTable(
            name = "requirements",
            joinColumns = {
                    @JoinColumn(name = "subject_id", referencedColumnName = "id", nullable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "dependency_id", referencedColumnName = "id", nullable = false)
            }
    )
    private List<SubjectEntity> requirements;
}
