package com.accenture.imobiliaria.vistoria.controller;

import com.accenture.imobiliaria.vistoria.dto.ImobiliariaDTO;
import com.accenture.imobiliaria.vistoria.services.ImobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/mensagens")
public class ImobiliariaController {

    @Autowired
    private ImobiliariaService imobiliariaService;



    @PostMapping
    public ResponseEntity<ImobiliariaDTO> insert(

            @RequestParam("msgTexto") String mensagem,
            @RequestParam("imagem") MultipartFile foto,
            @RequestParam("idImovel") Long idImovel ){
        ImobiliariaDTO dto = new ImobiliariaDTO(null, mensagem, foto, idImovel);
        dto = imobiliariaService.service(dto);
        

        return ResponseEntity.ok(dto);
    }


}







