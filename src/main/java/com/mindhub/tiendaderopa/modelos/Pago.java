package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private LocalDateTime fechayHora;
    private TipoPago tipo;
    private double monto;
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "pagos_id", updatable = false)
    private Cliente cliente;

/*    @OneToMany(mappedBy = "pagos", fetch = FetchType.EAGER)
    private Set<Articulo> articulos = new HashSet<>();*/

    public Pago() {
    }

    public Pago(TipoPago tipo, LocalDateTime fechayHora, double monto, String descripcion) {
        this.tipo = tipo;
        this.fechayHora = fechayHora;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
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
