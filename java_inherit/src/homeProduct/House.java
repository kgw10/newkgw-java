package homeProduct;

public class House {
	
	boolean onOff;
	String brand;	// 제품 브랜드 명
	int price; // 제품 구매 가격
	
	House() {
		this.onOff = false;
	}
	House(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
}
