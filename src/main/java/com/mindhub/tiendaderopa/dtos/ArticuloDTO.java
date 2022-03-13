package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Articulo;
import com.mindhub.tiendaderopa.modelos.Talles;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;

import java.util.List;

public class ArticuloDTO {

    private String nombrePrenda;
    private int precio;
    private int stock;
    private TipoArticulo tipoArticulo;
    private List<String> talles;
    private byte[] imagen;



    public ArticuloDTO(Articulo articulo) {
        this.nombrePrenda = articulo.getNombrePrenda();
        this.precio = articulo.getPrecio();
        this.stock = articulo.getStock();
        this.tipoArticulo = articulo.getTipoArticulo();
        this.talles = articulo.getTalles();
        //this.imagen = articulo.getImagen();
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

    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public List<String> getTalles() {
        return talles;
    }

    public void setTalles(List<String> talles) {
        this.talles = talles;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
