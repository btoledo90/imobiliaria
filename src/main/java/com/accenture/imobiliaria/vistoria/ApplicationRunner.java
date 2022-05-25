package com.accenture.imobiliaria.vistoria;

import com.accenture.imobiliaria.imoveis.domain.ImovelEntity;
import com.accenture.imobiliaria.imoveis.repositories.ImovelRepositoryBeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {

  @Autowired
  ImovelRepositoryBeta imovelRepositoryBeta;

  public ApplicationRunner(ImovelRepositoryBeta imovelRepositoryBeta) {
    this.imovelRepositoryBeta = imovelRepositoryBeta;
  }

  @Override
  public void run(String... args) throws Exception {
    ImovelEntity imovelEntity = new ImovelEntity();
    imovelEntity.setId("1");
    imovelEntity.setName("Test");
    imovelRepositoryBeta.save(imovelEntity);
    System.out.println("test.");
  }
}
