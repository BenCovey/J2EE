package edu.nscc.training.grocery.model;

public class GroceryItem {
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString(){
		return getName() + " : " + getPrice();
	}
	

}
