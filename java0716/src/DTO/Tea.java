package DTO;

public class Tea {
	int price;

	String name;
	
	public Tea(int price, String name) {
		this.price = price;
		this.name = name;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
