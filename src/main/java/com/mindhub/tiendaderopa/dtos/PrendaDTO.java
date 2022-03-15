package com.mindhub.tiendaderopa.dtos;

import com.mindhub.tiendaderopa.modelos.Prenda;
import com.mindhub.tiendaderopa.modelos.PrendaCliente;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrendaDTO {

    private String nombrePrenda;
    private double precio;
    private int stock;
    private TipoArticulo tipoArticulo;
    private List<String> talles;
    private String imagen;
<<<<<<< HEAD


    public PrendaDTO(Prenda inventario) {
        this.nombrePrenda = inventario.getNombrePrenda();
        this.precio = inventario.getPrecio();
        this.stock = inventario.getStock();
        this.tipoArticulo = inventario.getTipoArticulo();
        this.talles = inventario.getTalles();
        this.imagen = inventario.getImagen();

=======
    private Set <PrendaClienteDTO> prendaClientesDTO = new HashSet<>();


    public PrendaDTO(Prenda prenda) {
        this.nombrePrenda = prenda.getNombrePrenda();
        this.precio = prenda.getPrecio();
        this.stock = prenda.getStock();
        this.tipoArticulo = prenda.getTipoArticulo();
        this.talles = prenda.getTalles();
        this.imagen = prenda.getImagen();
       // this.prendaClientesDTO = prenda.getPrendaCliente().stream().map(PrendaClienteDTO::new).collect(Collectors.toSet());
>>>>>>> aa6a9de4c4b58166c50860bdcb425b53ef0fcf43
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public List<String> getTalles() {
        return talles;
    }

    public void setTalles(List<String> talles) {
        this.talles = talles;
    }

<<<<<<< HEAD
    public String getImagen() { return imagen;  }

    public void setImagen(String imagen) { this.imagen = imagen;}


    }
=======
    public String getImagen() {return imagen;}

    public void setImagen(String imagen) {this.imagen = imagen;}
}
>>>>>>> aa6a9de4c4b58166c50860bdcb425b53ef0fcf43
