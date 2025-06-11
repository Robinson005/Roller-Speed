package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisionController {

    @GetMapping("mision")
    public String mision(Model model) {
        return "mision"; // nombre de la vista
    }
}
