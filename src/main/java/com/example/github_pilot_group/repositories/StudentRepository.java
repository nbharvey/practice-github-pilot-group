package com.example.github_pilot_group.repositories;

import com.example.github_pilot_group.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {}