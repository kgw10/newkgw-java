package java0718_1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Th1 th = new Th1();	// �Ϲ� Ŭ���� ��ü ����
		new Thread(th).start();// ������ ��ü ����
		
		for( int i = 1; i <= 5; i++ ) {
			System.out.println(" �߶��� �� �ÿ�������....." + i);
			Thread.sleep(2000);
		}
		
	}

}

class Th1 implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
	}
	
}