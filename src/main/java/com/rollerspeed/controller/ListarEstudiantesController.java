package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListarEstudiantesController {

    @GetMapping("/list-students")
    public String listStudents(Model model) {
        return "list_students"; // nombre de la vista
    }
}
