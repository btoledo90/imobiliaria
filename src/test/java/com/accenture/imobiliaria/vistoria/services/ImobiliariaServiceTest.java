package com.accenture.imobiliaria.vistoria.services;

import com.accenture.imobiliaria.vistoria.entities.Imobiliaria;
import com.accenture.imobiliaria.vistoria.repositories.ImobiliariaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ImobiliariaServiceTest {

    @Autowired
    ImobiliariaRepository imobiliariaRepository;

    @Test
    void service() {
    }

    @Test
    void dadoDoisValoresRespostaSomaErrada() {
        // Arrange
        int a = 1;
        int b = 3;
        // Act
        int c = a + b;
        // Assert
        assertNotEquals(5, c);


    }

    @Test
    void dadoDoisValoresRespostaSomaCerta() {
        // Arrange
        int a = 1;
        int b = 3;
        // Act
        int c = a + b;
        // Assert
        assertEquals(4, c);

    }

    @Test
    void dadoUmIdDeUsuarioRetornaOUsuario(){
        //Arrange
        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.setIdImovel(null);
        //Act
        imobiliaria = imobiliariaRepository.save(imobiliaria);
        //Assert
        Assertions.assertNotNull(imobiliaria.getIdImovel());







    }
}