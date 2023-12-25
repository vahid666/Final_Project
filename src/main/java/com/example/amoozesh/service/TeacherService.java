package com.example.amoozesh.service;

import com.example.amoozesh.model.Teacher;
import com.example.amoozesh.repository.StudentRepository;
import com.example.amoozesh.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    public Teacher save(Teacher teacher){
        if (teacherRepository.findByTeachernum(teacher).isPresent())
        {
            return teacher;
        }
        return  teacherRepository.save(teacher);
    }
}
