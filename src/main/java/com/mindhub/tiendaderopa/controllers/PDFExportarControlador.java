package com.mindhub.tiendaderopa.controllers;

<<<<<<< HEAD
//import org.springframework.security.core.Authentication;
=======
import com.mindhub.tiendaderopa.modelos.Carrito;
import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Pago;
import com.mindhub.tiendaderopa.repositorios.CarritoRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import com.mindhub.tiendaderopa.repositorios.PagoRepositorio;
import com.mindhub.tiendaderopa.servicios.GeneradorPDFServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
>>>>>>> b72d4db413a9e9cfef09c3def2f588cd8fb4b58b


@RestController
@RequestMapping("/api")
public class PDFExportarControlador {

    @Autowired
    GeneradorPDFServicio generadorPDFServicio;

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Autowired
    CarritoRepositorio carritoRepositorio;

    @Autowired
    PagoRepositorio pagoRepositorio;

    @GetMapping("/pdf/generate/{id}")
    public void generatePDF(HttpServletResponse response, Authentication authentication, @PathVariable long id, @RequestParam Compra pago, @RequestParam Carrito carrito, @RequestParam String amount ) throws IOException {

<<<<<<< HEAD
        //Cliente currentClient = clienteRepositorio.findByEmail(authentication.getName());
        *//*Compra pago = pagoRepositorio.findById(id).orElse(null);
        Carrito carrito1 = carritoRepositorio.findById(currentClient.getId()).orElse(null);*//*
=======
        Cliente currentClient = clienteRepositorio.findByEmail(authentication.getName());
        Pago pago1 = pagoRepositorio.findById(id).orElse(null);
        Carrito carrito1 = carritoRepositorio.findById(currentClient.getId()).orElse(null);
>>>>>>> b72d4db413a9e9cfef09c3def2f588cd8fb4b58b

        response.setContentType("application/pdf");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=balance_"+currentClient.getNombre()+"_"+currentClient.getApellido()+".pdf";
        response.setHeader(headerKey, headerValue);

        generadorPDFServicio.export(response,currentClient, pago, carrito, amount);
    }
}
