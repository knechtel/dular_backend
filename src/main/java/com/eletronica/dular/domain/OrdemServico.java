package com.eletronica.dular.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by maiquelknechtel on 12/9/20.
 */

public class OrdemServico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Tecnico tecnico;
    private Usuario usuarioEntrada;
    private Usuario usuarioSaida;
    private List<Aparelho> listAparelho;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private LocalDate dataEntradaGarantia;
    private LocalDate dataSaidaGarantia;
    private String obs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
