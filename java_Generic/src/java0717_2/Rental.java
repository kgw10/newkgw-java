package java0717_2;

public class Rental<T extends Media> {
	private T item;
	private String renter;	// �뿩�� ���
	
	public Rental(T item, String renter) {
		this.item = item;
		this.renter = renter;
	}
	
	Media getItem() {
		return this.item;
	}
	public String GetRenter() {
		return this.renter;
	}
	
	@Override
	public String toString() {
		return "�뿩�� : " + renter + " , " + item.toString();
	}
}
