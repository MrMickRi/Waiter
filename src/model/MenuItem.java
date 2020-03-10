package model;

public abstract class MenuItem {

	protected String name;
	protected double price;
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " Price: " + this.price;
	}
	
}
