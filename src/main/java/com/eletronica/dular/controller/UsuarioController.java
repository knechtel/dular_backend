package com.eletronica.dular.controller;

import com.eletronica.dular.DTO.UsuarioDTO;
import com.eletronica.dular.domain.Usuario;
import com.eletronica.dular.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioService.create(usuarioDTO.toUsuario(usuarioDTO));
        return new UsuarioDTO().build(usuario);
    }
}
