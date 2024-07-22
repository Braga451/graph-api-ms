package com.graphsubjectapi.api.repository;

import com.graphsubjectapi.api.entity.SubjectEntity;
import org.springframework.data.domain.OffsetScrollPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {
    List<SubjectEntity> findAllBySubjectIdIn(List<String> subjectsId);
}