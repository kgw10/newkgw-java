package java0627;

import java.util.Scanner;

public class java3 {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		
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
		
//		System.out.print("숫자 입력 : ");
//		int number = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i<= number; i++) {
//			sum = sum + i;
//		
//			System.out.println("총합 : " + sum);
//		}
		
//		for(int i = 1; true; i++) {
//			System.out.println(i);
//		}
		
		// 반복문은 작성하려면 몇 번 반복되는가, 언제 반복문이 종료되어야 하는가
		// 반복문 종료 시점에 대해서 먼저 생각해야 한다.
		// for문, while문, do~while문 모두 언제 반복이 끝나야 하는가를 찾지 못하면 작성할 수 없다.
		// (무한루프이든, n번 반복이든)
		
//		for( ; true; ) {
//			System.out.print("정수 입력 : ");
//			int num = sc.nextInt();
//			if(num == 0) break;
//		}
		
		
		// 무한루프 종료시키는 법
		// 1. if문의 조건식이 참이되면 break 실행
		// 2. for( ; 조건식 ;)
		// 3. return; - 반복문 코드가 있는 메서드를 종료시키기 때문에 반복문도 종료된다.
		// break; - 반복문, switch 사용 가능 if문 단독으로 break 사용 불가
		// if(10>5) break; 이거 오류!!
		
		// continue;
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "번재 반복 시작");
//			if(i%3 == 0) continue;
//			System.out.println(i + "번째 반복 진행중");
//			System.out.println(i + "번째 반복 마지막 내용");
//		}
		
		// 자바의 랜덤
		// int random = (int)Math.floor(Math.random() * 10)+ 1;
		
		// 랜덤의 범위(1~50)
		// 랜덤 값 계속 출력
		// 랜덤값이 11의 배수일 경우 반복문 종료
		
//		int random = (int)Math.floor(Math.random() * 50)+1;
//		for(int i = 1; i <= random; i++) {
//			System.out.println(i);
//			if(i%11 == 0) continue;
//		}
		
		// up & down 만들기
		// 컴퓨터가 제시한 숫자 맞추기
		// 컴퓨터가 제시하는 숫자는 랜덤으로(랜덤범위 20~100)
		// 컴퓨터가 제시한 숫자가 74라면
		// 내가 입력한 숫자가 40일 경우 up이라고 출력
		// 내가 입력한 숫자가 80일 경우 down이라고 출력
		
//		System.out.println("숫자를 입력하세요 : ");
//		int com = (int)Math.floor(Math.random() * 81)+20;
//		for( ; true; ) {
//		int user = sc.nextInt();
//
//			if(user == com) {
//				System.out.println("정답입니다.");
//			} else if(user > com) {
//				System.out.println("down");
//			} else {
//				System.out.println("up");
//			}
//		}
		
		// 이름이 있는 반복문
		
		
//		int sum = 0;
//
//		더하기 : for(int i = 1; i <= 10; i++) {
//			for(int k = 1; k <= 4; k++) {
//				if(sum + k > 40) break 더하기;
//				sum = sum + k;
//				System.out.println("     " + k);
//			}
//			System.out.println(i);
//			sum = sum + i;
//		}
//	
//		if(sum > 40) {
//			System.out.println("sum 출력 : " + sum);
//		}
		
		
		// 베스킨라빈스 31
		// 컴퓨터와 나하고 둘이 한다.
		// 한 번에 제시할 수 있는 숫자는 최소 1개, 최대 3개
		// 31을 입력하면 패배
		
		int num = 1;
		
		베스킨:
		for (;;) {	// while(true)
			System.out.print("숫자 몇 개 : ");
			int user = sc.nextInt();
			System.out.print("나 : ");
			for(int u = 1; u<user; u++) {
				System.out.print(num + " ");
				if(num  == 31) break 베스킨;
				num++;
			}
			System.out.println();
			
			int com = (int)(Math.random()*3)+1;
			System.out.print(" com : " );
			for(int c = 1; c<com; c++) {
				System.out.print(num + " ");
				if(num == 31) break;
				num++;
			}
			System.out.println();
		}
			
	}
}
