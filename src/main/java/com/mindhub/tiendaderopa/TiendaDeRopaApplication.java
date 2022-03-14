package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.*;

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
    public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, InventarioRepositorio inventarioRepositorio, CompraRepositorio compraRepositorio, ArticuloRepositorio articuloRepositorio) {
        return (args) -> {
            Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com", "lara");
            clienteRepositorio.save(cliente);

            Compra compra = new Compra(TipoCompra.TARJETA, LocalDateTime.now(), 1500, cliente);
            compraRepositorio.save(compra);

            Inventario inventario = new Inventario("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "../images.jpg");
            inventarioRepositorio.save(inventario);

            Articulo articulo = new Articulo(inventario.getNombrePrenda(), inventario.getPrecio(), 2, compra);
            articuloRepositorio.save(articulo);
        };
    }
}