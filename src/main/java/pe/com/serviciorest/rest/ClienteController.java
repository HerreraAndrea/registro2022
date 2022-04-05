/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.serviciorest.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.serviciorest.entity.Cliente;
import pe.com.serviciorest.service.ClienteService;

/**
 *
 * @author KB
 */ // Agregar metodos para realizar con el postman
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente c) {
        return clienteService.add(c);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable long id) {
        return clienteService.findById(id);
    }
    
        @PutMapping("/{id}")
    public Cliente update(@PathVariable long id,@RequestBody Cliente c){
        c.setCodigo(id);
        return clienteService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
        Cliente objcategoria = new Cliente();
        objcategoria.setCodigo(id);
        return clienteService.delete(Cliente.builder().codigo(id).build());
    }
}
