package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Carrito;

public class CarritoDTO {

    private String nombrePrenda;
    private int balance;
    private int stock;

    public CarritoDTO(Carrito carrito) {
        this.nombrePrenda = carrito.getNombrePrenda();
        this.balance = carrito.getBalance();
        this.stock = carrito.getStock();
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
