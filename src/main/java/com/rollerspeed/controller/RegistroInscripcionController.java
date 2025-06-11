package com.rollerspeed.controller;

import com.rollerspeed.model.Estudiante;
import com.rollerspeed.model.Instructor;
import com.rollerspeed.repository.EstudianteRepository;
import com.rollerspeed.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * Controlador para gestionar la inscripción y listado de estudiantes e instructores.
 */
@Controller
public class RegistroInscripcionController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private InstructorRepository instructorRepository;

    // Mostrar formulario para inscripción de estudiante
    @GetMapping("inscripcion_estudiante")
    public String mostrarFormularioInscripcionEstudiante() {
        return "inscripcion_estudiante";
    }

    // Procesar inscripción de estudiante (formulario POST)
    @PostMapping("nscripcion_estudiante")
    public String procesarInscripcionEstudiante(
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
        estudiante.setFechaInscripcion(LocalDateTime.now().toString());

        estudianteRepository.save(estudiante);

        model.addAttribute("nombre", nombre);
        model.addAttribute("clase", clase);
        return "inscripcion_confirmacion";
    }

    // Mostrar formulario para inscripción de instructor
    @GetMapping("inscripcion_instructor")
    public String mostrarFormularioInscripcionInstructor() {
        return "inscripcion_instructor";
    }

    // Procesar inscripción de instructor (formulario POST)
    @PostMapping("inscripcion_instructor")
    public String procesarInscripcionInstructor(
            @RequestParam("nombre") String nombre,
            @RequestParam("correo") String correo,
            @RequestParam("telefono") String telefono,
            @RequestParam("especialidad") String especialidad,
            Model model) {

        Instructor instructor = new Instructor();
        instructor.setNombre(nombre);
        instructor.setCorreo(correo);
        instructor.setTelefono(telefono);
        instructor.setEspecialidad(especialidad);
        instructor.setFechaInscripcion(LocalDateTime.now().toString());

        instructorRepository.save(instructor);

        model.addAttribute("nombre", nombre);
        model.addAttribute("especialidad", especialidad);
        return "inscripcion_instructor_confirmacion";
    }

    // Mostrar lista de estudiantes (para "/listar-estudiantes" y "/estudiantes")
    @GetMapping({"listar_estudiantes", "estudiantes"})
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteRepository.findAll());
        return "listar_estudiantes";
    }

    // Mostrar lista de instructores ("/instructor")
    @GetMapping("instructor")
    public String listarInstructores(Model model) {
        model.addAttribute("instructores", instructorRepository.findAll());
        return "instructor";
    }
}

