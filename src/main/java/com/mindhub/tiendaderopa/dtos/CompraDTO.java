package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Compra;
import com.mindhub.tiendaderopa.modelos.CompraArticulo;
import com.mindhub.tiendaderopa.modelos.TipoCompra;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CompraDTO {

    private TipoCompra tipo;
    private LocalDateTime fechayHora;
    private double monto;

    private Set<CompraArticuloDTO> compraArticulos;


    public CompraDTO(Compra pago) {
        this.tipo = pago.getTipo();
        this.fechayHora = pago.getFechayHora();
        this.monto = pago.getMonto();
        this.compraArticulos = pago.getCompraArticulos().stream().map(CompraArticuloDTO::new).collect(Collectors.toSet());
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

    public Set<CompraArticuloDTO> getCompraArticulos() {
        return compraArticulos;
    }

    public void setCompraArticulos(Set<CompraArticuloDTO> compraArticulos) {
        this.compraArticulos = compraArticulos;
    }
}
