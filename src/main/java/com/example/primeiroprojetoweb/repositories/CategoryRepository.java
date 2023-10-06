package com.example.primeiroprojetoweb.repositories;

import com.example.primeiroprojetoweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
