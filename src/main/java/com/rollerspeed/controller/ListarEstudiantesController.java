package com.rollerspeed.controller;

import com.rollerspeed.model.Estudiante;
import com.rollerspeed.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListarEstudiantesController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping({"listar_estudiantes", "estudiantes"})
    public String listarEstudiantes(Model model) {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        model.addAttribute("estudiantes", estudiantes);
        return "listar_estudiantes";
    }
}

