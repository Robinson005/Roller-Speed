package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscripcionEstudianteController {
    @GetMapping("/student-enrollment")
    public String studentEnrollment(Model model) {
        return "inscripcion_estudiante"; // nombre de la vista
    }

    @PostMapping("/submit-inscripcion")
    public String procesarInscripcion(
        @RequestParam("nombre") String nombre,
        @RequestParam("email") String email,
        @RequestParam("telefono") String telefono,
        @RequestParam("clase") String clase,
        @RequestParam(value = "comentarios", required = false) String comentarios,
        Model model) {
    
    // Lógica para guardar el estudiante en la base de datos
    // estudianteRepository.save(new Estudiante(nombre, email, telefono, clase));
    
        return "inscripcion_confirmacion"; // Redirigir a la vista de confirmación
    }

}