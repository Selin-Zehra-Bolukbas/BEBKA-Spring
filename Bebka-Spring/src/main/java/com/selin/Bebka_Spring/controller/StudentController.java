package com.selin.Bebka_Spring.controller;

import com.selin.Bebka_Spring.model.Student;
import com.selin.Bebka_Spring.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student add (@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getAll() {
        return studentService.findAll();
    }
}
