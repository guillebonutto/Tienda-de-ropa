package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.dtos.CarritoDTO;
import com.mindhub.tiendaderopa.repositorios.CarritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarritoControlador {

    @Autowired
    CarritoRepositorio carritoRepositorio;

    @RequestMapping("/carrito")
    public List<CarritoDTO> getCarrito(){
        return carritoRepositorio.findAll().stream().map(carrito -> new CarritoDTO(carrito)).collect(Collectors.toList());
    }
}
