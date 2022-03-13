package com.mindhub.tiendaderopa.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class CompraArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String nombrePrenda;
    private double precio;
    private int cant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="compra_id")
    private Compra compra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="articulo_id")
    private Articulo articulo;

    public CompraArticulo() {
    }

    public CompraArticulo(String nombrePrenda, double precio, int cant, Articulo articulo, Compra compra) {
        this.nombrePrenda = nombrePrenda;
        this.precio = precio;
        this.cant = cant;
        this.articulo = articulo;
        this.compra = compra;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @JsonIgnore
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @JsonIgnore
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
