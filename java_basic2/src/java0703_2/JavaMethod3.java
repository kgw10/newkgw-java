package java0703_2;

import java.util.Scanner;

public class JavaMethod3 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		// 정수 두 개 입력 받아 합을 출력하기
//		Calc calc = new Calc();
//		calc.sum(40, 50);
		
		// calc.sum();
		
		// 세 과목의 총점을 구하여 출력하세요
        int kor = 89, eng = 74, mat = 43;

        Study study = new Study();
        int total = study.sum(kor, eng, mat); 
        

        System.out.println("총점 : " + total);
        


        // 메서드 호출하여 '메서드 dog쉽네~' 라고 출력
        
        Calc subject = new Calc();

        
        subject.Study();
        
        Calc ab = new Calc();
        
        ab.view();
        
        // 메서드를 호출하여 이름과 나이를 출력하세요
        // 매개 변수 없는 메서드, 키보드 입력 X
        

        
        Jumin 주민 = new Jumin();
        주민.resident();
        
        // 메서드를 호출하여 아래의 데이터를 출력하세요
        String animal = "골드 리트리버";
        String 공고일 = "2024 - 07 - 01";

        TestMethod testMethod = new TestMethod();
        testMethod.test(animal, 공고일);
        
        // 다음 날짜 중에서 월과 일만 출력하세요
        // 문자열 메서드 substring 또는 split 사용
        String examDay = "2024-08-13";
        testMethod.day(examDay);
        testMethod.datePrint(examDay);
        
        // 네 사람의 나이 평균값을 구하여 출력하세요.
        // 평균값은 정수입니다.
        int 흥민 = 31, 강인 = 23, 희찬 = 28, 재범 = 37;
        testMethod.avg(흥민, 강인, 희찬, 재범);
        
	}

}

class TestMethod {
	
	void avg(int num1, int num2, int num3, int num4) {
		int total = num1 + num2 + num3 + num4;
		int average = total/4;
		System.out.println("나이 평균 : " + average);
	}
	
	void datePrint(String date) {
		String[] current = date.split("-");
		System.out.println(current[1] + " " + current[2]);
	}
	
	void day(String examDay) {
		 
	     String month = examDay.substring(5, 7);
	     month = "8월";
	        
	     String Day = examDay.substring(8, 10);
	     Day = "13일";
		 System.out.println(month + " " + Day);	// 15

	}
	
	
    void test(String animal, String 공고일) {
        System.out.println(animal + " " + 공고일);
    }
}

// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스 변수는 클래스 이름으로 ~~~ 사용

class Jumin {
	void resident() {
		String name = "김건우";
		int age = 20;
		System.out.println("이름 : " + name + " , 나이 : " + age + "살");
	}
}

class Calc {
	
	void view() {	// 변수 a, b의 값을 출력하는 메서드
		int a = 10, b = 20;
		System.out.println(a + " " + b);
	}

    void Study() {
        System.out.println("메서드 dog쉽네~");
    }
}
class Study {
    void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("합 : " + result);
    }

    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
//class Calc{
//	
//	void sum(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("합 : " + result);
//	}
//	
//	
//	void sum() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫 번째 정수 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두 번째 정수 : ");
//		int num2 = scan.nextInt();
//		int result = num1 + num2;
//		System.out.println("합 : " + result);
//	}
//}