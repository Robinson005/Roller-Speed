package com.rollerspeed.controller;

import com.rollerspeed.model.Instructor;
import com.rollerspeed.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    @GetMapping("instructor")
    public String instructor(Model model) {
        List<Instructor> instructores = instructorRepository.findAll();
        model.addAttribute("instructores", instructores);
        return "instructor";
    }
}
