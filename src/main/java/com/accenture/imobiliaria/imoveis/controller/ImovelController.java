package com.accenture.imobiliaria.imoveis.controller;

import com.accenture.imobiliaria.imoveis.dto.ImovelDTO;
import com.accenture.imobiliaria.imoveis.entities.Imovel;
import com.accenture.imobiliaria.imoveis.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/imoveis")
public class ImovelController {

    @Autowired
    ImovelService imovelService;


    @GetMapping
    public ResponseEntity<List<Imovel>> listar() {
        List<Imovel> list = imovelService.listar();
        return ResponseEntity.ok().body(list);
    }


    @PostMapping
    public ResponseEntity<ImovelDTO> insert(@RequestBody ImovelDTO dto) {
        dto = imovelService.cadastrar(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @GetMapping("/listar")
    public ModelAndView getImoveis(){
        ModelAndView modelAndView = new ModelAndView("imoveis/formulario");
        modelAndView.addObject("listagem", imovelService.listar());
        return modelAndView;
    }

    @GetMapping("/gerar")
    public String gerarImovel(){
        imovelService.gerar();
        return "imoveis/formulario";
    }

    @PostMapping("/cadastro")
    public String criarFormulario(@ModelAttribute ImovelDTO dto){
        return "resultado-inscricao";
    }

    


    @PutMapping
    public ResponseEntity<ImovelDTO> alterar(@RequestBody ImovelDTO dto) {
        dto = imovelService.alterar(dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ModelAndView delete (@PathVariable Long id) {
        imovelService.excluir(id);
        return new ModelAndView("redirect:/imoveis/listar");
    }


}
