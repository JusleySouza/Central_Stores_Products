package com.central.stores.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.central.stores.products.model.dto.RequestProductDTO;
import com.central.stores.products.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService services;
	
	@PostMapping
	public ResponseEntity<Object> create(@RequestBody RequestProductDTO requestProductDTO){
		return services.create(requestProductDTO);
	}

}
