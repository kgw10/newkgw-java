package java0626;

import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		
		
		
		/* 코드 작성하기 전 해야할 일 - 문제 파악, 요구사항 도출
		 
		 // 문자열 - " " 큰따옴표로 표현하여 작성한다.
		   문자열은 String 클래스타입을 사용해야 한다.
		 	
		 	
		 	문자2.
		 	직원 이름, 소속부서명, 월 급여액을 키보드를 통해 입력받는다.
		 	세금은 8%를 낸다. 실수령액은 얼마인지 출력
		 	이름, 부서, 실수령액을 출력하세요
		 	두 명의 직원에 대해 출력하세요.
		 
		 */
		Scanner sca = new Scanner(System.in);
		
		String name, dept, name2, dept2;
		int money, money2;
		float tax = 0.08f;
		
		System.out.print("이름 : ");
		name = sca.nextLine();
		System.out.print("부서 : ");
		dept = sca.nextLine();
		
		System.out.print("월 급여 : ");
		money = sca.nextInt();		
		float salary = (int)(money - (money*tax));

		System.out.println("이름 : " + name + " 부서 : " + dept + " 수령액 : " + salary );
		
		sca.nextLine();

		
		System.out.print("이름 : ");
		name2 = sca.nextLine();
		System.out.print("부서 : ");
		dept2 = sca.nextLine();
		
		System.out.print("월 급여 : ");
		money2 = sca.nextInt();
		
		float salary2 = (int)(money2 - (money2*tax));
		
		System.out.println("이름 : " + name2 + " 부서 : " + dept2 + " 수령액 : " + salary2);
		
		
		/*
		  next() - 스페이스키, 탭키, 엔터키를 누르면 입력 끝
		  nextLine() - 엔터키 누르면 입력 끝
		  
		  
		 */
	}

}
