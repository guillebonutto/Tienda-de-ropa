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

            Compra compra = new Compra(TipoCompra.TARJETA, LocalDateTime.now(), 1500);
            compraRepositorio.save(compra);

            Prenda prenda = new Prenda("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "bb");
            prendaRepositorio.save(prenda);

/*            Set<Prenda> prendas = new HashSet<>();
            prendas.add(prenda);*/
            PrendaCliente prendaCliente = new PrendaCliente(Arrays.asList(prenda), 100, compra, cliente);
            prendaClienteRepositorio.save(prendaCliente);

            System.out.println(prenda);
        };
    }
}