package com.rollerspeed.repository;

import com.rollerspeed.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
