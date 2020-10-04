package com.bank.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myCoolBank")
public class MainController {

    @GetMapping("/")
    public String homePage()
    {
        return "HomePage";
    }

}
