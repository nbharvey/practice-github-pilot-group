package com.example.github_pilot_group.services;

import com.example.github_pilot_group.models.Student;
import org.springframework.stereotype.Service;
import com.example.github_pilot_group.repositories.StudentRepository;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() { return repository.findAll(); }
    public Optional<Student> findById(Long id) { return repository.findById(id); }
    public Student save(Student student) { return repository.save(student); }
    public void deleteById(Long id) { repository.deleteById(id); }
}