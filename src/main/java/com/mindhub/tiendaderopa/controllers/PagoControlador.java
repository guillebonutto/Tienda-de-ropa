package com.mindhub.tiendaderopa.controllers;


import com.mindhub.tiendaderopa.dtos.CarritoDTO;
import com.mindhub.tiendaderopa.dtos.PagoDTO;
import com.mindhub.tiendaderopa.repositorios.PagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PagoControlador {

    @Autowired
    PagoRepositorio pagoRepositorio;

    @RequestMapping("/pagos")
    public List<PagoDTO> getCarrito(){
        return pagoRepositorio.findAll().stream().map(pago -> new PagoDTO(pago)).collect(Collectors.toList());
    }

}
