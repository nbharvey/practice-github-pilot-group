package com.example.github_pilot_group.services;

import com.example.github_pilot_group.models.Teacher;
import com.example.github_pilot_group.repositories.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository repository;

    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

    public List<Teacher> findAll() { return repository.findAll(); }
    public Optional<Teacher> findById(Long id) { return repository.findById(id); }
    public Teacher save(Teacher teacher) { return repository.save(teacher); }
    public void deleteById(Long id) { repository.deleteById(id); }
}