package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.PrendaCliente;

public class PrendaClienteDTO {


    private long idCliente;
    private long idPrenda;
    private int cant;

    public PrendaClienteDTO() {
    }

    public PrendaClienteDTO(PrendaCliente prendaCliente) {
        this.idCliente = idCliente;
        this.idPrenda = idPrenda;
        this.cant = cant;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(long idPrenda) {
        this.idPrenda = idPrenda;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
