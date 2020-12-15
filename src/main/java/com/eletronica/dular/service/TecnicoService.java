package com.eletronica.dular.service;

import com.eletronica.dular.DAO.TecnicoDAO;
import com.eletronica.dular.domain.Tecnico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 12/15/20.
 */
@Service
public class TecnicoService {
    @Autowired
    private TecnicoDAO tecnicoDAO;

    public Tecnico create(Tecnico tecnico){
        return tecnicoDAO.save(tecnico);
    }
    public List<Tecnico> findAll(){
        return(List<Tecnico>) tecnicoDAO.findAll();
    }
}
