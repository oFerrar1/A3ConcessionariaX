package com.projeto_faculdade.concessionariaA3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_faculdade.concessionariaA3.dto.ConcessionariasDTO;
import com.projeto_faculdade.concessionariaA3.entity.entity_concessionarias;
import com.projeto_faculdade.concessionariaA3.repository.ConcessionariasRepository;


@Service
public class ConcessionariasService {

    @Autowired
    private ConcessionariasRepository concessionariasRepository;

    public List<ConcessionariasDTO> listarTodos(){

        List<entity_concessionarias> concessionarias = concessionariasRepository.findAll();
        return concessionarias.stream().map(ConcessionariasDTO::new).toList();

    }


    public void inserir(ConcessionariasDTO concessionarias){
        entity_concessionarias entity_concessionarias = new entity_concessionarias(concessionarias);
        concessionariasRepository.save(entity_concessionarias);
    
    }

    public ConcessionariasDTO alterar(ConcessionariasDTO concessionarias){
        entity_concessionarias entity_concessionarias = new entity_concessionarias(concessionarias);
        return new ConcessionariasDTO(concessionariasRepository.save(entity_concessionarias));

    }

    public void excluir(Long id){
        entity_concessionarias concessionarias = concessionariasRepository.findById(id).get();
        concessionariasRepository.delete(concessionarias);
    }

    public ConcessionariasDTO buscarPorId(Long id) {
        return new ConcessionariasDTO(concessionariasRepository.findById(id).get());
    }


}
