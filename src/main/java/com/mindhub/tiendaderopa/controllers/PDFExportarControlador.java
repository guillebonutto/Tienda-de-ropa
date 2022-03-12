package com.mindhub.tiendaderopa.controllers;

//import org.springframework.security.core.Authentication;


/*@RestController
@RequestMapping("/api")*/
public class PDFExportarControlador {
/*
    @Autowired
    GeneradorPDFServicio generadorPDFServicio;

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @GetMapping("/pdf/generate/{id}")
    public void generatePDF(HttpServletResponse response, Authentication authentication, @PathVariable long id, @RequestParam Compra pago, @RequestParam Carrito carrito, @RequestParam String amount ) throws IOException {

        //Cliente currentClient = clienteRepositorio.findByEmail(authentication.getName());
        *//*Compra pago = pagoRepositorio.findById(id).orElse(null);
        Carrito carrito1 = carritoRepositorio.findById(currentClient.getId()).orElse(null);*//*

        response.setContentType("application/pdf");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=balance_"+currentClient.getNombre()+"_"+currentClient.getApellido()+".pdf";
        response.setHeader(headerKey, headerValue);

        generadorPDFServicio.export(response,currentClient, pago, carrito, amount);
    }*/
}
