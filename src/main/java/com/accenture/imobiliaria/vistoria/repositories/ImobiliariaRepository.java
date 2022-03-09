package com.accenture.imobiliaria.vistoria.repositories;

import com.accenture.imobiliaria.vistoria.entities.Imobiliaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImobiliariaRepository extends JpaRepository<Imobiliaria, Long> {

}
