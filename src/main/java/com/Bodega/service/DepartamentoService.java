package com.Bodega.service;

import com.Bodega.entity.Departamento;
import com.Bodega.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public Optional<Departamento> getDepartamento(Integer id){
        return departamentoRepository.findById(id);
    }

    public List<Departamento> getDepartamentos(){
        return departamentoRepository.findAll();
    }

    public Departamento insertDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public void delete(Integer id){
        departamentoRepository.deleteById(id);
    }
}
