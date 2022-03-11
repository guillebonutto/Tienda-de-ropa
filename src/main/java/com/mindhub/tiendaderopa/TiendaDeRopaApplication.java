package com.mindhub.tiendaderopa;

import com.mindhub.tiendaderopa.modelos.Articulo;
import com.mindhub.tiendaderopa.modelos.Talles;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TiendaDeRopaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaDeRopaApplication.class, args);}

	@Bean
	public CommandLineRunner initData(ArticuloRepositorio articuloRepositorio) {
		return (args) -> {

			Articulo articulo = new Articulo("Remera loli",200,2, Talles.M, TipoArticulo.REMERAS);
			articuloRepositorio.save(articulo);

		};
	}}