package java0627;

import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// ���ǹ� - if, switch
		// �ݺ��� - for, while, do~while
		// 
		// if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
		//				��, ���� ������ ���� �� �ִ� ��
		// Ű�� 150�̻��̴�. Ű >= 150
		// 10�� ���� ���� ����	��ü���⳯¥ �� == 10
		// 32000�� �̻��� ���� ���� 	����� >= 32000
		// �Ǹ����� ��ǰ�鸸 ���		��ǰ���� == �Ǹ�, ������ > 0
		
		int tall = 135;
		if(tall >= 150) {
			// Ű�� 150�̻��� �´ٸ� ������ �� ������
		} else {
			// Ű�� 150�̻��� �ƴ϶�� ������ �� ������
		}
		
		
		// ���� �հ� ���� - �հ�(60�� �̻�), ���հ�(60�� �̸�)
		
		int score = 72;
		if(score >= 60) {
			// �հ��� �´ٸ�
			System.out.println("�հ��Դϴ�.");
		} else {
			// �հ��� �ƴ϶��
			System.out.println("���հ��Դϴ�.");
		}
		
		
		// if ~ else - ���ǽ��� ��, ������ ���� ����Ǵ� ������ �ٸ� ���
		// �ϳ��� ���ǿ� �� ���� ������ �ִ� ��쿡 if ~ else ������ �ۼ�
		
		// ���� ���� ��� - A(90�� �̻�), B(80�� �̻�), C(70�� �̻�), D(������)
		
		score = scan.nextInt();
		if (score >= 90) {
			System.out.println("A");
			
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70){
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		
		
		// pŰ�� �Ͻ�����, oŰ�� ����ϱ�, i�� ó������ �ٽ� ����
		// ctrl + s�� ���� �����̶�� �Ѵٸ�
		
		/*
		 
		 switch(Ű���尪)
		 	case 'a' : ���س���
		 	case 'a' : ���س���
		 	case 'a' : ���س���
		 	case 'a' : ���س���
		 	case 'a' : ���س���
		 	
		 
		 ���α׷� ��
		 
		 ���ǽ��� == �����ڰ� ���ȴٸ� switch���� �ۼ��ϴ� ���� ����غ���
		 
		 */
		
		String button = "����";
		
		switch(button) {
			case "����":
				System.out.println("���� ����");
				break;
			case "����":
				System.out.println("���� ����");
				break;
			case "����":
				System.out.println("���� ����");
		}
		
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���(������ �Ű澲�� ����)
		// ���� �Ǵ� ������ ���̰� ũ�ٸ� �����簢��
		// ���ο� ������ ���̰� ���ٸ� ���簢���̶�� ����ϼ���.
		// switch������ (if�� ���� ���� ����)
		
		

	}

}
