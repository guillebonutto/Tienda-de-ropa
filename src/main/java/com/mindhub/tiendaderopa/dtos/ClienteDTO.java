package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Prenda;
import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Compra;
import com.mindhub.tiendaderopa.modelos.PrendaCliente;

import java.util.Set;

public class ClienteDTO {

    private String nombre;
    private String apellido;
    private String email;
    private String password;
    Set<PrendaCliente> prendaClientes;

    public ClienteDTO(Cliente cliente) {
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
        this.email = cliente.getEmail();
        this.password = cliente.getPassword();
        this.prendaClientes = cliente.getPrendaClientes();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<PrendaCliente> getPrendaClientes() {
        return prendaClientes;
    }

    public void setPrendaClientes(Set<PrendaCliente> prendaClientes) {
        this.prendaClientes = prendaClientes;
    }
}
