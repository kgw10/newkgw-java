package java0709_3;

public class MainMethod {

	public static void main(String[] args) {

		move d = new dog();
		move c = new cat();
		c.moving();
		d.moving();

	}

}

class dog implements move {
	@Override
	public void moving() {
		System.out.println("멍멍");
	}
}

class cat implements move {
	
	public void moving() {
		System.out.println("냐옹");
	}
	
}

interface move{
	static int a = 10;
	public void moving();
}

/*
	인터페이서 - 추상 클래스의 한 종류
	  - 추상 메서드만 가능
	  - 인스턴스 변수 불가
	  - static 변수, static 메서드 선언 가능
	  - 객체 생성 불가
	  - 클래스들에 연결되어 사용한다.
	  - 다형성 구현을 위해 사용한다.
	  - 프로그램의 기본틀을 구축할 수 있다.
	  
	  
	  
	  서버에서 클라이언트에게 페이지를 제공한다.
	  클라이언트의 요청을 받아 주는 메서드
	  클라이언트가 원하는 페이지를 제공하는 메서드
 
 
 */