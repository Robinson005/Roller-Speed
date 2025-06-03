package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscripcionClasesController {

    // Muestra el formulario de inscripción
    @GetMapping("/inscripcion-clases")
    public String mostrarFormularioInscripcion(Model model) {
        return "inscripcion_clases"; // nombre de la vista
    }

    // Procesa la inscripción
    @PostMapping("/submit-inscripcion")
    public String procesarInscripcion(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("clase") String clase,
            @RequestParam(value = "comentarios", required = false) String comentarios,
            Model model) {
        
        // Aquí puedes agregar la lógica para guardar la inscripción en la base de datos o enviar un correo, etc.
        
        // Agregar atributos al modelo para mostrar un mensaje de confirmación
        model.addAttribute("nombre", nombre);
        model.addAttribute("clase", clase);
        
        return "inscripcion_confirmacion"; // nombre de la vista de confirmación
    }
}
