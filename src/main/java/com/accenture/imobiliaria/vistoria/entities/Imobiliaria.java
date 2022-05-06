package com.accenture.imobiliaria.vistoria.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_imobiliaria")
public class Imobiliaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(length = 100)
    private String mensagem;
    @NotNull
    private Long idImovel;


}
