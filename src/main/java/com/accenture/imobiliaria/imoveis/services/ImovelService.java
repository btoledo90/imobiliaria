package com.accenture.imobiliaria.imoveis.services;

import com.accenture.imobiliaria.imoveis.dto.ImovelDTO;
import com.accenture.imobiliaria.imoveis.entities.Imovel;
import com.accenture.imobiliaria.imoveis.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    @Autowired
    ImovelRepository imovelRepository;

    public ImovelDTO cadastrar(ImovelDTO dto) {
        Imovel entity = new Imovel();
        toEntity(dto, entity);
        entity = imovelRepository.save(entity);
        toDto(entity, dto);
        return dto;
    }

    public ImovelDTO alterar(ImovelDTO dto) {

        Imovel entity = imovelRepository.getById(dto.getId());
        toEntity(dto, entity);
        entity = imovelRepository.save(entity);
        toDto(entity, dto);
        return dto;
    }

    public List<Imovel> listar() {
        List<Imovel> list = imovelRepository.findAll();
        return list;

    }

    public void excluir(Long id) {
        imovelRepository.deleteById(id);
    }


        private void toEntity (ImovelDTO dto, Imovel entity){


            entity.setApelido(dto.getApelido());
            entity.setEndereco(dto.getEndereco());
            entity.setNumero(dto.getNumero());
            entity.setComplemento(dto.getComplemento());
            entity.setBairro(dto.getBairro());
            entity.setCidade(dto.getCidade());
            entity.setEstado(dto.getEstado());
            entity.setCep(dto.getCep());
            entity.setSituacao(dto.getSituacao());

        }

        private void toDto (Imovel dto, ImovelDTO entity){

            dto.setId(entity.getId());
            dto.setApelido(entity.getApelido());
            dto.setEndereco(entity.getEndereco());
            dto.setNumero(entity.getNumero());
            dto.setComplemento(entity.getComplemento());
            dto.setBairro(entity.getBairro());
            dto.setCidade(entity.getCidade());
            dto.setEstado(entity.getEstado());
            dto.setCep(entity.getCep());
            dto.setSituacao(entity.getSituacao());
        }

        public void gerar(){
            for (int i = 0; i < 10; i++) {
                ImovelDTO teste = new ImovelDTO();
                teste.setApelido("Apelido "+ i );
                teste.setBairro("Bairro "+ i);
                teste.setCep("Bairro "+ i);
                teste.setCidade("Bairro "+ i);
                teste.setComplemento("Bairro "+ i);
                teste.setEndereco("Bairro "+ i);
                teste.setEstado("Bairro "+ i);
                teste.setNumero("Bairro "+ i);
                teste.setSituacao("Bairro "+ i);
                cadastrar(teste);
            }
        }


    }
