package java0627;

import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		// 반복문 - for, while, do~while
//		// for(초기값; 조건식; 증감식) { 반복 내용 }
//		// 조건식이 거짓이 될 때까지 중괄호 안의 내용이 계속 실행된다.
//		// 초기값 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식
//		// -> 조건식 비교 -> 참이라면 -> 중괄호 -> 증감식 -> 조건식 비교
//		// -> 거짓이라면 -> 끝
//		
//		for(int i = 1; i <= 3; i++) {
//			
//		}
		
//		for(int i = 1; i<1)
//	}
	
//		int num = 1;
//		num = num + 1;
//		System.out.println(num);
//		
//		num = num + 2;
//		System.out.println(num);
//		
//		num = num + 3;
//		System.out.println(num);
//		
//		
		
		// 1부터 내가 입력한 숫자까지의 총합을 입력하세요.
		
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<= number; i++) {
			sum = sum + i;
			System.out.println("총합 : " + sum);
		}
	
	}
}
