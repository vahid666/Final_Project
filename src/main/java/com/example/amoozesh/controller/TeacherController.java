package com.example.amoozesh.controller;

import com.example.amoozesh.model.Student;
import com.example.amoozesh.model.Teacher;
import com.example.amoozesh.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("saveteacher")
    public Teacher save(@RequestBody Teacher teacher)
    {
        return teacherService.save(teacher);
    }
}
