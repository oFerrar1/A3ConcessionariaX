package com.projeto_faculdade.concessionariaA3.entity;
import org.springframework.beans.BeanUtils;

import com.projeto_faculdade.concessionariaA3.dto.EstoqueDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class entity_estoque{

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int   id_produto;

    // aqui vai ser a conexão com a tabela concessionarias
    @Column(name = "cnpj", nullable = false, unique = true)
    private int cnpj;

    @Column(name = "tipo_produto", nullable = false)
    private String tipo_produto;

    @Column(name = "placa", nullable = false)
    private String placa;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "cor", nullable = false)
    private String cor;

    @Column(name = "valor", nullable = false)
    private float valor;

// transforma a entity em DTO
public entity_estoque (EstoqueDTO estoque){
    BeanUtils.copyProperties(estoque, this);
}

public entity_estoque(){
    
}

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id_produto;
        hash = 17 * hash + this.cnpj;
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
        final entity_estoque other = (entity_estoque) obj;
        if (this.id_produto != other.id_produto) {
            return false;
        }
        return this.cnpj == other.cnpj;
    }
  
    


    
}
