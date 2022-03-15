package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class TiendaDeRopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaDeRopaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, PrendaRepositorio prendaRepositorio, CompraRepositorio compraRepositorio, ArticuloRepositorio articuloRepositorio) {
        return (args) -> {
            Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com", "lara");
            clienteRepositorio.save(cliente);

            Compra compra = new Compra(TipoCompra.TARJETA, LocalDateTime.now(), 1500, cliente);
            compraRepositorio.save(compra);

<<<<<<< HEAD

            Inventario inventario = new Inventario("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fwp-content%2Fuploads%2FCapture-248.png&imgrefurl=https%3A%2F%2Fes.acervolima.com%2Fmetodo-de-archivo-getpath-en-java-con-ejemplos%2F&tbnid=ywmkQ1fiJ0Ye7M&vet=12ahUKEwi7_8b15MP2AhU7N7kGHcDQDl8QMygBegUIARC7AQ..i&docid=L4K2n2bcn09hjM&w=625&h=76&q=que%20es%20getpath%20en%20java&ved=2ahUKEwi7_8b15MP2AhU7N7kGHcDQDl8QMygBegUIARC7AQ");
            inventarioRepositorio.save(inventario);



            Articulo articulo = new Articulo(inventario.getNombrePrenda(), inventario.getPrecio(), 2, inventario, compra,"https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fwp-content%2Fuploads%2FCapture-248.png&imgrefurl=https%3A%2F%2Fes.acervolima.com%2Fmetodo-de-archivo-getpath-en-java-con-ejemplos%2F&tbnid=ywmkQ1fiJ0Ye7M&vet=12ahUKEwi7_8b15MP2AhU7N7kGHcDQDl8QMygBegUIARC7AQ..i&docid=L4K2n2bcn09hjM&w=625&h=76&q=que%20es%20getpath%20en%20java&ved=2ahUKEwi7_8b15MP2AhU7N7kGHcDQDl8QMygBegUIARC7AQ");
            articuloRepositorio.save(articulo);
=======
            Prenda prenda = new Prenda("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "../images.jpg");
            prendaRepositorio.save(prenda);
/*
            PrendaCliente prendaCliente = new PrendaCliente(prenda.getNombrePrenda(), prenda.getPrecio(), 2, compra);
            articuloRepositorio.save(prendaCliente);*/
>>>>>>> 72bb799f0547899bb2570f98a7cc069e1d47956e
        };
    }
}