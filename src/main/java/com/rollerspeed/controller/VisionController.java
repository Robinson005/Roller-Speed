package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisionController {

    @GetMapping("vision")
    public String vision(Model model) {
        return "vision"; // nombre de la vista
    }
}
