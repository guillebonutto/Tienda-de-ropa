package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class ClienteArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String tipo;
    private String nombre;
    private double precio;
    private int cant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    public ClienteArticulo() {
    }

    public ClienteArticulo(String tipo, String nombre, double precio, int cant, Cliente cliente, Articulo articulo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.cant = cant;
        this.cliente = cliente;
        this.articulo = articulo;
    }

    public long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
