package java0628;

import java.util.Arrays;

public class java1 {

	public static void main(String[] args) {
		
		// �迭 - ���� ������ Ÿ�� �����Ͱ� ����Ǵ� ������ ���������� �Ǿ� �ִ� ����
		
//		int[] a = {10, 20, 30};
//		System.out.println(a[0] + "  " + a[1]);
//		
//		int b[] = { 30, 40, 50 };
//		
//		System.out.println(Arrays.toString(a));
//		
//		int[] arr = new int[10];
//		// �迭�� ���� 10�� ����
//		int[] brr = new int[] {10, 20, 30, 40};
//		
//		int size = 15;
//		int[] arr2 = new int[size];
//		
//		System.out.println(arr2[0]);
		
		// �迭 ���� ���
		// ������ Ÿ��[] �迭 �̸� = new ������ Ÿ��[�迭 ũ��];
		
		int[] money = new int[5];	// 5���� int Ÿ�� ������ ���� �迭
		money[0] = 5000;
		money[1] = 12000;
		money[2] = 4000;
		money[3] = 43000;
		money[4] = 50000;
		
		// 10000 �̻��� �� ���
		for( int i = 0; i < money.length; i++ ) {
			if( money[i] >= 10000 ) {
			System.out.println(money[i]);
			}
		}
		int[] A�� = new int[3];
		A��[0] = 89; A��[1] = 78; A��[2] = 93;
		
		int[] B�� = new int[3];
		B��[0] = 56; B��[1] = 84;
		B��[2] = 72; 
		
		System.out.println("A�� ���� : " + Arrays.toString(A��));
		System.out.println("B�� ���� : " + Arrays.toString(B��));
		
		// A��, B�� ���� �߿��� 80�� �̻� ���
		for(int i = 0; i < A��.length; i++) {
			if(A��[i] >= 80)
				System.out.println(A��[i]);
			if(B��[i] >= 80)
				System.out.println(B��[i]);
		}
		int[] ���г� = new int[A��.length + B��.length];
		
		System.arraycopy();	// �迭 ����
		
		
		
		
		
		
		
//		for(int i = 0; i < A��.length; i++) {
//			���г�[i] = A��[i];
//			���г�[i+3] = B��[i];
//		}
//		
		
		
//		for(int i = 0; i < ���г�.length; i++) {
//			if( i < 3) {
//			���г�[i] = A��[i];
//			} else {
//				���г�[i] = B��[i - 3];
//			
//			}
//			System.out.println(���г�[i]);
//		}
		
		
		
		
		
	}

}
