package com.rollerspeed.repository;

import com.rollerspeed.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    
    // Método para encontrar un instructor por su correo electrónico
    Optional<Instructor> findByEmail(String email);
    
    // Método para eliminar un instructor por su ID
    void deleteById(Long id);
    
    // Método para contar el número de instructores por especialidad
    long countByEspecialidad(String especialidad);
    
    // Método para encontrar todos los instructores con una especialidad específica
    List<Instructor> findByEspecialidad(String especialidad);
}
