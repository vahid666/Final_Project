package com.example.amoozesh.repository;


import com.example.amoozesh.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    public Optional<Teacher> findByTeachernum(Teacher teacher);


}