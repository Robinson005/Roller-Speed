package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramaciónClases {

    @GetMapping("/class-schedule")
    public String classSchedule(Model model) {
        return "class_schedule"; // nombre de la vista
    }
}
