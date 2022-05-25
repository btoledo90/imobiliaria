package com.accenture.imobiliaria.imoveis.repositories;

import com.accenture.imobiliaria.imoveis.domain.ImovelEntity;
import com.accenture.imobiliaria.imoveis.entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepositoryBeta extends MongoRepository<ImovelEntity, String> {
}
