//package java0710_1;
//
//import java.util.Scanner;
//
//public class InnerClass1 {
//
//	public static void main(String[] args) {
//		Out out = new Out();
//		out.num = 100;
//		out.obj.age = 34;
//		out.obj.setName("이순신");
//		
//		Out.인스턴스내부클래스 in =  out.new 인스턴스내부클래스();
//		in.age = 20;
//		in.setName("김유신");
//	}
//
//}
//// static으로 선언 및 정의한 변수와 메서드는 인스턴스 메서드에서 사용 가능
//// 인스턴스 변수, 메서드는 static 메서드에서 사용 불가
//
//
//class Out{
//	static int count; 	// 클래스 변수
//	int num; 	// 인스턴스 변수
//	private String job;	// 인스턴스 변수
//	인스턴스내부클래스 obj = new 인스턴스내부클래스();
//	
//	interface Car{	// 내부 인터페이스
//		void make();
//	}
//	void makeCar() {
//		Car c = new Car() {
//			@Override
//			public void make() {
//				System.out.println(" 익명 ")
//			}
//		};
//		
//	}
//	
//	
//	
//	void buySomputter() {
//		
//		class 지역클래스{
//			static int weigth;
//			void del() {
//				
//			}
//		}	
//		지역클래스 ob = new 지역클래스();
//	}
//
//	
//	
//	static class 정적클래스{	// Out 클래스 객체에 속하지 않는다.
//		static int birth;
//		static void update() {
//		}
//	}
//	private class 인스턴스내부클래스 {
//		public int age;
//		private String name;
//		void setName(String name) {
//			this.name = name;
//		}
//		static void create() {
//			count = 10;
//		}
//	}
//}