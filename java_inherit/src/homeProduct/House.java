package homeProduct;

public class House {
	
	boolean onOff;
	String brand;	// ��ǰ �귣�� ��
	int price; // ��ǰ ���� ����
	
	House() {
		this.onOff = false;
	}
	House(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
}
