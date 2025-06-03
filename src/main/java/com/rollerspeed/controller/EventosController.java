package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventosController {

    @GetMapping("/events")
    public String events(Model model) {
        return "events"; // nombre de la vista
    }
}
