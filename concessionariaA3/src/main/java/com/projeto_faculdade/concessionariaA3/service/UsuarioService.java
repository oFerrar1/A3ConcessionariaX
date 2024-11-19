package com.projeto_faculdade.concessionariaA3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_faculdade.concessionariaA3.dto.UsuariosDTO;
import com.projeto_faculdade.concessionariaA3.entity.entity_usuarios;
import com.projeto_faculdade.concessionariaA3.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuariosDTO> listarTodos(){

        List<entity_usuarios> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(UsuariosDTO::new).toList();

    }


    public void inserir(UsuariosDTO usuarios){
        entity_usuarios Entity_usuarios = new entity_usuarios(usuarios);
        usuarioRepository.save(Entity_usuarios);
    
    }

    public UsuariosDTO alterar(UsuariosDTO usuarios){
        entity_usuarios Entity_usuarios = new entity_usuarios(usuarios);
        return new UsuariosDTO(usuarioRepository.save(Entity_usuarios));

    }

    public void excluir(Long id){
        entity_usuarios usuarios = usuarioRepository.findById(id).get();
        usuarioRepository.delete(usuarios);
    }

    public UsuariosDTO buscarPorId(Long id) {
        return new UsuariosDTO(usuarioRepository.findById(id).get());
    }


}
