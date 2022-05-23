package com.accenture.imobiliaria.imoveis.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("imovelCollection")
public class ImovelEntity {

  @Id
  private String id;
  private String name;

}
