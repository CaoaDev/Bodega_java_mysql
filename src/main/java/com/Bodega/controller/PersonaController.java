package com.Bodega.controller;

import com.Bodega.entity.Persona;
import com.Bodega.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/persona/{id}")
    public Optional<Persona> buscarPersona(@PathVariable int id){
        return personaService.getPersona(id);
    }

    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping("/insert")
    public Persona insertPersona(@RequestBody Persona persona){
        return personaService.insertPersona(persona);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        personaService.delete(id);
    }

}