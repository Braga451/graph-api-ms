package com.graphsubjectapi.api.repository;

import com.graphsubjectapi.api.entity.RequirementEntity;
import com.graphsubjectapi.api.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequirementRepository extends JpaRepository<RequirementEntity, Integer> {
    List<RequirementEntity> findAllBySubjectIdIn(List<Integer> subjectsId);
}
