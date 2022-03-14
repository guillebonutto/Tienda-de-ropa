package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Articulo;

public class ArticuloDTO {

    private long id;
    private long articuloId;

    private String nombrePrenda;
    private double precio;
    private int cant;
    private String imagen;

    public ArticuloDTO(Articulo articulo) {
        this.articuloId = articulo.getInventario().getId();
        this.nombrePrenda = articulo.getInventario().getNombrePrenda();
        this.precio = articulo.getPrecio();
        this.cant = articulo.getCant();
        this.imagen = articulo.getImagen();
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
