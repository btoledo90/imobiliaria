package com.accenture.imobiliaria.vistoria;

import com.accenture.imobiliaria.imoveis.domain.ImovelEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {

  private final MongoTemplate mongoTemplate;

  public ApplicationRunner(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  public void run(String... args) throws Exception {
    ImovelEntity imovelEntity = new ImovelEntity();
    imovelEntity.setId("1");
    imovelEntity.setName("Test");
    mongoTemplate.save(imovelEntity);
    System.out.println("test.");
  }
}
