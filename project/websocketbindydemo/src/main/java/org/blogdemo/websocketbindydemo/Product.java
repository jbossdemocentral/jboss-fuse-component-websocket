package org.blogdemo.websocketbindydemo;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator="\\,")
public class Product {
	
	@DataField(pos=1 , required=true)
	String productId;
	
	@DataField(pos=2 , required=true)
	String productName;
	
	@DataField(pos=3 , required=true)
	String farmerName;
	
	@DataField(pos=4 , required=true)
	Integer quantity;
	
	@DataField(pos=5 , required=true, pattern="dd-MM-yyyy")
	Date harvestDate;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getHarvestDate() {
		return harvestDate;
	}

	public void setHarvestDate(Date harvestDate) {
		this.harvestDate = harvestDate;
	}
	
	public String toString(){
		return "productName:"+productName+" farmerName:"+farmerName+" quantity:"+quantity+" harvestDate:"+harvestDate;
	}

}
