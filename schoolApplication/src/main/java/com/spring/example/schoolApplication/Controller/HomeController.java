package com.spring.example.schoolApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value={"","/","/home"})
    public String getHomePage(Model model){ // model is an interface inside spring mvc which acts as a container between ui and backend
        model.addAttribute("username","Kavitha Kalisetti, Ram Kalisetti");
        return "home.html";
    }
}
