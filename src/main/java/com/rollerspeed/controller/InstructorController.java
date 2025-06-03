package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstructorController {
    @GetMapping("/instructor")
    public String instructor(Model model) {
       return "instructor"; // nombre de la vista
    }
}
