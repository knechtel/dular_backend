package com.eletronica.dular.DTO;

import com.eletronica.dular.domain.Usuario;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
public class UsuarioDTO {
    private Integer id;
    private String nome;
    private String senha;

    public UsuarioDTO(Integer id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    public UsuarioDTO(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public UsuarioDTO build(Usuario usuario){
        return new UsuarioDTO(usuario.getId(),usuario.getNome(),usuario.getSenha());
    }

    public Usuario toUsuario(UsuarioDTO usuarioDTO){
        return new Usuario(usuarioDTO.getId(),usuarioDTO.getNome(),usuarioDTO.getSenha());
    }
}
