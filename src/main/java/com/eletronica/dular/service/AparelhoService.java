package com.eletronica.dular.service;

import com.eletronica.dular.DAO.AparelhoDAO;
import com.eletronica.dular.domain.Aparelho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 12/15/20.
 */
@Service
public class AparelhoService {
    @Autowired
    private AparelhoDAO aparelhoDAO;

    public Aparelho create(Aparelho aparelho) {
        return aparelhoDAO.save(aparelho);
    }

    public List<Aparelho> findAll() {
        return (List<Aparelho>) aparelhoDAO.findAll();
    }
}
