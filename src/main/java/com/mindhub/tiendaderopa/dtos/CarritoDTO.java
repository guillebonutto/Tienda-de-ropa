package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Carrito;

public class CarritoDTO {

    private String nombrePrenda;
    private String descripcion;
    private int cant;
    private double balance;

    public CarritoDTO(Carrito carrito) {
        this.nombrePrenda = carrito.getNombrePrenda();
        this.descripcion = carrito.getDescripcion();
        this.cant = carrito.getCant();
        this.balance = carrito.getBalance();
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
