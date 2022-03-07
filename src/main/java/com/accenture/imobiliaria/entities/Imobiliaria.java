package com.accenture.imobiliaria.entities;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

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


}
