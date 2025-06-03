package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InscripcionInstructor {

    @GetMapping("/instructor-enrollment")
    public String instructorEnrollment(Model model) {
        return "instructor_enrollment"; // nombre de la vista
    }
}
