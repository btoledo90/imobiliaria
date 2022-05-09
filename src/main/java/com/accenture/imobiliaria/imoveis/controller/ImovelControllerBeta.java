package com.accenture.imobiliaria.imoveis.controller;

import com.accenture.imobiliaria.imoveis.entities.Imovel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/imovel")
public class ImovelControllerBeta {

  @PostMapping(
      produces = { "application/json" },
      consumes = { "application/json" }
  )
  ResponseEntity<Imovel> startPost(@RequestBody Imovel imovel) {

    

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

}
