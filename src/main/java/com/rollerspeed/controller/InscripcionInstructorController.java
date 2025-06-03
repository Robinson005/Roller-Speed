package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscripcionInstructorController {
    @GetMapping("/inscripcion_instructor")
    public String inscripcionInstructor(Model model) {
        return "inscripcion_instructor"; // nombre de la vista
    }

    @PostMapping("/submit-inscripcion-instructor")
    public String procesarInscripcionInstructor(
        @RequestParam("nombre") String nombre,
        @RequestParam("email") String email,
        @RequestParam("telefono") String telefono,
        @RequestParam("especialidad") String especialidad,
        Model model) {
    
    // Lógica para guardar el instructor en la base de datos
    // instructorRepository.save(new Instructor(nombre, email, telefono, especialidad));
    
        return "inscripcion_instructor_confirmacion"; // Redirigir a la vista de confirmación
    }

}
