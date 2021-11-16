package com.example.springbootweb.controllers;

import java.util.List;

import com.example.springbootweb.models.Administrador;
import com.example.springbootweb.repository.AdministradoresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdministradoresController {

    @Autowired
    private AdministradoresRepository repository;

    @GetMapping("/administradores")
    public String index(Model model){
        List<Administrador> administradores = (List<Administrador>)repository.findAll();
        model.addAttribute("administradores", administradores);
        return "administradores/index";

    }
    
}
