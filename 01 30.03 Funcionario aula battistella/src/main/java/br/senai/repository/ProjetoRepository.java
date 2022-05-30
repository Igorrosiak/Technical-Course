package br.senai.repository;

import br.senai.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

    public Projeto findByCnpj(String cnpj);
    public Projeto findByNomeAndEndereco(String nome, String endereco);
    public List<Projeto> findByTelefoneLike(String telefone);
}
