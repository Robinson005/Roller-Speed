package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudiantesController {

    @GetMapping("/students")
    public String students(Model model) {
        return "students"; // nombre de la vista
    }
}

