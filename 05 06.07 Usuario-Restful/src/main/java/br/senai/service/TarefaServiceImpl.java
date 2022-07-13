package br.senai.service;

import br.senai.model.Tarefa;
import br.senai.model.Usuario;
import br.senai.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaServiceImpl implements TarefaService{

    @Autowired
    TarefaRepository tarefaRepository;

    @Override
    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    @Override
    public Optional<Tarefa> findById(Long id) {
        return tarefaRepository.findById(id);
    }

    @Override
    public Tarefa create(Tarefa newTarefa) {
        return tarefaRepository.save(newTarefa);
    }

    @Override
    public Tarefa update(Tarefa updatedTarefa, Long id) {
        Optional<Tarefa> tAuxiliar = tarefaRepository.findById(id);
        if (tAuxiliar.isEmpty()){
            return null;
        }

        tAuxiliar.get().setNome(updatedTarefa.getNome());
        tAuxiliar.get().setDescricao(updatedTarefa.getDescricao());
        tAuxiliar.get().setDataCriacao(updatedTarefa.getDataCriacao());
        tAuxiliar.get().setDataEntrega(updatedTarefa.getDataEntrega());
        return tarefaRepository.save(tAuxiliar.get());

    }

    @Override
    public void deleteById(Long id) {
        tarefaRepository.deleteById(id);
    }
}


