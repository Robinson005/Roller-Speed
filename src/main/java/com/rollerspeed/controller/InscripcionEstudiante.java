package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InscripcionEstudiante {

    @GetMapping("/student-enrollment")
    public String studentEnrollment(Model model) {
        return "student_enrollment"; // nombre de la vista
    }
}
