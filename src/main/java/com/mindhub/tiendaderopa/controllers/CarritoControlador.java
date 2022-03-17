package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.modelos.Carrito;
import com.mindhub.tiendaderopa.modelos.Prenda;
import com.mindhub.tiendaderopa.repositorios.CarritoRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import com.mindhub.tiendaderopa.repositorios.PrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarritoControlador {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Autowired
    PrendaRepositorio prendaRepositorio;

    @Autowired
    CarritoRepositorio carritoRepositorio;


    @PostMapping("/carrito")
    public ResponseEntity<Object> crearCarrito (@RequestParam String nombrePrenda,
                                                @RequestParam int cantidad,
                                                @RequestParam double monto,
                                                @RequestParam double montoTotal
    ){


        if (nombrePrenda==null || cantidad==0 || monto==0 || montoTotal==0){
            return new ResponseEntity<>("complete todos los campos", HttpStatus.FORBIDDEN);
        }
        Carrito carrito = new Carrito(nombrePrenda,cantidad,monto,montoTotal);
        carritoRepositorio.save(carrito);

        return new ResponseEntity<>("Item agregado correctamente al carrito", HttpStatus.CREATED);

    }
}
