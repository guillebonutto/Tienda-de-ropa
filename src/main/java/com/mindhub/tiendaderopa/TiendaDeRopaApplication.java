package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.*;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import com.mindhub.tiendaderopa.repositorios.CompraRepositorio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

import java.time.LocalDateTime;
import java.util.Properties;

@SpringBootApplication
public class TiendaDeRopaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaDeRopaApplication.class, args);}

	@Bean
	public CommandLineRunner initData(ClienteRepositorio clienteRepositorio, ArticuloRepositorio articuloRepositorio) {
		return (args) -> {
		Cliente cliente = new Cliente("Lara", "Soto", "lara@hotmail.com","lara");
			clienteRepositorio.save(cliente);

/*			Articulo articulo = new Articulo("Remera loli",200, 20, TipoArticulo.REMERAS, Arrays.asList("S", "M", "L", "XL", "XXL"),);
			articuloRepositorio.save(articulo);*/


		};
	}}