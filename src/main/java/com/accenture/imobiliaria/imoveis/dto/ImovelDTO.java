package com.accenture.imobiliaria.imoveis.dto;

import lombok.Data;

@Data
public class ImovelDTO {

    private Long id;
    private String apelido;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String situacao;
}
