package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service){this.service=service;}

    @GetMapping
    public List<Student> all(){return service.getAll();}

    @GetMapping("/{id}")
    public Student one(@PathVariable Long id){return service.getById(id);}

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        service.create(student);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id,@RequestBody Student student){
        student.setId(id);
        service.update(student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
