package com.example.feb2024.repository;

import com.example.feb2024.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository< Student, Integer > {
}
