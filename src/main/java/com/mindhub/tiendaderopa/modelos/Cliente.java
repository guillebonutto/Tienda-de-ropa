package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long Id;

    private String nombre;
    private String apellido;
    private String email;
    private String password;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private Set<ClienteArticulo> clienteArticulos = new HashSet<>();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return Id;
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

    public Set<ClienteArticulo> getClienteArticulos() {
        return clienteArticulos;
    }

    public void setClienteArticulos(Set<ClienteArticulo> clienteArticulos) {
        this.clienteArticulos = clienteArticulos;
    }
}
