package com.graphsubjectapi.api.repository;

import com.graphsubjectapi.api.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {
    List<SubjectEntity> findAllByIdBetween(Integer lowerLimit, Integer upperLimit);
}
