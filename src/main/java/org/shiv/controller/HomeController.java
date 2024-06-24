package org.shiv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome to Home</h1>";
    }
    @GetMapping("/admin")
    public String homeAdmin(){
        return "<h1>Welcome to Home Admin</h1>";
    }
    @GetMapping("user/")
    public String homeUser(){
        return "<h1>Welcome to Home User</h1>";
    }
}
