package org.jspiders.securityapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String getMessage(){
        return "welcome to app";
    }

    @GetMapping("/admin")
    public String adminInfo(){
        return "<h1> WELCOME IN ADMIN APP()</h1>";
    }

    @GetMapping("/employee")
    public String employeeInfo(){
        return "<h1> WELCOME IN EMPLOYEE APP()</h1>";
    }
}
