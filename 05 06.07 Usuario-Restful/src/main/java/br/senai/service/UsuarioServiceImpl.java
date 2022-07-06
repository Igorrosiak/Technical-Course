package br.senai.service;

import br.senai.model.Usuario;
import br.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario create(Usuario newUsuario) {
        return null;
    }

    @Override
    public Usuario update(Usuario updatedUsuario, Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
