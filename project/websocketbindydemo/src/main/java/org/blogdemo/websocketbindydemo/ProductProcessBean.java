package org.blogdemo.websocketbindydemo;

import java.util.HashMap;

public class ProductProcessBean {
	
	private HashMap<String, Integer> productSum = new HashMap<String, Integer>();
	
	public String addProduct(Product product){
		Integer sum=0;
		if(productSum.get(product.getProductId()) != null){
			sum = productSum.get(product.getProductId())+product.getQuantity();
		}else{
			sum = product.getQuantity();
		}
		
		productSum.put(product.getProductId(), sum);
		
		return "Added Product "+product.getProductName()+", now the total shipped quantities are :"+sum;
	}

}
