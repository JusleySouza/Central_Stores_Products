package com.central.stores.products.mapper;

import java.time.LocalDate;

import com.central.stores.products.model.Product;
import com.central.stores.products.model.dto.RequestProductDTO;
import com.central.stores.products.model.dto.ResponseProductDTO;

public class ProductMapper {
	
	public static Product toModel(RequestProductDTO requestProductDTO) {
		return Product.builder()
				.name(requestProductDTO.getName())
				.batch(requestProductDTO.getBatch())
				.amount(requestProductDTO.getAmount())
				.price(requestProductDTO.getPrice())
				.size(requestProductDTO.getSize())
				.created(LocalDate.now())
				.build();
	}
	
	public static ResponseProductDTO modelToResponseProductDTO(Product product) {
		return ResponseProductDTO.builder()
				.id(product.getId())
				.name(product.getName())
				.batch(product.getBatch())
				.amount(product.getAmount())
				.price(product.getPrice())
				.size(product.getSize())
				.build();
	}
	
	public static Product updateProduct(Product product, RequestProductDTO requestProductDTO) {
		product.setName(requestProductDTO.getName());
		product.setBatch(requestProductDTO.getBatch());
		product.setAmount(requestProductDTO.getAmount());
		product.setPrice(requestProductDTO.getPrice());
		product.setSize(requestProductDTO.getSize());
		product.setChanged(LocalDate.now());
		return product;
	}

}
