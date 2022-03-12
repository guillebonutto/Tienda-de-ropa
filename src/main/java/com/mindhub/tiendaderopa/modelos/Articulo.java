package com.mindhub.tiendaderopa.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


    @ManyToOne(fetch = FetchType.EAGER)
<<<<<<< HEAD
    @JoinColumn(name = "pagos_id")
    private Set<Compra> pagos = new HashSet<>();
*/
=======
    @JoinColumn(name = "articulos_id")
    private Pago pago;

>>>>>>> b72d4db413a9e9cfef09c3def2f588cd8fb4b58b

    public Articulo() {
    }

    public Articulo(String nombrePrenda, int precio, int stock, TipoArticulo tipoArticulo, List<String> talles) {
        this.nombrePrenda = nombrePrenda;
        this.precio = precio;
        this.stock = stock;
        this.tipoArticulo = tipoArticulo;
        this.talles = talles;
    }

/*
public Articulo(String nombrePrenda, int precio, int stock, TipoArticulo tipoArticulo, List<String> talles, Set<Compra> pagos) {
    this.nombrePrenda = nombrePrenda;
    this.precio = precio;
    this.stock = stock;
    this.tipoArticulo = tipoArticulo;
    this.talles = talles;
    this.pagos = pagos;
}
*/

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

<<<<<<< HEAD
/*    @JsonIgnore
    public Set<Compra> getPagos() {
        return pagos;
    }

    public void setPagos(Set<Compra> pagos) {
        this.pagos = pagos;
    }*/
=======
    @JsonIgnore
    public Pago getPagos() {
        return pago;
    }

    public void setPagos(Pago pago) {
        this.pago = pago;
    }
>>>>>>> b72d4db413a9e9cfef09c3def2f588cd8fb4b58b

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


}
