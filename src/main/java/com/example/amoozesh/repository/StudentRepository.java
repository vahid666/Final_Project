package com.example.amoozesh.repository;

import com.example.amoozesh.model.Student;
import com.example.amoozesh.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Optional<Student> findByStudentnum(Student student);


}