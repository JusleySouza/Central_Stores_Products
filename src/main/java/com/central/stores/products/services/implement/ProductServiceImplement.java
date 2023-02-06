package com.central.stores.products.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.central.stores.products.mapper.ProductMapper;
import com.central.stores.products.model.Product;
import com.central.stores.products.model.dto.RequestProductDTO;
import com.central.stores.products.model.dto.ResponseProductDTO;
import com.central.stores.products.repository.ProductRepository;
import com.central.stores.products.services.ProductService;

@Component
public class ProductServiceImplement implements ProductService {
	
	@Autowired
	 private ProductRepository repository;
	
	private Product product;
	private ResponseProductDTO responseProductDTO;
	

	@Override
	public ResponseEntity<Object> create(RequestProductDTO requestProductDTO) {
		product = ProductMapper.toModel(requestProductDTO);
		repository.save(product);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}

}
