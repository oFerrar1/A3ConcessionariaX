package com.projeto_faculdade.concessionariaA3.entity;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.projeto_faculdade.concessionariaA3.dto.UsuariosDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class entity_usuarios{

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;



    //public entity_usuarios(String password, String username) {
      //  this.password = password;
       // this.username = username;
   // }

    // transforma a entity em DTO
    public entity_usuarios (UsuariosDTO usuarios){
         BeanUtils.copyProperties(usuarios, this);
    }

    public entity_usuarios(){
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final entity_usuarios other = (entity_usuarios) obj;
        return Objects.equals(this.id, other.id);
    }

 


    
}
