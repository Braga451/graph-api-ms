package com.graphsubjectapi.api.repository;

import com.graphsubjectapi.api.entity.SubjectEntity;
import org.springframework.data.domain.OffsetScrollPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {
    List<SubjectEntity> findAllBySubjectIdIn(List<String> subjectsId);
    Integer deleteBySubjectId(String subjectId);

    @Modifying
    @Query("update SubjectEntity s set s.semester = ?1, s.name = ?2, s.workload = ?3 where s.subjectId = ?4")
    Integer fullUpdateBySubjectId(Integer semester, String name, Integer workload, String subjectId);
}