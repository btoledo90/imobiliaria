package com.accenture.imobiliaria.vistoria.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImobiliariaDTO {

    private Long id;
    private String mensagem;
    @JsonIgnore
    private MultipartFile foto;
    private Long idImovel;


}

