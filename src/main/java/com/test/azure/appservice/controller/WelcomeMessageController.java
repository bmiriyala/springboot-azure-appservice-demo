package com.test.azure.appservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {
    @GetMapping("/message")
    public String message(){
        return "Greetings! Application successfully deployed to Azure App Service.";
    }
}
