package com.central.stores.products.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/{productId}")
	public ResponseEntity<Object> update(@RequestBody RequestProductDTO requestProductDTO,
			@PathVariable("productId") UUID productId){
		return services.update(requestProductDTO, productId);
	}


}
