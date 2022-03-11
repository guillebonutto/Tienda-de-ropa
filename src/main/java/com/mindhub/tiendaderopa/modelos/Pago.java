package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private TipodePago tipo;
    private LocalDateTime fechayHora;
    private double monto;
    private String descripcion;

    public Pago() {
    }

    public Pago(TipodePago tipo, LocalDateTime fechayHora, double monto, String descripcion) {
        this.tipo = tipo;
        this.fechayHora = fechayHora;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public TipodePago getTipo() {
        return tipo;
    }

    public void setTipo(TipodePago tipo) {
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
