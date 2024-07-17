package com.graphsubjectapi.api.repository;

import com.graphsubjectapi.api.entity.RequirementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequirementRepository extends JpaRepository<RequirementEntity, Integer> {

}
