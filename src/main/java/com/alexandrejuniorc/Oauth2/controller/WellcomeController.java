package com.alexandrejuniorc.Oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {

    // This endpoint is public! Anyone can access it.
    @GetMapping("/wellcome")
    public String wellcome() {
        return "Wellcome to the Oauth2 Application";
    }

    // This endpoint is protected! Only authenticated users can access it.
    @GetMapping("/wellcome/protected")
    public String wellcomeProtected() {
        return "Wellcome to the Oauth2 Application - Protected";
    }

}
