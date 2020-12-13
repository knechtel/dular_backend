package com.eletronica.dular.DAO;

import com.eletronica.dular.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
}
