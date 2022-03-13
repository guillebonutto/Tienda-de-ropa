package com.mindhub.tiendaderopa.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private LocalDateTime fechayHora;
    private TipoCompra tipo;
    private double monto;

    @OneToMany(mappedBy="compra", fetch=FetchType.EAGER)
    Set<CompraArticulo> compraArticulos =  new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Cliente cliente;


    public Compra() {
    }

    public Compra(TipoCompra tipo, LocalDateTime fechayHora, double monto, Cliente cliente) {
        this.tipo = tipo;
        this.fechayHora = fechayHora;
        this.monto = monto;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public TipoCompra getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompra tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(LocalDateTime fechayHora) {
        this.fechayHora = fechayHora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @JsonIgnore
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<CompraArticulo> getCompraArticulos() {
        return compraArticulos;
    }

    public void setCompraArticulos(Set<CompraArticulo>compraArticulos) {
        this.compraArticulos = compraArticulos;
    }
}
