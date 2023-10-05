package com.example.primeiroprojetoweb.resources;

import com.example.primeiroprojetoweb.entities.Category;
import com.example.primeiroprojetoweb.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryRepository repository;

    @GetMapping
    public ResponseEntity<List<Category>> findAll()
    {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(repository.findById(id));
    }

}
