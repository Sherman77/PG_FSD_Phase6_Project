package com;

public class Product {
	
	private int id;
	
	private String brand;
	
	private String category;

	private double price;
	
	private String color;
	
	public Product() {}
	
	public Product(int id, String brand, double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", color=" + color + ", price=$" + price + "]";
	}
}

