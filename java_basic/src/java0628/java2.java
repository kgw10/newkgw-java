package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class java2 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		// name �迭�� ���ڿ� �߿��� �̼���, ������, ������, �ֿ��� ���ߴ� �迭�� �����ϰ� ����ϼ���.
		String[] name = new String[] {
				"�̼���", "������", "�庸��", "�̼���", "������", "������", "�ֿ�", "�縸��"
		};
		
		String[] ���ߴ� = new String[4];
		System.arraycopy( name,3, ���ߴ�, 0, 4);
		System.out.println(Arrays.toString(���ߴ�));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 6���� Ű�� tall �迭�� �����Ͽ���.
		// Ű 175 �̸��� ����ϼ���
//		float[] tall = new float[] { 173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
//		
//		for(float i = 0; i < tall.length; i++) {
//			if(tall[i] < 175) {
//				System.out.println(tall[i]);
//			}
//			
//		
		
		
		// ���� �迭�� �����ϴ� ������ �Ǹ� ������ Ű����� �Է��Ͽ� �����ϼ���.
		// ���� �迭�� ����� �ǸŰ��ݵ��� ���հ� ����� ���ϼ���.
//		int[] ���� = new int[5];
//
//		for(int i = 0; i < ����.length; i++) {
//			System.out.println("���� " + (i + 1) + "���� : ");
//			����[i] = scan.nextInt();
//		}
//		int total = 0, avg = 0; 	// ���հ� ���
//		for(int i = 0; i < ����.length; i++) {
//			total = total + ����[i];
//			
//		}
//		avg = total/����.length;
//		
//		System.out.println("���� : " + total + " ��� : " + avg);
		
		
		
	}

}
