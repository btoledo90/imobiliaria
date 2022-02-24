package com.accenture.imobiliaria.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_mensagem")
public class Imobiliaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(length = 100)
    private String mensagem;

}
