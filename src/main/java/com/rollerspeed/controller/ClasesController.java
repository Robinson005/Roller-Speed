package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClasesController {
    @GetMapping("/clases")
    public String clases(Model model) {
       return "clases"; // nombre de la vista
    }
}
