package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class java2 {

	static Scanner scan = new Scanner(System.in);	

	public static void main(String[] args) {

		// ���� ���� �����͸� �ٷ� ���� �迭�� ����Ѵ�.
		// ��Ȳ�� ���󼭴� �迭�� ���� �� �Ǵ� ��쵵 ������ ������ �迭�� ������ �����͸� �����Ѵ�.
		
		// ���� �迭 �����
		// ������ �迭 ũ�⸦ �ø��ų� �ٿ��� ����ϴ� �迭
		
//		int[] a = new int[5];
//		
//		a[0] = 10; a[1] = 20; a[4] = 40;
//		
//		System.out.println(Arrays.toString(a));
//		
//		a = new int[7];
//		a[5] = 100;
//		System.out.println(Arrays.toString(a));
		
//		int[] num = new int[] {10, 20, 30, 40, 50};
//		System.out.println("ũ�� ������ : " + Arrays.toString(num));
//		// num[5] = 60; �ε��� ���� ����� ����
//		// �����͸� �߰��� �� �����Ϸ��� �迭�� ũ�⸦ �÷��� �Ѵ�.
//		int size = num.length;	// ���� �迭�� ũ��
//		
//		int[] temp = new int[size + 1];
//		for(int i = 0; i < size; i++) {
//			temp[i] = num[i];
//		}
//		
//		num = temp;
//		num[5] = 60;
//		System.out.println("ũ�� ���� �� : " + Arrays.toString(num));
		
		
		// ���ڿ����� ���� �񱳴� .equals()�� �Ѵ�.
		// ���ڿ��� Ư�����ڳ� ���ڿ� ���� ���δ� .contains()
		// ���� �ּ� �� ��ȭ���� �ּҸ� �����Ͽ� �迭�� �����ϼ���.
		// �迭�� �� ����Ǿ����� Ȯ�� ����� Arrays �̿��Ͽ� ���
//		String[] addr = new String[] {
//				"���� �߱� ��ȭ�� 25", " ���� �߱� ��ȭ�� 92 ", " ���� ���� �л굿 111 ", "���� ���� �л굿 1023",
//				" ���� ������ ������ 93", "���� �߱� ���ﵿ 932", "���� ���� ���絿 945", "���� �߱� ��ȭ�� 1234",
//				"���� �߱� ���ﵿ 23", "���� �߱� ��ȭ�� 984"
//		};
//		
//		// System.out.println("������ �Է��ϼ��� : " + Arrays.toString);
//		
//		// addr[i].contains("��ȭ��");
//		// addr �迭�� ũ�⸸ŭ �����ϱ�, ��ȭ�� ī���� �� ��ŭ ����
//		
//		String[] ��ȭ�� = new String[addr.length];
//		int index = 0;
//		
//		for(int i = 0; i < addr.length; i++) {
//			if(addr[i].contains("��ȭ��") ) {
//				��ȭ��[index] = addr[i];
//				// index++;
//			}
//		}
//		
//		System.out.println(Arrays.toString(��ȭ��));
		
		
		// 2���� �迭
		// 1���� �迭�� ������ 1���� �迭�� ������ ���� ����
		
//		int[][] arr = new int[2][3];
//		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[2][1] = 50;
		// ����б� 1�г� �л����� ����
		// 1�г��� 1�ݺ��� 6�ݱ��� �ִ�.
		// new int[6][30];
		
		int[] a = new int[] {10,20,30,40,50,60,70,80,90,100};
		
		// for(int i = 0; i < a.length; i++) {}
		for( int data : a) {	// forEach, each
			System.out.println(data);
		}
	
	}

}
