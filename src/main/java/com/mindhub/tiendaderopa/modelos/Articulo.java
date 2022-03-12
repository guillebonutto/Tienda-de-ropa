package com.mindhub.tiendaderopa.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String nombrePrenda;
    private int precio;
    private int stock;

    @ElementCollection
    @Column(name = "talles")
    private List<String> talles = new ArrayList<>();

    private TipoArticulo tipoArticulo;

    @Lob
    private byte[] imagen;

    @OneToMany(mappedBy = "articulo", fetch = FetchType.EAGER)
    private Set<ClienteArticulo> clienteArticulos = new HashSet<>();

    public Articulo() {
    }

    public Articulo(String nombrePrenda, int precio, int stock, TipoArticulo tipoArticulo, List<String> talles, byte[] imagen) {
        this.nombrePrenda = nombrePrenda;
        this.precio = precio;
        this.stock = stock;
        this.tipoArticulo = tipoArticulo;
        this.talles = talles;
        this.imagen = imagen;
    }

    public long getId() {
        return id;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Set<ClienteArticulo> getClienteArticulos() {
        return clienteArticulos;
    }

    public void setClienteArticulos(Set<ClienteArticulo> clienteArticulos) {
        this.clienteArticulos = clienteArticulos;
    }

    public List<String> getTalles() {
        return talles;
    }

    public void setTalles(List<String> talles) {
        this.talles = talles;
    }

    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public byte[] getImagen() {
     return imagen;  }

    public void setImagen(byte[] imagen){
    this.imagen = imagen; }
}
