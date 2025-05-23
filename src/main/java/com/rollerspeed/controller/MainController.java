     package com.rollerspeed.controller;

     import org.springframework.stereotype.Controller;
     import org.springframework.ui.Model;
     import org.springframework.web.bind.annotation.GetMapping;

     @Controller
     public class MainController {

         @GetMapping("/")
         public String home(Model model) {
             return "index"; // nombre de la vista
         }

         @GetMapping("/mision")
         public String mision(Model model) {
             return "mision"; // nombre de la vista
         }

         @GetMapping("/vision")
         public String vision(Model model) {
             return "vision"; // nombre de la vista
         }

         @GetMapping("/valores")
         public String valores(Model model) {
             return "valores"; // nombre de la vista
         }

         @GetMapping("/servicios")
         public String servicios(Model model) {
             return "servicios"; // nombre de la vista
         }

         @GetMapping("/eventos")
         public String eventos(Model model) {
             return "eventos"; // nombre de la vista
         }
    }
