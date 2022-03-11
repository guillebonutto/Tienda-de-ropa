package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String nombrePrenda;
    private int precio;
    private int stock;
    private Talles talle;
    private TipoArticulo tipoArticulo;

    public Articulo() {
    }

    public Articulo(String nombrePrenda, int precio, int stock, Talles talle, TipoArticulo tipoArticulo){
        this.nombrePrenda = nombrePrenda;
        this.precio = precio;
        this.stock = stock;
        this.talle = talle;
        this.tipoArticulo = tipoArticulo;
    }

    public Long getId() {
        return id;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Talles getTalle() { return talle;}

    public void setTalle(Talles talle) { this.talle = talle; }

    public TipoArticulo getTipoArticulo() { return tipoArticulo; }

    public void setTipoArticulo(TipoArticulo tipoArticulo) { this.tipoArticulo = tipoArticulo; }


}
