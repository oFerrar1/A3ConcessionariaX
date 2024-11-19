package com.projeto_faculdade.concessionariaA3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_faculdade.concessionariaA3.dto.EstoqueDTO;
import com.projeto_faculdade.concessionariaA3.entity.entity_estoque;
import com.projeto_faculdade.concessionariaA3.repository.EstoqueRepository;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public List<EstoqueDTO> listarTodos(){

        List<entity_estoque> estoque = estoqueRepository.findAll();
        return estoque.stream().map(EstoqueDTO::new).toList();

    }


    public void inserir(EstoqueDTO estoque){
        entity_estoque Entity_estoque = new entity_estoque(estoque);
        estoqueRepository.save(Entity_estoque);
    
    }

    public EstoqueDTO alterar(EstoqueDTO estoque){
        entity_estoque Entity_estoque = new entity_estoque(estoque);
        return new EstoqueDTO(estoqueRepository.save(Entity_estoque));

    }

    public void excluir(Integer id){
        entity_estoque estoque = estoqueRepository.findById(id).get();
        estoqueRepository.delete(estoque);
    }

    public EstoqueDTO buscarPorId(Integer id) {
        return new EstoqueDTO(estoqueRepository.findById(id).get());
    }


}