package com.accenture.imobiliaria.controller;

import com.accenture.imobiliaria.dto.ImobiliariaDTO;
import com.accenture.imobiliaria.entities.Imobiliaria;
import com.accenture.imobiliaria.services.ImobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/mensagens")
public class ImobiliariaController {

    @Autowired
    private ImobiliariaService imobiliariaService;

    @PostMapping
    //@Consumes(MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ImobiliariaDTO> insert(

            @RequestParam("msgTexto") String mensagem,
            @RequestParam("imagem") MultipartFile multipartFile) {
            ImobiliariaDTO dto = new ImobiliariaDTO(null, mensagem);
            dto = imobiliariaService.service(dto);
            return ResponseEntity.ok(dto);
    }

//    @PostMapping
//    public ResponseEntity<ImobiliariaDTO> insert(@RequestBody ImobiliariaDTO dto) {
//        dto = service.insert(dto);
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(dto.getId()).toUri();
//        return ResponseEntity.created(uri).body(dto);
//    }

}







