package com.kizumba.Artifactdemokizumba.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.kizumba.Artifactdemokizumba.entities.Department;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public Department getObjects() {
	
		Department d1 = new Department();
		d1.setId(1L);
		d1.setName("Tech");
		return d1;
		
	
	}

}
