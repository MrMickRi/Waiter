package model;

public class Drink extends MenuItem {

	protected boolean alcoholic;
	
	public Drink(String name, double price, boolean alcoholic) {
		this.name = name;
		this.price = price;
		this.alcoholic = alcoholic;
	}
	
	public boolean isAlcoholic() {
		return alcoholic;
	}
	
}
