package com.codigo.apirest.service.impl;

import com.codigo.apirest.dao.PersonaDAO;
import com.codigo.apirest.entity.PersonaEntity;
import com.codigo.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaDAO personaDAO;
    @Override
    public PersonaEntity guardarPersona(PersonaEntity persona) {
        return personaDAO.save(persona);
    }

    @Override
    public PersonaEntity actualizarPersona(PersonaEntity persona) {
        return personaDAO.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaDAO.deleteById(id);
    }

    @Override
    public List<PersonaEntity> obtenerPersonas() {
        return personaDAO.findAll();
    }
}
