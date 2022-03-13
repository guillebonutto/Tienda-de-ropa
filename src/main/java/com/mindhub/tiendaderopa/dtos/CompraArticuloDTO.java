package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.CompraArticulo;

public class CompraArticuloDTO {

    private long id;
    private long articuloId;

    private String nombrePrenda;
    private double precio;
    private int cant;

    public CompraArticuloDTO(CompraArticulo compraArticulo) {
        this.articuloId = compraArticulo.getArticulo().getId();
        this.nombrePrenda = compraArticulo.getArticulo().getNombrePrenda();
        this.precio = compraArticulo.getPrecio();
        this.cant = compraArticulo.getCant();
    }

    public long getId() {
        return id;
    }

    public long getArticuloId() {
        return articuloId;
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
}
