package com.eletronica.dular.DAO;

import com.eletronica.dular.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
}
