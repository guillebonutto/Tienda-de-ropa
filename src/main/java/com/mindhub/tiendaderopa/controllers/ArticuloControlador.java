package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.dtos.ArticuloDTO;
import com.mindhub.tiendaderopa.modelos.Articulo;
import com.mindhub.tiendaderopa.modelos.Talles;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;
import com.mindhub.tiendaderopa.repositorios.ArticuloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ArticuloControlador {

    @Autowired
    ArticuloRepositorio articuloRepositorio;

    @RequestMapping("/articulos")
    public List<ArticuloDTO> getArticulos(){
        return articuloRepositorio.findAll().stream().map(art -> new ArticuloDTO(art)).collect(Collectors.toList());
    }

    @PostMapping("/articulos")
    public ResponseEntity<Object> generarArticulo(
            @RequestParam String articulo, @RequestParam TipoArticulo tipo,
            @RequestParam List<String> talles, @RequestParam int precio,
            @RequestParam int stock) {

        if(articulo.isEmpty() || talles.size() == 0 || precio == 0 || stock == 0 ){
            return new ResponseEntity<>("datos invalidos",HttpStatus.FORBIDDEN);
        }

        Articulo articulo1 = new Articulo(articulo,precio,stock,tipo,talles);
        articuloRepositorio.save(articulo1);

            return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
