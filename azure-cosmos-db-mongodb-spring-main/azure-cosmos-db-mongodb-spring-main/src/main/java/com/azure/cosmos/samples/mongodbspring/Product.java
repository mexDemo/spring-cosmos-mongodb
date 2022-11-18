package com.azure.cosmos.samples.mongodbspring;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    public String id;

    public String category;

    public String name;

    public Integer quantity;

    public Boolean sale;

    public Product(String category, String name, Integer quantity, Boolean sale)
    {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.sale = sale;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", name=" + name + ", quantity=" + quantity + ", sale="
				+ sale + "]";
	}

    
    
}