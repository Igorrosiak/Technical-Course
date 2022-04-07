package br.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/equipe")
    public String equipe(){
        return "equipe";
    }

    @GetMapping("/clientes")
    public String clientes(){
        return "clientes";
    }

    @GetMapping("/projetos")
    public String projetos(){
        return "projetos";
    }
}
