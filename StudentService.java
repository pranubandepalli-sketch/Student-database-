package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository){this.repository=repository;}

    public List<Student> getAll(){return repository.findAll();}
    public Student getById(Long id){return repository.findById(id);}
    public void create(Student s){repository.save(s);}
    public void update(Student s){repository.update(s);}
    public void delete(Long id){repository.delete(id);}
}
