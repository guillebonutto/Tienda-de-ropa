package com.mindhub.tiendaderopa.controllers;


import com.mindhub.tiendaderopa.dtos.ArticuloDTO;
import com.mindhub.tiendaderopa.dtos.ClienteDTO;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClienteControlador {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @RequestMapping("/clientes")
    public List<ClienteDTO> getArticulos(){
        return clienteRepositorio.findAll().stream().map(cliente -> new ClienteDTO(cliente)).collect(Collectors.toList());
    }

}
