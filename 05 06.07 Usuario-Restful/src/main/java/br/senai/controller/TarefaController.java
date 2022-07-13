package br.senai.controller;

import br.senai.model.Tarefa;
import br.senai.service.TarefaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TarefaController {

    @Autowired
    TarefaServiceImpl tarefaService;

    @GetMapping("/tarefa")
    public List<Tarefa> findAll(){
        return tarefaService.findAll();
    }

    @GetMapping("/tarefa/{id}")
    public Optional<Tarefa> findById(@PathVariable Long id){
        return tarefaService.findById(id);
    }

    @PostMapping("/tarefa")
    public Tarefa create(@RequestBody Tarefa tarefa){
        return tarefaService.create(tarefa);
    }

    @PutMapping("/tarefa/{id}")
    public Tarefa update(@RequestBody Tarefa tarefa, @PathVariable Long id){
        return tarefaService.update(tarefa, id);
    }

    @DeleteMapping("/tarefa/{id}")
    public void delete(@PathVariable Long id){
        tarefaService.deleteById(id);
    }

}
