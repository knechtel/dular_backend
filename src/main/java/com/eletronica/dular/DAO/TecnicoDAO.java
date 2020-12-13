package com.eletronica.dular.DAO;

import com.eletronica.dular.domain.Tecnico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
@Repository
public interface TecnicoDAO extends CrudRepository<Tecnico, Integer> {
}
