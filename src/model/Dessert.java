package model;

public class Dessert extends MenuItem {

	protected boolean glutenFree;
	
	public Dessert(String name, double price, boolean glutenFree) {
		this.name = name;
		this.price = price;
		this.glutenFree = glutenFree;
	}
	
	public boolean isGlutenFree() {
		return this.glutenFree;
	}
	
}
