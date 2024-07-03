package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {

		// 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println( num );
		
		// 메서드로부터 두 정수의 더하기 결과 받아서 출력하기
		int 결과 = rm.sum();
		System.out.println(결과);
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게!!
		String userName = rm.user();
		int age = 34;
		System.out.println(userName + " " + age);
		
		// 국어(89), 영어(78), 수학(50) 세 과목의 총점을 구하는 메서드
		// 세 과목의 평균을 구하는 메서드
		// 총점과 평균을 출력하세요
		
        int total = rm.tot(); // 총점 계산
        int average = rm.avg(); // 평균 계산
        
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);
	}
	/*
	 
	 주사위 게임
	 
	 j형준과 s석완이가 게임을 한다. 주사위는 하나, 육면이다.
	 주사위의 값이 큰 사람이 이긴다.
	 주사위 값 구하는 메서드
	 
	 주사위 값 비교하여 누가 이겼는지 출력하는 메서드
	 
	 
	 */

}

class ReturnMth{
	
    int tot() {
        int 국어 = 89, 영어 = 78, 수학 = 50;
        int total = 국어 + 영어 + 수학;
        return total;
    }
    
    int avg() {
        int 국어 = 89, 영어 = 78, 수학 = 50;
        int average = (국어 + 영어 + 수학) / 3;
        return average;
    }
	
	
	
	
	
    String user() {
        return "이순신"; // 이름 반환
    }
	

	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}