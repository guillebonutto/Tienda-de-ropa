package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Articulo;

public class ArticuloDTO {

    private String nombrePrenda;
    private int precio;
    private int stock;

    public ArticuloDTO(Articulo articulo) {
        this.nombrePrenda = articulo.getNombrePrenda();
        this.precio = articulo.getPrecio();
        this.stock = articulo.getStock();
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
}
