package com.rollerspeed.repository;

import com.rollerspeed.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    
    // Método para encontrar un estudiante por su correo electrónico
    Optional<Estudiante> findByEmail(String email);
    
    // Método para eliminar un estudiante por su ID
    void deleteById(Long id);
    
    // Método para contar el número de estudiantes inscritos en una clase específica
    long countByClase(String clase);
    
    // Método para encontrar todos los estudiantes inscritos en una clase específica
    List<Estudiante> findByClase(String clase);
}
