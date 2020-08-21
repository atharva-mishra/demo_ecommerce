package com.ecommerce.demo.controllers;

import com.ecommerce.demo.DTO.UserRegistrationDTO;
import com.ecommerce.demo.modals.Products;
import com.ecommerce.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/www.shopping.com")
public class CustomerController
{
    @Autowired
    private UserService userService;

    public CustomerController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationform(Model model){
        model.addAttribute("user",new UserRegistrationDTO());
        return "registration";
    }

    @PostMapping("/submit")
    public String UserRegistration(@ModelAttribute("user") UserRegistrationDTO userRegistrationDTO){
        userService.save(userRegistrationDTO);
        return "redirect:/www.shopping.com/IndexPage";
    }

    /*controller to show index page of website to customers*/
    @GetMapping("/IndexPage")
    public String ViewIndexPage(Model model)
    {
        List<Products> products= userService.ReturnProducts();
        model.addAttribute("ListOfProducts",products);
        return "MyEcommerce";
    }
}
