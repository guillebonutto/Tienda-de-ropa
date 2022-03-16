package com.mindhub.tiendaderopa.controllers;


import com.mindhub.tiendaderopa.dtos.CompraDTO;
import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Compra;
import com.mindhub.tiendaderopa.modelos.TipoCompra;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import com.mindhub.tiendaderopa.repositorios.CompraRepositorio;
import com.mindhub.tiendaderopa.repositorios.PrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CompraControlador {

    @Autowired
    CompraRepositorio compraRepositorio;

    @Autowired
    ClienteRepositorio clienteRepositorio;

    //@Autowired
    //PrendaRepositorio prendaRepositorio;

    @RequestMapping("/compras")
    public List<CompraDTO> getCompras(){
        return compraRepositorio.findAll().stream().map(pago -> new CompraDTO(pago)).collect(Collectors.toList());
    }

//    @PostMapping("/compras")
//    public ResponseEntity<Object> realizarCompra(Authentication authentication,
//                                                 @RequestParam TipoCompra tipoCompra,
//                                                 @RequestParam double monto,
//                                                 ){
//
//        Cliente cliente = clienteRepositorio.findByEmail(authentication.getName());
//
//        Compra compra = compraRepositorio.findByName(tipoCompra);
//
//        Compra compra1 = new Compra(tipoCompra, LocalDateTime.now(),monto);
//        compraRepositorio.save(compra1);
//
//
//
//
//        if(cliente == null){
//            return new ResponseEntity<>("Disculpe, debe iniciar sesión para continuar con la compra", HttpStatus.FORBIDDEN);
//        }
//
//        if(compra == null){
//            return new ResponseEntity<>("Disculpe, debe elegir un medio de pago habilitado",HttpStatus.FORBIDDEN)
//        }
//
//        for ( i=0, )
//        compra.setMonto(monto)
//
//
//
//    }


}
