package com.central.stores.products.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.central.stores.products.model.dto.RequestProductDTO;

@Service
public interface ProductService {

	public ResponseEntity<Object> create(RequestProductDTO requestProductDTO);
	
}
