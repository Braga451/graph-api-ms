package com.graphsubjectapi.api.repository;

import com.graphsubjectapi.api.entity.RequirementsEntity;
import com.graphsubjectapi.api.entity.RequirementsPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementsRepository extends JpaRepository<RequirementsEntity, RequirementsPK> {
    Integer deleteBySubjectIdAndDependencyId(Integer subjectId, Integer dependencyId);
    Integer deleteBySubjectId(Integer subjectId);
}
