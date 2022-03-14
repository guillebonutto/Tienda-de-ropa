package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.dtos.PrendaDTO;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.PrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PrendaClienteControlador {

    @Autowired
    PrendaRepositorio prendaRepositorio;


    @RequestMapping("/articulos")
    public List<PrendaDTO> getArticulos(){
        return prendaRepositorio.findAll().stream().map(articulo -> new PrendaDTO(articulo)).collect(Collectors.toList());
    }
}
