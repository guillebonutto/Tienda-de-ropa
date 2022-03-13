package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.dtos.InventarioDTO;
import com.mindhub.tiendaderopa.modelos.Inventario;
import com.mindhub.tiendaderopa.modelos.TipoArticulo;
import com.mindhub.tiendaderopa.repositorios.InventarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController //le indicamos que hacemos un controlador rest
@RequestMapping("/api") //relacionar el controlador con la ruta /api
public class InventarioControlador {

    @Autowired //Inyección de dependencia
    InventarioRepositorio inventarioRepositorio;

    @RequestMapping("/inventario")
    public List<InventarioDTO> getArticulos(){
        return inventarioRepositorio.findAll().stream().map(inv -> new InventarioDTO(inv)).collect(Collectors.toList());
    }

    @PostMapping("/inventario")
    public ResponseEntity<Object> generarArticulo(
            @RequestParam String articulo, @RequestParam TipoArticulo tipo,
            @RequestParam List<String> talles, @RequestParam int precio,
            @RequestParam int stock, @RequestParam String imagen) {

        if(articulo.isEmpty() || talles.size() == 0 || precio == 0 || stock == 0 ){
            return new ResponseEntity<>("datos invalidos",HttpStatus.FORBIDDEN);
        }

        Inventario articulo1 = new Inventario(articulo,precio,stock,tipo,talles,imagen);
        inventarioRepositorio.save(articulo1);

            return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
