package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;

import com.mindhub.tiendaderopa.repositorios.CompraArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.CompraRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class TiendaDeRopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaDeRopaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, ArticuloRepositorio articuloRepositorio, CompraRepositorio compraRepositorio, CompraArticuloRepositorio compraArticuloRepositorio) {
        return (args) -> {
            Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com", "lara");
            clienteRepositorio.save(cliente);

            Compra compra = new Compra(TipoCompra.TARJETA, LocalDateTime.now(), 1500, cliente);
            compraRepositorio.save(compra);

            Articulo articulo = new Articulo("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "../images.jpg");
            articuloRepositorio.save(articulo);

            CompraArticulo compraArticulo = new CompraArticulo(articulo.getNombrePrenda(), articulo.getPrecio(), 2, articulo, compra);
            compraArticuloRepositorio.save(compraArticulo);
        };
    }
}