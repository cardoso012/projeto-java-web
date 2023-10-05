package com.example.primeiroprojetoweb;

import com.example.primeiroprojetoweb.entities.Category;
import com.example.primeiroprojetoweb.entities.Product;
import com.example.primeiroprojetoweb.repositories.CategoryRepository;
import com.example.primeiroprojetoweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PrimeiroProjetoWebApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(1L, "eletronics");
		Category category2 = new Category(2L, "books");

		Product product1 = new Product(1L, "TV", 2200.00, category1);
		Product product2 = new Product(2L, "Domain-Driven Design", 120.00, category2);
		Product product3 = new Product(3L, "PS5", 2800.00, category1);
		Product product4 = new Product(4L, "Docker", 100.00, category2);

		category1.getProducts().addAll(Arrays.asList(product1, product3));
		category2.getProducts().addAll(Arrays.asList(product2, product4));

		categoryRepository.save(category1);
		categoryRepository.save(category2);

		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
	}
}
