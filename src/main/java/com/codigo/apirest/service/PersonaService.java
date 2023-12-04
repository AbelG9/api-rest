package com.codigo.apirest.service;

import com.codigo.apirest.entity.PersonaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService {
    PersonaEntity guardarPersona(PersonaEntity persona);
    PersonaEntity actualizarPersona(PersonaEntity persona);
    void eliminarPersona(Long id);
    List<PersonaEntity> obtenerPersonas();
}
