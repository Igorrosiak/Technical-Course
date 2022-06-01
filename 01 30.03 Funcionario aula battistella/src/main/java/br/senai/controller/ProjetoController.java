package br.senai.controller;

import br.senai.model.Projeto;
import br.senai.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @GetMapping("/projeto/list")
    public String findAll(Model model){
        model.addAttribute("projetos", projetoService.findAll());
        return "projeto/list";
    }

    @GetMapping("/projeto/add")
    public String add(Model model) {
        model.addAttribute("projeto", new Projeto());
        return "projeto/add";
    }

    @GetMapping("/projeto/edit/{id}")
    public String edit(Model model, @PathVariable long id) {
        model.addAttribute("funcionario", projetoService.findById(id));
        return "projeto/edit";
    }

    @PostMapping("/projeto/save")
    public String save(Projeto projeto, Model model){
        try {
            projetoService.save(projeto);
            model.addAttribute("projeto", projeto);
            model.addAttribute("isSaved", true);
            return "projeto/add";
        } catch(Exception e){
            model.addAttribute("projeto", projeto);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "projeto/add";
        }
    }

}
