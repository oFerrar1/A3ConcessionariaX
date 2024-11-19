package com.projeto_faculdade.concessionariaA3.dto;
import org.springframework.beans.BeanUtils;

import com.projeto_faculdade.concessionariaA3.entity.entity_concessionarias;


public class ConcessionariasDTO {

    private Long id;

    private int cnpj;
   
    private String name;

    private String pais;

    private String estado;

    private String endereco;

    private int qntd_estoque;

    // transforma a DTO em Entity
public ConcessionariasDTO (entity_concessionarias concessionarias){
        ConcessionariasDTO aThis = this;
    BeanUtils.copyProperties(concessionarias, aThis);
}

public ConcessionariasDTO(){
    
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQntd_estoque() {
        return qntd_estoque;
    }

    public void setQntd_estoque(int qntd_estoque) {
        this.qntd_estoque = qntd_estoque;
    }


    


}
