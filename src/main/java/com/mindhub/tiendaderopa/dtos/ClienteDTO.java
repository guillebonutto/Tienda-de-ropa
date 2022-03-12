package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Articulo;
import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Compra;

import java.util.Set;

public class ClienteDTO {

    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private Set<Compra> compras;

    public ClienteDTO(Cliente cliente) {
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
        this.email = cliente.getEmail();
        this.password = cliente.getPassword();
        this.compras = cliente.getCompras();
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

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }
}
