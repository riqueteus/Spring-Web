package com.example.springbootweb.controllers;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import com.example.springbootweb.service.CookieService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model, HttpServletRequest request) throws UnsupportedEncodingException{
        model.addAttribute("nome", CookieService.getCookie(request, "nomeUsuario"));
        return "home/index";
    }
    
    
}
