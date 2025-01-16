package com.web.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // http://localhost:8080/KatsuGuide
    @GetMapping("/KatsuGuide")
    public String home(Model model) {
        return "Home"; //
    }
}