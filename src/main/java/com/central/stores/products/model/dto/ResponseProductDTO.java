package com.central.stores.products.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseProductDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String batch;
	private int amount;
	private double price;
	private String size;

}
