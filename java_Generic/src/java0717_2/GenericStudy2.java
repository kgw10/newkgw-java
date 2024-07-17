package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("A1234", "나 혼자만 레벨업", "추공"));
		book.add(new Book("B4321", "두 번 사는 랭커", "사도연"));
		book.add(new Book("C5678", "마도전생기", "코드 제로"));
		dvd.add( new DVD("O3E232", "완전본", "김"));
		dvd.add( new DVD("P3D232", "초판본", "건"));
		dvd.add( new DVD("M3D232", "후반부", "우"));
		
		// 대여하기
		Library lib = new Library();
		lib.addRental( book.get(0), "이순신");
		lib.addRental( dvd.get(2), "김춘추");
		lib.showRentalList();
		
		
		
//		Rental<DVD> rent = new Rental<>( dvd.get(0), "이순신");
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(1), "김춘추");
//		System.out.println(brent);

	}

}
