package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		
		// 함수와 메서드의 차이는 누군가에게 귀속되어 있냐 없냐의 차이다.
		// 함수는 독립적이고 메서드는 종속되어 있는 함수다.
		
		// class 이름 { } -> 여기서 이름의 첫 글자는 대문자로 시작한다.
		// 예) Scanner, String, Arrays
		
		// 정의된 클래스 타입의 공간을 생성한다.
		// 생성된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다.
		
		// 클래스 인스턴스 생성 - 생성자 메서드
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		
		member1.name = "이순신";
		member1.age = 23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name = "김유신";
		member2.age = 34;
		
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		// java - 495p, 메모리최적화기법 - 893p
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		System.out.println(book1.title);
		System.out.println(book1.page + "p");
		System.out.println(book2.title);
		System.out.println(book2.page + "p");
		
		Smartphone phone1 = new Smartphone();
		Smartphone phone2 = new Smartphone();
		Smartphone phone3 = new Smartphone();
		
		phone1.name = "삼성";
		phone2.name = "애플";
		phone3.name = "샤오미";
		
		phone1.operatingsystem = "안드로이드";
		phone2.operatingsystem = "iOS";
		phone3.operatingsystem = "윈도우";
		
		phone1.ram = 8;
		phone2.ram = 16;
		phone3.ram = 32;
		
		System.out.println(phone1.name + " " + phone1.operatingsystem + " " + phone1.ram + "GB");
		System.out.println(phone2.name + " " + phone2.operatingsystem + " " + phone2.ram + "GB");
		System.out.println(phone3.name + " " + phone3.operatingsystem + " " + 	phone3.ram + "GB");
		
		
		
		// 스마트폰 제품명, 운영 체제, 메모리(ram) 크기에 대해 저장할 수 잇는 클래스를 정의하고 인스턴스 생성성하여
		// 값 저장, 출력을 하세요(스마트폰 3개)

	}

}

// 책 제목과 총 페이지 수를 저장하기 위한 클래스 정의
class Smartphone{
	String name;
	String operatingsystem;
	int ram;
}

class Book{
	String title;
	int page;
}

// 클래스 - 설계도, 객체 - 제품
// 클래스 - 붕어빵틀, 객체 - 붕어빵

// 클래스는 사용자 정의 데이터 타입이라고 한다.
class Member{	// Member라는 이름의 클래스 정의
	String name;	// 이름
	int age;	// 나이
	Member(){
		
	}
}