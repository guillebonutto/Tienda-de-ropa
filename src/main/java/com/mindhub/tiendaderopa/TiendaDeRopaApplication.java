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


            //cartera
            Prenda carteraMarron = new Prenda("Cartera Adele de piel con compartimento para smartphone", 1000, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"https://res.cloudinary.com/gohansox/image/upload/v1647390548/cartera3marron_rcgmrp.jpg");
            prendaRepositorio.save(carteraMarron);

            Prenda carteraNegra = new Prenda("Bandolera Ginny de piel", 1200, 12,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"), "https://res.cloudinary.com/gohansox/image/upload/v1647390393/cartera2negra_sitlww.jpg");
            prendaRepositorio.save(carteraNegra);

            Prenda carteraMarronclaro = new Prenda("Cartera Marrón Claro",5000,20,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"https://res.cloudinary.com/gohansox/image/upload/v1647390207/cartera1_lkvp9g.jpg");
            prendaRepositorio.save(carteraMarronclaro);

            Prenda carteraBlanca = new Prenda("Cartera Blanco", 4000,15,TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"https://i.pinimg.com/736x/44/07/ac/4407acc9613e82652500c857677d04ac.jpg");
            prendaRepositorio.save(carteraBlanca);

            Prenda cintoMarron = new Prenda("Cinto Cuero Organico", 900, 10, TipoArticulo.MARROQUINERIA,Arrays.asList("S","M"),"https://res.cloudinary.com/gohansox/image/upload/v1647391905/cintoMarron_yrw8ly.jpg");
            prendaRepositorio.save(cintoMarron);

            Prenda tarjeteroPiel = new Prenda("Tarjetero de piel granulada", 5000, 5, TipoArticulo.MARROQUINERIA,Arrays.asList("Standard"),"https://res.cloudinary.com/gohansox/image/upload/v1647390710/cartera4negra_lpnf1a.jpg");
            prendaRepositorio.save(tarjeteroPiel);



            Prenda cintoBlanco = new Prenda("Cinto Square Buckle", 1500, 5, TipoArticulo.MARROQUINERIA,Arrays.asList("S","M"),"https://res.cloudinary.com/gohansox/image/upload/v1647391628/cintoBlanco_f3vdsp.jpg");
            prendaRepositorio.save(cintoBlanco);









            //zapatos!
            Prenda zapatoMarron = new Prenda("Sandalia Kelli con adornos y logotipo", 12000, 14, TipoArticulo.ZAPATOS,Arrays.asList("8","9","10","11","12"),"https://res.cloudinary.com/gohansox/image/upload/v1647385330/zapatos3_k2zlct.jpg" );
            prendaRepositorio.save(zapatoMarron);

            Prenda zapatoNegro = new Prenda("Zapato de salón Keke de piel con tachuelas", 13500, 15, TipoArticulo.ZAPATOS, Arrays.asList("11","12"),"https://res.cloudinary.com/gohansox/image/upload/v1647385158/zapatos2_dpuzvr.jpg");
            prendaRepositorio.save(zapatoNegro);

            Prenda zapatoCamel = new Prenda("Zapato de salón Kadence",15000,5,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647384607/zapatos1_jaqaxv.jpg");
            prendaRepositorio.save(zapatoCamel);

            Prenda zapato4 = new Prenda("Zapato de salón Keke de piel con tachuelas",17000,3,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647385534/zapatos4_wr95ea.jpg");
            prendaRepositorio.save(zapato4);

            Prenda zapato5 = new Prenda("Zapato de salón Dorothy de piel",11540,6,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647385699/zapatos5_xukqg3.jpg");
            prendaRepositorio.save(zapato5);

            Prenda zapato6 = new Prenda("Sandalia tipo alpargata Laney de piel saffiano con cuña",10000,8,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647386258/zapatos6_bidfqz.jpg");
            prendaRepositorio.save(zapato6);

            Prenda zapato7 = new Prenda("Zapatos de salón abiertos de satén la medusa",13000,2,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647386547/zapatos7_cwfhty.jpg");
            prendaRepositorio.save(zapato7);

            Prenda zapato8 = new Prenda("Sandalia Wren de piel en relieve metalizada con motivo de serpiente y tachuelas",14000,4,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647386845/zapatos8_bc18fs.jpg");
            prendaRepositorio.save(zapato8);

            Prenda zapato9 = new Prenda("Sandalia Giselle de piel en relieve con cristales",13500,4,TipoArticulo.ZAPATOS, Arrays.asList("8","9","10","11"),"https://res.cloudinary.com/gohansox/image/upload/v1647387001/zapatos9_iehenq.jpg");
            prendaRepositorio.save(zapato9);







            //remeras
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