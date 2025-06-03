package com.rollerspeed.repository;

import com.rollerspeed.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // Método para encontrar un usuario por su correo electrónico
    Optional<Usuario> findByEmail(String email);
    
    // Método para eliminar un usuario por su ID
    void deleteById(Long id);
    
    // Método para verificar si un usuario existe por su correo electrónico
    boolean existsByEmail(String email);
    
    // Método para contar el número de usuarios registrados
    long count();
    
    // Método para encontrar un usuario por su nombre
    Optional<Usuario> findByNombre(String nombre);
}
