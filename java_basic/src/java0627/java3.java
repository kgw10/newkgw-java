package java0627;

import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		// �ݺ��� - for, while, do~while
//		// for(�ʱⰪ; ���ǽ�; ������) { �ݺ� ���� }
//		// ���ǽ��� ������ �� ������ �߰�ȣ ���� ������ ��� ����ȴ�.
//		// �ʱⰪ -> ���ǽĺ� -> ���̶�� -> �߰�ȣ -> ������
//		// -> ���ǽ� �� -> ���̶�� -> �߰�ȣ -> ������ -> ���ǽ� ��
//		// -> �����̶�� -> ��
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
		
		// 1���� ���� �Է��� ���ڱ����� ������ �Է��ϼ���.
		
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<= number; i++) {
			sum = sum + i;
			System.out.println("���� : " + sum);
		}
	
	}
}
