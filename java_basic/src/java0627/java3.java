package java0627;

import java.util.Scanner;

public class java3 {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		
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
		
//		System.out.print("���� �Է� : ");
//		int number = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i<= number; i++) {
//			sum = sum + i;
//		
//			System.out.println("���� : " + sum);
//		}
		
//		for(int i = 1; true; i++) {
//			System.out.println(i);
//		}
		
		// �ݺ����� �ۼ��Ϸ��� �� �� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		// �ݺ��� ���� ������ ���ؼ� ���� �����ؾ� �Ѵ�.
		// for��, while��, do~while�� ��� ���� �ݺ��� ������ �ϴ°��� ã�� ���ϸ� �ۼ��� �� ����.
		// (���ѷ����̵�, n�� �ݺ��̵�)
		
//		for( ; true; ) {
//			System.out.print("���� �Է� : ");
//			int num = sc.nextInt();
//			if(num == 0) break;
//		}
		
		
		// ���ѷ��� �����Ű�� ��
		// 1. if���� ���ǽ��� ���̵Ǹ� break ����
		// 2. for( ; ���ǽ� ;)
		// 3. return; - �ݺ��� �ڵ尡 �ִ� �޼��带 �����Ű�� ������ �ݺ����� ����ȴ�.
		// break; - �ݺ���, switch ��� ���� if�� �ܵ����� break ��� �Ұ�
		// if(10>5) break; �̰� ����!!
		
		// continue;
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "���� �ݺ� ����");
//			if(i%3 == 0) continue;
//			System.out.println(i + "��° �ݺ� ������");
//			System.out.println(i + "��° �ݺ� ������ ����");
//		}
		
		// �ڹ��� ����
		// int random = (int)Math.floor(Math.random() * 10)+ 1;
		
		// ������ ����(1~50)
		// ���� �� ��� ���
		// �������� 11�� ����� ��� �ݺ��� ����
		
//		int random = (int)Math.floor(Math.random() * 50)+1;
//		for(int i = 1; i <= random; i++) {
//			System.out.println(i);
//			if(i%11 == 0) continue;
//		}
		
		// up & down �����
		// ��ǻ�Ͱ� ������ ���� ���߱�
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� ��������(�������� 20~100)
		// ��ǻ�Ͱ� ������ ���ڰ� 74���
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
//		System.out.println("���ڸ� �Է��ϼ��� : ");
//		int com = (int)Math.floor(Math.random() * 81)+20;
//		for( ; true; ) {
//		int user = sc.nextInt();
//
//			if(user == com) {
//				System.out.println("�����Դϴ�.");
//			} else if(user > com) {
//				System.out.println("down");
//			} else {
//				System.out.println("up");
//			}
//		}
		
		// �̸��� �ִ� �ݺ���
		
		
//		int sum = 0;
//
//		���ϱ� : for(int i = 1; i <= 10; i++) {
//			for(int k = 1; k <= 4; k++) {
//				if(sum + k > 40) break ���ϱ�;
//				sum = sum + k;
//				System.out.println("     " + k);
//			}
//			System.out.println(i);
//			sum = sum + i;
//		}
//	
//		if(sum > 40) {
//			System.out.println("sum ��� : " + sum);
//		}
		
		
		// ����Ų��� 31
		// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
		// �� ���� ������ �� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
		// 31�� �Է��ϸ� �й�
		
		int num = 1;
		
		����Ų:
		for (;;) {	// while(true)
			System.out.print("���� �� �� : ");
			int user = sc.nextInt();
			System.out.print("�� : ");
			for(int u = 1; u<user; u++) {
				System.out.print(num + " ");
				if(num  == 31) break ����Ų;
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
