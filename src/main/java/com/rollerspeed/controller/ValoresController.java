package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValoresController {

    @GetMapping("/valores")
    public String valores(Model model) {
        return "valores"; // nombre de la vista
    }
}
