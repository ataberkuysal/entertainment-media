package com.ata.entertainmentmedia.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Home View Returner
@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("")
    public String home(){
        return "home";
    }

}
