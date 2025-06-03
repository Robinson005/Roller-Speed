package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisionController {

    @GetMapping("/mission")
    public String mission(Model model) {
        return "mission"; // nombre de la vista
    }
}
