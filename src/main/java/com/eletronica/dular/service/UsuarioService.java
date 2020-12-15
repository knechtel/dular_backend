package com.eletronica.dular.service;

import com.eletronica.dular.DAO.UsuarioDAO;
import com.eletronica.dular.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
@Service
public class UsuarioService {
    @Autowired
    private UsuarioDAO usuarioDAO;

    public Usuario create(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDAO.findAll();
    }
}
