package com.eletronica.dular.DAO;

import com.eletronica.dular.domain.Aparelho;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by maiquelknechtel on 12/13/20.
 */
public interface AparelhoDAO extends CrudRepository<Aparelho, Integer> {
}
