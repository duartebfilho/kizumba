package com.kizumba.Artifactdemokizumba.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kizumba.Artifactdemokizumba.entities.Department;
import com.kizumba.Artifactdemokizumba.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public List<Product> getObjects() {
		
		Department d1 = new Department(1L, "Tech");
		Department d2 = new Department(2L, "Pet");
// podia atribuir os departamentos como abaixo mas usamos a forma
// mais direta que é instanciar o objeto e atribuir valores
//		d1.setId(1L);
//		d1.setName("Tech");
		
		Product p1 = new Product(1L, "Macbook Pro", 4000.0, d1);
		Product p2 = new Product(2L, "PC Gammer", 3500.0, d1);
		Product p3 = new Product(3L, "Pet House", 350.0, d2);
		
// em public List<Product? getObjects()
// definimos uma lista de produtos e abaio vamos associar os objetos
// na lista Product
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		
		return list;
		
	}

}
