package java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {

		MethodUtil util = new MethodUtil();
		// �� ���� ������ ��ȯ�ϱ� 
		int[] num = util.twoNum();

		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���.
		// ���̴� main �޼��忡�� ��µǰ� �ϼ���
		
		int cube = util.extent();
		System.out.println("���� : " + cube);
		
		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�� �α��� ���� ���
		// �α��� ���� ����� main����
        boolean isFail = util.login();
        if (isFail) {
            System.out.println("�α��� ����");
        } else {
            System.out.println("�α��� ����");
        }
        
        int result = util.number();
        System.out.println(result);
	}

}
    // ���� �� ���� Ű���带 ���� �Է¹�������.
    // �Է��� �� ������ ���� 100�� ������
    // 100 - ���� ����� ����ϰ� 100�� ���� ������ �� ������ ���� ����ϼ���.
    // main �޼��忡�� ���

class MethodUtil{
	
	int number() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� : ");
		int first = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int second = sc.nextInt();
		System.out.println("�� ��° ���� : ");
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
		System.out.print("���̵� : ");
        String id = sc.nextLine();
        System.out.print("��й�ȣ : ");
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
		int �غ� = 10, ���� = 10;
		int result = �غ�*����;
		return result;
	}
	
	int[] twoNum() {
		int num1 = 20, num2 = 50;
		// int[] temp = new int[] { num1, num2 };
		return new int[] {num1, num2};
		// return���� ��ȯ��ų �� �ִ� ���� ���� ���̴�.
	}
	
}