package java0626;

import java.util.Scanner;

// import java.util.Scanner;

public class javase {

	public static void main(String[] args) {

//		System.out.println("�ڹ����");
		// System.in - �Է�

		// �Է� ���� �� �ִ� ���� Ŭ���� - Scanner		
		Scanner scan = new Scanner(System.in);  
		
		// float Ÿ�� - nextFloat(), double - nextDouble()
		// byte - nextByte()	short - nextShort()
		// char�� ����.
		// ���ڿ� �Է� - nextLine(), next() 
		
//		int a = scan.nextInt();
//		System.out.println(a);
		
		// ������ ���ְ� �Ծ����� óö���� ������ �Ա� ���� �������� ����. ��Զ��, 
		// �ﰢ���, �ٳ��� ������ �Ծ���. ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?

//		System.out.println("�ڹ����");
//		Scanner scan = new Scanner(System.in);
//		
//		int a = scan.nextInt();
//		System.out.println(a);
//		
//		int b = scan.nextInt();
//		System.out.println(b);
//		
//		int c = scan.nextInt();
//		System.out.println(c);
//		
		// int total = a + b + c;
		
		// System.out.println(total);
		
		
		// �μ��� ģ������ ������ ���� ���Դ�.
		// ���ͼ� ���� ������ ���� �ͼ� ���� ���� �Դ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���ٿӴ�.
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö󰡴µ� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� ����?
		
//		float sec = 3.4f;
//		int floor = 5;
//		int out = 2;
//		int in = 2;
//		float total = sec * floor * out * in;
//		System.out.print(total);
		
		// ���α׷� �ڵ�� �⺻ ���������� ����ȴ�.
		// if, �Լ�(�޼���)
		
		/*
		 �������� ������ ����, �Ǽ�, ����, boolean(��, ����)
		 ������ Ÿ��
		  	���� - byte, short, int, long
		  	���� - char
		  	�Ǽ� - float, double
		  	�� ���� - boolean
		  	
		 ���� ���� ���
		 int num;	���� Ÿ�� ���� ����
		 double dnum; 	�Ǽ� Ÿ�� ���� ����
		 char ch; ���� Ÿ�� ���� ����
		 boolean bool; �� ���� ���� ����
		 
		 ���� �ʱ�ȭ
		 int num = 10; 	���� ����� �Բ� �����͸� ���� 
		  
		 ��� ���
		 System.out.println(��³���);
		 System.out.print(��³���);
		 System.out.printf(��³���);
		 
		 printf ���� �Բ� ����ϴ� ����������
		 	%d, %u - ����, %f - �Ǽ�, %c - ����, %s - ���ڿ�
		 	
		 int age = 28;
		 System.out.printf("%s ������ ���̰� %d���� ���������� %c ��", 
		 "�ڵ���", age, '��');
		 
		 �Է� ���
		 Scanner Ŭ���� ��ü �ʿ�
		 Scanner ���� = new Scanner(system.in);
		  *Scanner Ŭ������ ����ܺ�Ŭ�����̹Ƿ� import �ؾ� �Ѵ�.
		 
		 
		 	����.nextInt();	������ �Է�
		 	����.nextByte();	byte Ÿ�� ������ �Է�
		 	����.nextShort(); shortŸ�� ������ �Է�
		 	����.nextLong(); longŸ�� ������ �Է�
		 	����.nextFloat(); floatŸ�� ������ �Է�
		 	����.nextDouble(); doubleŸ�� �Ǽ��� �Է�
		 	����.next(); ���ڿ� �Է�
		 	����.nextLine(); ���ڿ� �Է�
		 
		 
		 c���, �ڹ�, �����а��� ���� ������ �Է��ϼ���.
		 �� ������ ������ ����� ���� ����ϼ���.
		  
		 */
		
//		System.out.printf("����");
//		Scanner ���� = new Scanner(System.in);
//
//		float c��� = ����.nextFloat();
//		float �ڹ� = ����.nextFloat();
//		float �����а��� = ����.nextFloat();
//		float total = c��� + �ڹ� + �����а���;
//		float avg = total/3;
//		
//		System.out.printf("���� : " + total + "\n");
//		System.out.printf("��� : " + avg);
		
		int C, java, �����а���;
		
		System.out.print("c��� ���� : ");
		C = scan.nextInt();
		System.out.print("�ڹ� ���� : ");
		java = scan.nextInt();
		System.out.print("�����а��� ���� : ");
		�����а��� = scan.nextInt();
		
		int total = C + java + �����а���;
		int avg = total/3;
		
		System.out.printf("���� : %d��, ��� : %d�� \n", total, avg);
		
	}
}
