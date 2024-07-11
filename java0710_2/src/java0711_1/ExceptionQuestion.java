package java0711_1;

import java.util.Scanner;

class NameValueException extends Exception {
	public NameValueException(String msg) {
		super(msg);
	}
}

public class ExceptionQuestion {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        String name = null;
        int age = 0;
        String userInfo = "";

        try {
            System.out.print("이름 : ");
            name = scan.nextLine();
            // isEmpty() - 문자열 길이가 0인 경우 true
            // isBlank() - 문자열이 비어 있거나 빈 공백인 경우 true
            System.out.print("나이 : ");
            age = scan.nextInt();
            if (age >= 20) {
                System.out.print("자기 소개 : ");
                userInfo = scan.nextLine();
            }
        } catch (Exception e) {
            System.out.println("입력 중 오류가 발생했습니다. 다시 시도해 주세요.");
        }

        System.out.println(age + "살 " + name + "님은 ");
        System.out.println(userInfo); // 단순히 userInfo 출력
    }
}