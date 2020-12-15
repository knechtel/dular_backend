package com.eletronica.dular.service;

import com.eletronica.dular.DAO.OrdemServicoDAO;
import com.eletronica.dular.domain.OrdemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 12/15/20.
 */
@Service
public class OrdemServicoService {
    @Autowired
    private OrdemServicoDAO ordemServicoDAO;

    public OrdemServico create(OrdemServico ordemServico) {
        return ordemServicoDAO.save(ordemServico);
    }
    public List<OrdemServico> findAll(){
        return (List<OrdemServico>) ordemServicoDAO.findAll();
    }
}
