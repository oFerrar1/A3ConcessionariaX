package com.projeto_faculdade.concessionariaA3.dto;

import org.springframework.beans.BeanUtils;

import com.projeto_faculdade.concessionariaA3.entity.entity_usuarios;

public class UsuariosDTO {

    private Long id;

    private String username;

    private String password;

    // transforma a DTO em Entity
public UsuariosDTO (entity_usuarios usuarios){
    
    UsuariosDTO aThis = this;
    BeanUtils.copyProperties(usuarios, aThis);

}
public UsuariosDTO(){
    
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


}
