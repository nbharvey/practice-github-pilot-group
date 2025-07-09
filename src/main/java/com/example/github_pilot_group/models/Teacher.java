package com.example.github_pilot_group.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity

@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String subject;
}