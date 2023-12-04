package com.codigo.apirest.controller;

import com.codigo.apirest.entity.PersonaEntity;
import com.codigo.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/grabar")
    public PersonaEntity crearPersona(@RequestBody PersonaEntity persona){
        return personaService.guardarPersona(persona);
    }

    @PostMapping("/actualizar")
    public PersonaEntity actualizarPersona(@RequestBody PersonaEntity persona){
        return personaService.actualizarPersona(persona);
    }

    @PostMapping("/eliminar/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
    }

    @PostMapping("/obtenerPersonas")
    public List<PersonaEntity> obtenerPersonas(){
        return personaService.obtenerPersonas();
    }
}
