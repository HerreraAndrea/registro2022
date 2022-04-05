/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.serviciorest.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.serviciorest.entity.Producto;
import pe.com.serviciorest.service.ProductoService;

/**
 *
 * @author KB
 */ // Agregar metodos para realizar con el postman
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @PostMapping
    public Producto add(@RequestBody Producto p) {
        return productoService.add(p);
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable long id) {
        return productoService.findById(id);
    }
    
        @PutMapping("/{id}")
    public Producto update(@PathVariable long id,@RequestBody Producto p){
        p.setCodigo(id);
        return productoService.update(p);
    }
    
    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable long id){
        Producto objcategoria = new Producto();
        objcategoria.setCodigo(id);
        return productoService.delete(Producto.builder().codigo(id).build());
    }
}
