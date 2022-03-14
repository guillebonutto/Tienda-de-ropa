package com.mindhub.tiendaderopa.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String nombrePrenda;
    private double precio;
    private int cant;
    private String imagen;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "compra_id")
    Compra compra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "articulo_id")
    Inventario inventario;

    public Articulo() {
    }

    public Articulo(String nombrePrenda, double precio, int cant, Inventario inventario, Compra compra, String imagen) {
        this.nombrePrenda = nombrePrenda;
        this.precio = precio;
        this.cant = cant;
        this.inventario = inventario;
        this.compra = compra;
        this.imagen = imagen;

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
    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @JsonIgnore
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
