package com.rollerspeed.controller;

import com.rollerspeed.model.Usuario; // Asegúrate de tener un modelo Usuario
import com.rollerspeed.repository.UsuarioRepository; // Asegúrate de tener un repositorio para Usuario
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioRepository usuarioRepository; // Inyección del repositorio

    // Muestra el formulario de registro
    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        return "registro"; // nombre de la vista
    }

    // Procesa el registro
    @PostMapping("/submit-registro")
    public String procesarRegistro(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("contraseña") String contraseña,
            Model model) {
        
        // Crear un nuevo objeto Usuario
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setEmail(email);
        nuevoUsuario.setTelefono(telefono);
        nuevoUsuario.setContraseña(contraseña); // Asegúrate de encriptar la contraseña antes de guardarla

        // Guardar el usuario en la base de datos
        usuarioRepository.save(nuevoUsuario);
        
        // Agregar un mensaje de confirmación al modelo
        model.addAttribute("nombre", nombre);
        
        return "registro_confirmacion"; // Redirigir a una vista de confirmación
    }
}
