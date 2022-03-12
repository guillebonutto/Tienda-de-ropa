package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.ClienteArticulo;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;

import java.util.Set;

public class ClienteArticuloDTO {

    private long id;
    private long articulo_id;
    private TipoArticulo tipo;
    private String nombre;
    private double precio;
    private int cant;


    public ClienteArticuloDTO(ClienteArticulo clienteArticulo) {
        this.id = clienteArticulo.getId();
        this.articulo_id = clienteArticulo.getId();
        this.tipo = clienteArticulo.getTipo();
        this.nombre = clienteArticulo.getNombre();
        this.precio = clienteArticulo.getPrecio();
        this.cant = clienteArticulo.getCant();

    }

    public long getId() {
        return id;
    }

    public long getArticulo_id() {
        return articulo_id;
    }

    public TipoArticulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoArticulo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
