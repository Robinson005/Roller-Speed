package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClasesController {

    @GetMapping("/classes")
    public String classes(Model model) {
        return "classes"; // nombre de la vista
    }
}
