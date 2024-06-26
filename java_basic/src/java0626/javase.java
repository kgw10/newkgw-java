package java0626;

import java.util.Scanner;

// import java.util.Scanner;

public class javase {

	public static void main(String[] args) {

//		System.out.println("자바출력");
		// System.in - 입력

		// 입력 받을 수 있는 내장 클래스 - Scanner		
		Scanner scan = new Scanner(System.in);  
		
		// float 타입 - nextFloat(), double - nextDouble()
		// byte - nextByte()	short - nextShort()
		// char은 없다.
		// 문자열 입력 - nextLine(), next() 
		
//		int a = scan.nextInt();
//		System.out.println(a);
		
		// 점심을 맛있게 먹었으니 처철수가 점심을 먹기 위해 편의점에 갔다. 대게라면, 
		// 삼각김밥, 바나나 우유를 먹었다. 철수가 점심값으로 지불한 금액은 얼마인가?

//		System.out.println("자바출력");
//		Scanner scan = new Scanner(System.in);
//		
//		int a = scan.nextInt();
//		System.out.println(a);
//		
//		int b = scan.nextInt();
//		System.out.println(b);
//		
//		int c = scan.nextInt();
//		System.out.println(c);
//		
		// int total = a + b + c;
		
		// System.out.println(total);
		
		
		// 민수가 친구들을 만나기 위해 나왔다.
		// 나와서 보니 지갑을 놓고 와서 집에 갔다 왔다.
		// 이번에는 신발을 짝짝이로 신어서 다시 집에 갔다왓다.
		// 민수의 집은 5층이다. 민수가 1층 올라가는데 3.4초가 걸린다.
		// 민수가 집에 들어갔다 나왔다 하는데 걸린 총 시간은 몇초?
		
//		float sec = 3.4f;
//		int floor = 5;
//		int out = 2;
//		int in = 2;
//		float total = sec * floor * out * in;
//		System.out.print(total);
		
		// 프로그램 코드는 기본 순차적으로 진행된다.
		// if, 함수(메서드)
		
		/*
		 데이터의 종류는 정수, 실수, 문자, boolean(참, 거짓)
		 데이터 타입
		  	정수 - byte, short, int, long
		  	문자 - char
		  	실수 - float, double
		  	참 거짓 - boolean
		  	
		 변수 선언 방법
		 int num;	정수 타입 변수 선언
		 double dnum; 	실수 타입 변수 선언
		 char ch; 문자 타입 변수 선언
		 boolean bool; 참 거짓 변수 선언
		 
		 변수 초기화
		 int num = 10; 	변수 선언과 함께 데이터를 저장 
		  
		 출력 방법
		 System.out.println(출력내용);
		 System.out.print(출력내용);
		 System.out.printf(출력내용);
		 
		 printf 사용시 함께 사용하는 형식지정자
		 	%d, %u - 정수, %f - 실수, %c - 문자, %s - 문자열
		 	
		 int age = 28;
		 System.out.printf("%s 마을의 나이가 %d살인 폭군지도자 %c 씨", 
		 "코딩빌", age, '박');
		 
		 입력 방법
		 Scanner 클래스 객체 필요
		 Scanner 변수 = new Scanner(system.in);
		  *Scanner 클래스는 내장외부클래스이므로 import 해야 한다.
		 
		 
		 	변수.nextInt();	정수만 입력
		 	변수.nextByte();	byte 타입 정수만 입력
		 	변수.nextShort(); short타입 정수만 입력
		 	변수.nextLong(); long타입 정수만 입력
		 	변수.nextFloat(); float타입 정수만 입력
		 	변수.nextDouble(); double타입 실수만 입력
		 	변수.next(); 문자열 입력
		 	변수.nextLine(); 문자열 입력
		 
		 
		 c언어, 자바, 건축학개론 시험 성적을 입력하세요.
		 세 과목의 총점과 평균을 각각 출력하세요.
		  
		 */
		
//		System.out.printf("시험");
//		Scanner 시험 = new Scanner(System.in);
//
//		float c언어 = 시험.nextFloat();
//		float 자바 = 시험.nextFloat();
//		float 건축학개론 = 시험.nextFloat();
//		float total = c언어 + 자바 + 건축학개론;
//		float avg = total/3;
//		
//		System.out.printf("총점 : " + total + "\n");
//		System.out.printf("평균 : " + avg);
		
		int C, java, 건축학개론;
		
		System.out.print("c언어 성적 : ");
		C = scan.nextInt();
		System.out.print("자바 성적 : ");
		java = scan.nextInt();
		System.out.print("건축학개론 성적 : ");
		건축학개론 = scan.nextInt();
		
		int total = C + java + 건축학개론;
		int avg = total/3;
		
		System.out.printf("총점 : %d점, 평균 : %d점 \n", total, avg);
		
	}
}
