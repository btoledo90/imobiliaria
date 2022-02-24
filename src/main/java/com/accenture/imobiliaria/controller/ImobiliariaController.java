package com.accenture.imobiliaria.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/mensagens")
public class ImobiliariaController {

    @GetMapping
    public String mensagem() {
        return "Bem vindo a mensageria";

    }

    @PostMapping
    //@Consumes(MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> submit(

            @RequestParam("msgTexto") String mensagem,
            @RequestParam("imagem") MultipartFile multipartFile) {

        return ResponseEntity.ok(mensagem);
    }

}







