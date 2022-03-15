package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class TiendaDeRopaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaDeRopaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, PrendaRepositorio prendaRepositorio, CompraRepositorio compraRepositorio, PrendaClienteRepositorio prendaClienteRepositorio) {
        return (args) -> {
            Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com", "lara");
            clienteRepositorio.save(cliente);

            Cliente administrador = new Cliente("admin","admin","admin@admin.com","1234");
            clienteRepositorio.save(administrador);

            Compra compra = new Compra(TipoCompra.TARJETA, LocalDateTime.now(), 1500);
            compraRepositorio.save(compra);

            Prenda prenda = new Prenda("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "ver");
            prendaRepositorio.save(prenda);

            Prenda carteraMarron = new Prenda("Cartera Marrón", 1000, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"ver");
            prendaRepositorio.save(carteraMarron);

            Prenda carteraNegra = new Prenda("Cartera Negra", 1200, 12,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"), "ver");
            prendaRepositorio.save(carteraNegra);

            Prenda zapatoMarron = new Prenda("Zapato Marron", 3000, 14, TipoArticulo.ZAPATOS,Arrays.asList("8","9","10","11","12"),"ver" );
            prendaRepositorio.save(zapatoMarron);

            Prenda zapatoNegro = new Prenda("Zapato Negro", 3500, 15, TipoArticulo.ZAPATOS, Arrays.asList("11","12"),"ver");
            prendaRepositorio.save(zapatoNegro);

            Prenda remeraBlanca = new Prenda("Remera Blanca",2000,5,TipoArticulo.REMERAS,Arrays.asList("S","M","L"),"ver");
            prendaRepositorio.save(remeraBlanca);

            Prenda remeraNegra = new Prenda("Remera Negra", 4800,7,TipoArticulo.REMERAS,Arrays.asList("XS","S","M","L","XL"),"ver");
            prendaRepositorio.save(remeraNegra);




/*            Set<Prenda> prendas = new HashSet<>();
            prendas.add(prenda);*/
            PrendaCliente prendaCliente = new PrendaCliente(prenda,100, compra, cliente);
            prendaClienteRepositorio.save(prendaCliente);

            System.out.println(prenda);
        };
    }
}