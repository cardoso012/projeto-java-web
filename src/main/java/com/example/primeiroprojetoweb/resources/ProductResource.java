package com.example.primeiroprojetoweb.resources;

import com.example.primeiroprojetoweb.entities.Product;
import com.example.primeiroprojetoweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll()
    {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(repository.findById(id));
    }

}
