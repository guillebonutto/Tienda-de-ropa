package com.mindhub.tiendaderopa.controllers;

import com.mindhub.tiendaderopa.modelos.Carrito;
import com.mindhub.tiendaderopa.modelos.Cliente;
import com.mindhub.tiendaderopa.modelos.Pago;
import com.mindhub.tiendaderopa.repositorios.CarritoRepositorio;
import com.mindhub.tiendaderopa.repositorios.ClienteRepositorio;
import com.mindhub.tiendaderopa.repositorios.PagoRepositorio;
import com.mindhub.tiendaderopa.servicios.GeneradorPDFServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/api")
public class PDFExportarControlador {
/*
    @Autowired
    GeneradorPDFServicio generadorPDFServicio;

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @GetMapping("/pdf/generate/{id}")
    public void generatePDF(HttpServletResponse response, Authentication authentication, @PathVariable long id, @RequestParam Pago pago, @RequestParam Carrito carrito, @RequestParam String amount ) throws IOException {

        //Cliente currentClient = clienteRepositorio.findByEmail(authentication.getName());
        *//*Pago pago = pagoRepositorio.findById(id).orElse(null);
        Carrito carrito1 = carritoRepositorio.findById(currentClient.getId()).orElse(null);*//*

        response.setContentType("application/pdf");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=balance_"+currentClient.getNombre()+"_"+currentClient.getApellido()+".pdf";
        response.setHeader(headerKey, headerValue);

        generadorPDFServicio.export(response,currentClient, pago, carrito, amount);
    }*/
}
