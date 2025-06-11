package com.rollerspeed.controller;

import com.rollerspeed.model.Instructor;
import com.rollerspeed.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscripcionInstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    @GetMapping("inscripcion_instructor")
    public String inscripcionInstructor(Model model) {
        return "inscripcion_instructor";
    }

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

        instructorRepository.save(instructor);

        model.addAttribute("nombre", nombre);
        model.addAttribute("especialidad", especialidad);

        return "inscripcion_instructor_confirmacion";
    }
}
