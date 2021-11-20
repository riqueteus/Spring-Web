package com.example.springbootweb.controllers;

import javax.servlet.http.HttpServletResponse;

import com.example.springbootweb.models.Administrador;
import com.example.springbootweb.repository.AdministradoresRepository;
import com.example.springbootweb.service.CookieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private AdministradoresRepository repository;

    @GetMapping("/login")
    public String index(){
        return "login/index";
    }

    @PostMapping("/logar")
    public String logar(Model model, Administrador admParam, String lembrar, HttpServletResponse response){
        Administrador adm = this.repository.Login(admParam.getEmail(), admParam.getSenha());
        if(adm != null){
            CookieService.setCookie(response, "usuariosId", String.valueOf(adm.getId()), 10 );
            return "redirect:/";
        }
        model.addAttribute("erro", "Usuário ou Senha Inválidos");
        return "login/index";
    }
    
    
}
