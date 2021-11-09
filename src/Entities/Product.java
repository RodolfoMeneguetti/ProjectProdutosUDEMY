package Entities;

public class Product {
	
	private String Name; 
	private double price; 
	
	
	public Product() {
	}
	
	public Product(String Name, double Price) {
		this.Name = Name; 
		Price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double TotalPrice(double price) {
		double sum = 0.00; 
		if(price > 0) {
			sum = price += price;
		}else {
			System.out.println("Dont date PRICE");
		}
		
		return sum;
	}
	


}
