package com.Bodega.controller;


import com.Bodega.entity.Articulos;
import com.Bodega.service.ArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev/articulos")
public class ArticulosController {
    @Autowired
    ArticulosService articulosService;

    @GetMapping("/articulo/{id}")
    public Optional<Articulos> buscarArticulo(@PathVariable int id){
        return articulosService.getArticulos(id);
    }

    @GetMapping("/articulos")
    public List<Articulos> getArticulos(){
        return articulosService.getArticulos();
    }

    @PostMapping("/insert")
    public Articulos insertArticulos(@RequestBody Articulos articulos){
        return articulosService.insertArticulos(articulos);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        articulosService.delete(id);
    }
}
