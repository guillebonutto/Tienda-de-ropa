package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class TiendaDeRopaApplication {

    @Autowired
    PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(TiendaDeRopaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, PrendaRepositorio prendaRepositorio, CompraRepositorio compraRepositorio, PrendaClienteRepositorio prendaClienteRepositorio) {
        return (args) -> {
            Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com",passwordEncoder.encode("lara") );
            clienteRepositorio.save(cliente);

            Cliente administrador = new Cliente("admin","admin","admin@admin.com", passwordEncoder.encode("1234"));
            clienteRepositorio.save(administrador);

            Compra compra = new Compra(TipoCompra.TARJETA, LocalDateTime.now(), 1500);
            compraRepositorio.save(compra);

            Prenda prenda = new Prenda("Remera loli", 200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"), "ver");
            prendaRepositorio.save(prenda);

            Prenda carteraMarron = new Prenda("Cartera Color Marrón", 1000, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"https://tommyargentina.vteximg.com.br/arquivos/ids/186630-500-667/AW0AW04636_902_2.jpg?v=637708674978200000");
            prendaRepositorio.save(carteraMarron);

            Prenda carteraNegra = new Prenda("Cartera Color Negro", 1200, 12,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"), "ver");
            prendaRepositorio.save(carteraNegra);

            Prenda carteraMarronclaro = new Prenda("Cartera Color Marrón Claro",5000,20,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"agregar URL");
            prendaRepositorio.save(carteraMarronclaro);

            Prenda carteraBlanca = new Prenda("Cartera Color Blanco", 4000,15,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"agregar Url");
            prendaRepositorio.save(carteraBlanca);

            Prenda cintoMarron = new Prenda("Cinto Color Marrón", 900, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("S","M"),"ver");
            prendaRepositorio.save(cintoMarron);

            Prenda cintoNegro = new Prenda("Cinto Color Negro", 1000, 5, TipoArticulo.MARROQUINERIA,Arrays.asList("S","M"),"ver");
            prendaRepositorio.save(cintoNegro);

            Prenda cintoMarronClaro = new Prenda("Cinto Color Marrón Claro", 110, 8, TipoArticulo.MARROQUINERIA,Arrays.asList("S","M"),"ver");
            prendaRepositorio.save(cintoMarronClaro);

            Prenda cintoBlanco = new Prenda("Cinto Color Blanco", 1500, 5, TipoArticulo.MARROQUINERIA,Arrays.asList("S","M"),"ver");
            prendaRepositorio.save(cintoBlanco);

            Prenda billeteraNegra = new Prenda("Billetera Color Negro", 2000, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"ver");
            prendaRepositorio.save(billeteraNegra);

            Prenda billeteraMarron = new Prenda("Billetera Color Marrón", 2500, 8, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"ver");
            prendaRepositorio.save(billeteraMarron);

            Prenda billeteraMarronClaro = new Prenda("Billetera Color Marrón Claro", 2200, 9, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"ver");
            prendaRepositorio.save(billeteraMarronClaro);

            Prenda agendaNegra = new Prenda("Agenda Color Negro", 2500, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("Personal","Reuniones"),"ver");
            prendaRepositorio.save(agendaNegra);

            Prenda agendaMarron = new Prenda("Agenda Color Marrón", 2900, 9, TipoArticulo.MARROQUINERIA,Arrays.asList("Personal"),"ver");
            prendaRepositorio.save(agendaMarron);








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