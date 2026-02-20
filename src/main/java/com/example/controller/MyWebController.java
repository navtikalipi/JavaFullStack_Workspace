package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }

    @RequestMapping("/players")
    public String players() {
        return "players.html";
    }

    @RequestMapping("/matches")
    public String matches() {
        return "matches.html";
    }
}
