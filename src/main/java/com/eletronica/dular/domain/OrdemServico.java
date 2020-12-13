package com.eletronica.dular.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by maiquelknechtel on 12/9/20.
 */
@Entity
public class OrdemServico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Tecnico tecnico;
    @OneToOne
    private Usuario usuarioEntrada;
    @OneToOne
    private Usuario usuarioSaida;
    @OneToMany
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

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Usuario getUsuarioEntrada() {
        return usuarioEntrada;
    }

    public void setUsuarioEntrada(Usuario usuarioEntrada) {
        this.usuarioEntrada = usuarioEntrada;
    }

    public Usuario getUsuarioSaida() {
        return usuarioSaida;
    }

    public void setUsuarioSaida(Usuario usuarioSaida) {
        this.usuarioSaida = usuarioSaida;
    }

    public List<Aparelho> getListAparelho() {
        return listAparelho;
    }

    public void setListAparelho(List<Aparelho> listAparelho) {
        this.listAparelho = listAparelho;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataEntradaGarantia() {
        return dataEntradaGarantia;
    }

    public void setDataEntradaGarantia(LocalDate dataEntradaGarantia) {
        this.dataEntradaGarantia = dataEntradaGarantia;
    }

    public LocalDate getDataSaidaGarantia() {
        return dataSaidaGarantia;
    }

    public void setDataSaidaGarantia(LocalDate dataSaidaGarantia) {
        this.dataSaidaGarantia = dataSaidaGarantia;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
