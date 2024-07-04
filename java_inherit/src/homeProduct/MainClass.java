package homeProduct;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {

		
		Tv tv = new Tv();
		tv.brand = "삼성";
		tv.power();
		tv.power();
		
		Aircon air = new Aircon();
		
		air.brand = "LG휘센";
		System.out.println(air.brand);
		air.power();
		air.power();

	}

}


// 클래스 상속
// 상속하려면 자식 클래스 이름 뒤에 extends 부모 클래스 이름
// extends - 확장, 연장..
// Tv extends House -> Tv 클래스가 자식이고 House가 부모 클래스이다.
// 상속을 하는 가장 큰 이유 - 다향성
// 부모 클래스의 인스턴스 변수, 인스턴 메서드, 클래스 변수, 클래스 메서드 사용 가능하다.
// 단, 부모 클래스의 모든 걸 사요하지는 못한다.
// 일부 제어 걸려있는 변수나 메서드는 사용 불가
// 생성자 메서드를 통해 인스턴스 변수들의 초기화는 자식 클래스가 가지고 있는 변수는 자식 클래스 생성자 메서드에서 초기화
// 부모 클래스가 가지고 있는 변수는 부모 클래스 생성자 메서드에서 초기화







