//package java0710_2;
//
//public class ExceptionTest1 {
//
//	public static void main(String[] args) {
//		
//		
//		try {
//			String name = null;
//			name.length();
//			
//			System.out.println( 10/0 );	
//
//		}catch(NullPointerException n) {
//			n.printStackTrace();//
//			System.out.println(n.getMessage());
//			System.out.println(n.getClasS());
//			System.out.println("문자열 입력해라!!");
//			
//		}catch(Exception e) {
//			
//			System.out.println(" 0 으로 나누기 하면 안 돼 알았지?");
//			
//		}
//		
//		System.out.println(" 여기가 프로그램 끝");
//
//
//	}
//
//}
//
///*
//	예외처리
//	 - 프로그램 실행 중에 발생하는 에러 발생하면 즉시 프로그램 종료된다.
//	   예외 처리를해주면 에러가 발생해도 프로그램은 종료되지 않는다.
//	 - 사용자가 잘못된 값을 입력하는 경우에 알려줄 수 있다.
//	 - 에러나 오류를 해결하는 바업ㅂ이 아니고, 회피하는 방법이다.
//
//
//*/