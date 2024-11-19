package com.projeto_faculdade.concessionariaA3.entity;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.projeto_faculdade.concessionariaA3.dto.ConcessionariasDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;





@Entity
public class entity_concessionarias{

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;

    // aqui vai ser uma chave estrangeira com a tabela estoque
    @Column (name = "cnpj", nullable = false, unique = true)
    private int cnpj;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "pais", nullable = false)
    private String pais;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    // aqui vai fazer uma contagem dos IDs registrados no estoque
    @Column(name = "qntd_estoque")
    private int qntd_estoque;

// transforma a entity em DTO
public entity_concessionarias (ConcessionariasDTO concessionarias){
        
    BeanUtils.copyProperties(concessionarias, this);
}
public entity_concessionarias(){
    
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + this.cnpj;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final entity_concessionarias other = (entity_concessionarias) obj;
        if (this.cnpj != other.cnpj) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }




}
