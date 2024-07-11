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
            System.out.print("�̸� : ");
            name = scan.nextLine();
            // isEmpty() - ���ڿ� ���̰� 0�� ��� true
            // isBlank() - ���ڿ��� ��� �ְų� �� ������ ��� true
            System.out.print("���� : ");
            age = scan.nextInt();
            if (age >= 20) {
                System.out.print("�ڱ� �Ұ� : ");
                userInfo = scan.nextLine();
            }
        } catch (Exception e) {
            System.out.println("�Է� �� ������ �߻��߽��ϴ�. �ٽ� �õ��� �ּ���.");
        }

        System.out.println(age + "�� " + name + "���� ");
        System.out.println(userInfo); // �ܼ��� userInfo ���
    }
}