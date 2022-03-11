package com.mindhub.tiendaderopa.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.ClienteArticulo;

import java.util.Set;

public class ClienteDTO {
    private long id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String password;
    private Set<ClienteArticulo> clienteArticulos;

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
        this.correoElectronico = cliente.getCorreoElectronico();
        this.password = cliente.getPassword();
        this.clienteArticulos = cliente.getClienteArticulos();
    }

    public long getId() {
        return id;
    }

    public Set<ClienteArticulo> getClienteArticulos() {
        return clienteArticulos;
    }

    public void setClienteArticulos(Set<ClienteArticulo> clienteArticulos) {
        this.clienteArticulos = clienteArticulos;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectrónico) {
        this.correoElectronico = correoElectrónico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
