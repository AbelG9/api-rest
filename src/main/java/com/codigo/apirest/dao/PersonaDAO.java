package com.codigo.apirest.dao;

import com.codigo.apirest.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDAO extends JpaRepository<PersonaEntity, Long> {
}
