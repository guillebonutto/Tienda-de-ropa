package com.mindhub.tiendaderopa.controllers;


import com.mindhub.tiendaderopa.dtos.CompraDTO;
import com.mindhub.tiendaderopa.repositorios.CompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CompraControlador {

    @Autowired
    CompraRepositorio pagoRepositorio;

    @RequestMapping("/compras")
    public List<CompraDTO> getCarrito(){
        return pagoRepositorio.findAll().stream().map(pago -> new CompraDTO(pago)).collect(Collectors.toList());
    }

}
