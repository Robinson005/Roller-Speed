package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListarEstudiantesController {

    @GetMapping("/listar_estudiantes")
    public String listarEstudiantes(Model model) {
        return "listar_estudiantes"; // nombre de la vista
    }
}
