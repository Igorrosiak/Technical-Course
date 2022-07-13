package br.senai.service;

import br.senai.model.Tarefa;

import java.util.List;
import java.util.Optional;

public interface TarefaService {

    public List<Tarefa> findAll();
    public Optional<Tarefa> findById(Long id);
    public Tarefa create(Tarefa newTarefa);
    public Tarefa update(Tarefa updatedTarefa, Long id);
    public void deleteById(Long id);
}
