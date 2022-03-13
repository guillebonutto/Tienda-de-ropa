package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Inventario;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;

import java.util.List;

public class InventarioDTO {

    private String nombrePrenda;
    private double precio;
    private int stock;
    private TipoArticulo tipoArticulo;
    private List<String> talles;


    public InventarioDTO(Inventario inventario) {
        this.nombrePrenda = inventario.getNombrePrenda();
        this.precio = inventario.getPrecio();
        this.stock = inventario.getStock();
        this.tipoArticulo = inventario.getTipoArticulo();
        this.talles = inventario.getTalles();
        //this.imagen = inventario.getImagen();
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
}
