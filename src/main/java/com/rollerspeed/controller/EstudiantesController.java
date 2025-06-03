package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudiantesController {

    @GetMapping("/estudiantes")
    public String sestudiantes(Model model) {
        return "estudiantes"; // nombre de la vista
    }
}

