package java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {

		MethodUtil util = new MethodUtil();
		// 두 개의 정수를 반환하기 
		int[] num = util.twoNum();

		// 사각형의 너비와 높이를 설정하고 넓이를 출력하세요.
		// 넓이는 main 메서드에서 출력되게 하세요
		
		int cube = util.extent();
		System.out.println("넓이 : " + cube);
		
		// 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
		// login 메서드를 실행하여 로그인 여부를 출력하세요.
		// 아이디 비밀번호가 일치하면 로구인 성공 출력
		// 하나라도 불일치면 로그인 실패 출력
		// 로그인 여부 출력은 main에서
        boolean isFail = util.login();
        if (isFail) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
        
        int result = util.number();
        System.out.println(result);
	}

}
    // 정수 세 개를 키보드를 통해 입력받으세요.
    // 입력한 세 정수의 합이 100을 넘으면
    // 100 - 합의 결과를 출력하고 100을 넘지 않으면 세 정수의 합을 출력하세요.
    // main 메서드에서 출력

class MethodUtil{
	
	int number() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int second = sc.nextInt();
		System.out.println("세 번째 정수 : ");
		int third = sc.nextInt();
		
		int result = first + second + third;
		
		if(result > 100) {
			return result - 100;
		} else {
			return result;
		}
	}
	

    boolean login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();
        
    
        String realId = "skyblue";
        String realPassword = "1234sea";        
        if(id.equals(realId) && password.equals(realPassword)) {
        	return true;
        } else {
        	return false;
        }
	}
    

	
	
	
	int extent() {
		int 밑변 = 10, 높이 = 10;
		int result = 밑변*높이;
		return result;
	}
	
	int[] twoNum() {
		int num1 = 20, num2 = 50;
		// int[] temp = new int[] { num1, num2 };
		return new int[] {num1, num2};
		// return으로 반환시킬 수 있는 값은 단일 값이다.
	}
	
}