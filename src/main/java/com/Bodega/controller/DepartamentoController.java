package com.Bodega.controller;

import com.Bodega.entity.Departamento;
import com.Bodega.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev/departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/departamento/{id}")
    public Optional<Departamento> buscarDepartamento(@PathVariable int id){
        return departamentoService.getDepartamento(id);
    }

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos(){
        return departamentoService.getDepartamentos();
    }

    @PostMapping("/insert")
    public Departamento insertDepartamento(@RequestBody Departamento departamento){
        return departamentoService.insertDepartamento(departamento);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        departamentoService.delete(id);
    }

}