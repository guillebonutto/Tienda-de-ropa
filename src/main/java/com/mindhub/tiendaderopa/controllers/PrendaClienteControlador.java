package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.dtos.PrendaClienteDTO;
import com.mindhub.tiendaderopa.dtos.PrendaDTO;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import com.mindhub.tiendaderopa.repositorios.PrendaClienteRepositorio;
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
    PrendaClienteRepositorio prendaClienteRepositorio;


    @RequestMapping("/articulos")
    public List<PrendaClienteDTO> getArticulos(){
        return prendaClienteRepositorio.findAll().stream().map(articulo -> new PrendaClienteDTO(articulo)).collect(Collectors.toList());
    }
}
