package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Prenda;
import com.mindhub.tiendaderopa.modelos.PrendaCliente;

import java.util.List;
import java.util.Set;

public class PrendaClienteDTO {

    private int cant;
    Prenda prenda;


    public PrendaClienteDTO() {
    }

    public PrendaClienteDTO(PrendaCliente prendaCliente) {
        this.cant = prendaCliente.getCant();
        this.prenda = prendaCliente.getPrenda();
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }


}
