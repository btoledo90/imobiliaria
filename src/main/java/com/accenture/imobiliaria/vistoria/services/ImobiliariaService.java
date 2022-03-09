package com.accenture.imobiliaria.vistoria.services;

import com.accenture.imobiliaria.vistoria.dto.ImobiliariaDTO;
import com.accenture.imobiliaria.vistoria.entities.Imobiliaria;
import com.accenture.imobiliaria.vistoria.controller.repositories.ImobiliariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImobiliariaService {

    @Autowired
    private ImobiliariaRepository imobiliariaRepository;


    public ImobiliariaDTO service(ImobiliariaDTO dto)  {
        Imobiliaria entity = new Imobiliaria();
        entity.setMensagem(dto.getMensagem());
        entity = imobiliariaRepository.save(entity);
        dto.setId(entity.getId());
        salvarImagem(dto.getFoto(), dto.getId());
        return dto;
    }

    public void salvarImagem(MultipartFile image, Long id)  {
        String pasta = "/tmp/";
        Path path = Paths.get(pasta + id + ".jpg" );
//        Path path = Paths.get(pasta + image.getOriginalFilename());
        try {
            byte[] bytes = image.getBytes();
            Files.write(path, bytes);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }


}
