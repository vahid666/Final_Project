package com.example.amoozesh.service;

import com.example.amoozesh.model.Student;
import com.example.amoozesh.model.Teacher;
import com.example.amoozesh.repository.StudentRepository;
import com.example.amoozesh.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student save(Student student){
        if (studentRepository.findByStudentnum(student).isPresent())
        {
            return student;
        }
        return  studentRepository.save(student);
    }
}
