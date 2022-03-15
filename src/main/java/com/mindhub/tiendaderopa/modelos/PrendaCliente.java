package com.mindhub.tiendaderopa.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class PrendaCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private long idCliente;
    private long idPrenda;
    private int cant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="compra_id")
    Compra compra;

    public PrendaCliente() {
    }

    public PrendaCliente(long idCliente, long idPrenda, int cant, Compra compra) {
        this.idCliente = idCliente;
        this.idPrenda = idPrenda;
        this.cant = cant;
        this.compra = compra;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(long idPrenda) {
        this.idPrenda = idPrenda;
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
}
