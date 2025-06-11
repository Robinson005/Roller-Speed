package com.rollerspeed.controller;

import com.rollerspeed.model.Estudiante;
import com.rollerspeed.repository.ClasesRepository;
import com.rollerspeed.repository.EstudianteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscripcionEstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // método para mostrar formulario con lista de clases en el modelo
    @GetMapping("inscripcion_estudiante")
    public String studentEnrollment(Model model) {
        return "inscripcion_estudiante";
    }

    @PostMapping("inscripcion_estudiante")
    public String procesarInscripcion(
        @RequestParam("nombre") String nombre,
        @RequestParam("email") String email,
        @RequestParam("telefono") String telefono,
        @RequestParam("clase") String clase,
        @RequestParam(value = "comentarios", required = false) String comentarios,
        Model model) {

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEmail(email);
        estudiante.setTelefono(telefono);
        estudiante.setClase(clase);
        estudiante.setComentarios(comentarios);

        estudianteRepository.save(estudiante);

        model.addAttribute("nombre", nombre);
        model.addAttribute("clase", clase);

        return "inscripcion_confirmacion";
    }
}
