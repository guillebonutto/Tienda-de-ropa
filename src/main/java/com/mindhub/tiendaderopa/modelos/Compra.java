package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private LocalDateTime fechayHora;
    private TipoCompra tipo;
    private double monto;


/*    @OneToOne
    @JoinColumn(name = "pagos_id", updatable = false)
    private Cliente cliente;*/

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Cliente cliente;

    /*@OneToMany(mappedBy = "compra", fetch = FetchType.EAGER)
    private Set<Articulo> articulos = new HashSet<>();*/

    public Compra() {
    }

    public Compra(TipoCompra tipo, LocalDateTime fechayHora, double monto) {
        this.tipo = tipo;
        this.fechayHora = fechayHora;
        this.monto = monto;

    }

    public long getId() {
        return id;
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


}
