package com.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageContoller {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name","muskan");
        model.addAttribute("youtube_Channel", "Learn code with durgesh");
        model.addAttribute("github_Repository", "https://github.com/muskan3962");
        return "home";
    }
    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page loading");
        return "about";
    }
      @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page loading");
        return "services";
    }
}
