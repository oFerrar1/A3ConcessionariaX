package com.projeto_faculdade.concessionariaA3.dto;

import org.springframework.beans.BeanUtils;

import com.projeto_faculdade.concessionariaA3.entity.entity_estoque;

public class EstoqueDTO {

    private int id_produto;
      private int cnpj;
      private String tipo_produto;
      private String placa;
      private String modelo;
      private String cor;
      private float valor;

      // transforma a DTO em Entity
public EstoqueDTO (entity_estoque estoque){
        EstoqueDTO aThis = this;
    BeanUtils.copyProperties(estoque, aThis);
}

public EstoqueDTO(){
    
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


}
