//package java0702_2;
//
//public class javaMethod {
//
//	public static void main(String[] args) {
//		// 클래스 메서드에서는 오직 클래스 변수나 클래스 메서드만 실행 - 메모리에 로드(적재)되는 때가 인스턴스보다
//		// 먼저 이루어지기 때문에 인스턴스 변수나 인스턴스 메서드는 안된다.
////		javaMethod ja = new javaMethod;
////		ja.output();
//		
//		int num = 300;
//		output( num );
//
//		
//
//	}
//	
//	static void output( int a ) {
//		System.out.println( a );
//		System.out.println(" 나는 메서드 입니다.");
//	}
//
//}
//
//
//
//
//class a{
//	int num = 10;
//	
//	static void out() {
//		System.out.println( num );
//	}
//}
// main 메서드 -> JVM


// 자바 메서드
// 반환타입 메서드 이름(매개 변수){    }

// 반환타입 - int, short, float, double, char, boolean, void, String
// 반환타입이란 메서드의 return 데이터 타입
// return 10; -> 반환타입 int, short, long
// return income; -> income 변수의 타입을 반환타입으로

// void 타입은 반환값이 없다라는 의미

/*
 	주민등록번호로 남자인지 여자인지 구별
 	String gender(String jumin){
 		String gen = jumin.substring(7, 8);
 		iff(gen.equals("1") || gen.equals("3")){
 			return "남자"
 		}else if(gen.equeals("2") || gen.equals("4") ) {
 			return "여자";
 		}
 		return "혼란";
 		
 	}
 
 */
 