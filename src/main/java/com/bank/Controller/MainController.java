package com.bank.Controller;

import com.bank.Entity.User;
import com.bank.Service.BankService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    private BankService aService;

    public MainController(BankService aService) {
        this.aService = aService;
    }

    @GetMapping("/login")
    public String homePage()
    {
        return "LoginPage.html";
    }

    @GetMapping("/addUser")
    public String showAddUserForm(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "AddUser.html";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User theUser )
    {
        System.out.println(theUser.getFirstName());
        System.out.println(theUser.getLastName());
        System.out.println(theUser.getDob());
        System.out.println(theUser.getSsn());
        System.out.println(theUser.getUserId());
        System.out.println(theUser.getEmail());
        System.out.println(theUser.getAddress());
        System.out.println(theUser.getPassword());
        aService.addUser(theUser);
        return "redirect:/login";
    }

}
