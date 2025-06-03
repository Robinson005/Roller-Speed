package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramaciónClases {

    @GetMapping("/programacion_clases")
    public String programacionClases(Model model) {
        return "programacion_clases"; // nombre de la vista
    }
}
