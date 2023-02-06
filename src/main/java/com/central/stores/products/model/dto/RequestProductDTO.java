package com.central.stores.products.model.dto;

import javax.validation.constraints.NotEmpty;

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
public class RequestProductDTO {
	
	//@NotEmpty(message = "{name.not.empty}")
	private String name;
	//@NotEmpty(message = "{batch.not.empty}")
	private String batch;
	//@NotEmpty(message = "{amount.not.empty}")
	private int amount;
	//@NotEmpty(message = "{price.not.empty}")
	private double price;
	//@NotEmpty(message = "{size.not.empty}")
	private String size;

}
