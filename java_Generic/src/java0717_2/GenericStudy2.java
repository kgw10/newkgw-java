package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("A1234", "�� ȥ�ڸ� ������", "�߰�"));
		book.add(new Book("B4321", "�� �� ��� ��Ŀ", "�絵��"));
		book.add(new Book("C5678", "����������", "�ڵ� ����"));
		dvd.add( new DVD("O3E232", "������", "��"));
		dvd.add( new DVD("P3D232", "���Ǻ�", "��"));
		dvd.add( new DVD("M3D232", "�Ĺݺ�", "��"));
		
		// �뿩�ϱ�
		Library lib = new Library();
		lib.addRental( book.get(0), "�̼���");
		lib.addRental( dvd.get(2), "������");
		lib.showRentalList();
		
		
		
//		Rental<DVD> rent = new Rental<>( dvd.get(0), "�̼���");
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(1), "������");
//		System.out.println(brent);

	}

}
