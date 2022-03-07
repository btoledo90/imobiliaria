package com.accenture.imobiliaria.controller;

import antlr.StringUtils;
import com.accenture.imobiliaria.dto.ImobiliariaDTO;
import com.accenture.imobiliaria.entities.Imobiliaria;
import com.accenture.imobiliaria.services.ImobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/mensagens")
public class ImobiliariaController {

    @Autowired
    private ImobiliariaService imobiliariaService;

    @PostMapping
    public ResponseEntity<ImobiliariaDTO> insert(

            @RequestParam("msgTexto") String mensagem,
            @RequestParam("imagem") MultipartFile foto) {
        ImobiliariaDTO dto = new ImobiliariaDTO(null, mensagem, foto);
        dto = imobiliariaService.service(dto);
        

        return ResponseEntity.ok(dto);
    }


}







