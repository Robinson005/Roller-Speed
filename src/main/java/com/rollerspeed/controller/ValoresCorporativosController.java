package com.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValoresCorporativosController {

    @GetMapping("/corporate-values")
    public String corporateValues(Model model) {
        // Aquí puedes agregar atributos al modelo si es necesario
        model.addAttribute("title", "Valores Corporativos");
        model.addAttribute("description", "Información sobre los valores corporativos de la escuela Roller Speed.");
        
        // Retorna el nombre de la vista que se debe cargar
        return "corporate_values"; // nombre de la vista
    }
}
