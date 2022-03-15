package com.mindhub.tiendaderopa.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class PrendaCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private int cant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="compra_id")
    private Compra compra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "prendaCliente", fetch = FetchType.EAGER)
    List<Prenda> prendas = new ArrayList<>();



    public PrendaCliente() {
    }

    public PrendaCliente(List<Prenda> prendas, int cant, Compra compra, Cliente cliente) {
        this.prendas = prendas;
        this.cant = cant;
        this.compra = compra;
        this.cliente = cliente;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @JsonIgnore
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Prenda> getPrendas() {
        return this.prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }
}
