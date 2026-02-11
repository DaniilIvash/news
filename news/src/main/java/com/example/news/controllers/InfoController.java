package com.example.news.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О сайте");
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("title", "Контакты");
        return "contacts";
    }

    @GetMapping("/policy")
    public String policy(Model model) {
        model.addAttribute("title", "Политика конфиденциальности");
        return "policy";
    }
}
