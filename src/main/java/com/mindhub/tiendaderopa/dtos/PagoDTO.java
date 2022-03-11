package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Pago;
import com.mindhub.tiendaderopa.modelos.TipoPago;

import java.time.LocalDateTime;

public class PagoDTO {

    private TipoPago tipo;
    private LocalDateTime fechayHora;
    private double monto;
    private String descripcion;

    public PagoDTO(Pago pago) {
        this.tipo = pago.getTipo();
        this.fechayHora = pago.getFechayHora();
        this.monto = pago.getMonto();
        this.descripcion = pago.getDescripcion();
    }

    public TipoPago getTipo() {
        return tipo;
    }

    public void setTipo(TipoPago tipo) {
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
