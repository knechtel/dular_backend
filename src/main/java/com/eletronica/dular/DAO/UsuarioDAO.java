package com.eletronica.dular.DAO;

import com.eletronica.dular.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
@Repository
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
}
