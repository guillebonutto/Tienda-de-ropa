package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Articulo;
import com.mindhub.tiendaderopa.modelos.Talles;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;

public class ArticuloDTO {

    private String nombrePrenda;
    private int precio;
    private int stock;
    private Talles talle;
    private TipoArticulo tipoArticulo;

    public ArticuloDTO(Articulo articulo) {
        this.nombrePrenda = articulo.getNombrePrenda();
        this.precio = articulo.getPrecio();
        this.stock = articulo.getStock();
        this.talle = articulo.getTalle();
        this.tipoArticulo = articulo.getTipoArticulo();
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

    public Talles getTalle() {
        return talle;
    }

    public void setTalle(Talles talle) {
        this.talle = talle;
    }

    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }
}
