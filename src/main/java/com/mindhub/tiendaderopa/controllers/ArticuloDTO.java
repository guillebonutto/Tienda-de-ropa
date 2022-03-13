package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.dtos.CarritoDTO;
import com.mindhub.tiendaderopa.modelos.Articulo;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ArticuloDTO {

    @Autowired
    ArticuloRepositorio articuloRepositorio;

/*    @RequestMapping("/articulos")
    public List<ArticuloDTO> getArticulo() {
        return articuloRepositorio.findAll().stream().map(articulo -> new ArticuloDTO(articulo)).collect(Collectors.toList());
    }*/
}
