package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import com.mindhub.tiendaderopa.repositorios.PagoRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TiendaDeRopaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaDeRopaApplication.class, args);}

	@Bean
	public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, ArticuloRepositorio articuloRepositorio, ClienteArticuloRepositorio clienteArticuloRepositorio, PagoRepositorio pagoRepositorio) {
		return (args) -> {
			Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com","lara");
			clienteRepositorio.save(cliente);

			Pago pago = new Pago(TipoPago.TARJETA, LocalDateTime.now(),2000,"hola");
			pagoRepositorio.save(pago);

/*			Articulo articulo = new Articulo("Remera loli",200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"),);
			articuloRepositorio.save(articulo);*/

/*			ClienteArticulo clienteArticulo = new ClienteArticulo(TipoArticulo.REMERAS, "Remera", 2000.5, 5, cliente, articulo);
			clienteArticuloRepositorio.save(clienteArticulo);*/
		};
	}}