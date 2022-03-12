package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Compra;
import com.mindhub.tiendaderopa.modelos.TipoCompra;

import java.time.LocalDateTime;

public class PagoDTO {

    private TipoCompra tipo;
    private LocalDateTime fechayHora;
    private double monto;
    private String descripcion;

    public PagoDTO(Compra pago) {
        this.tipo = pago.getTipo();
        this.fechayHora = pago.getFechayHora();
        this.monto = pago.getMonto();
        this.descripcion = pago.getDescripcion();
    }

    public TipoCompra getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompra tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(LocalDateTime fechayHora) {
        this.fechayHora = fechayHora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
