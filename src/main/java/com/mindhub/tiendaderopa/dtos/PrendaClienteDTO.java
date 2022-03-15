package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Prenda;
import com.mindhub.tiendaderopa.modelos.PrendaCliente;

import java.util.List;
import java.util.Set;

public class PrendaClienteDTO {

    private int cant;
    List<Prenda> prendas;


    public PrendaClienteDTO() {
    }

    public PrendaClienteDTO(PrendaCliente prendaCliente) {
        this.cant = prendaCliente.getCant();
        this.prendas = prendaCliente.getPrendas();
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }
}
