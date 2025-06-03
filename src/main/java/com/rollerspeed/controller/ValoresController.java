package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValoresController {

    @GetMapping("/values")
    public String values(Model model) {
        return "values"; // nombre de la vista
    }
}
