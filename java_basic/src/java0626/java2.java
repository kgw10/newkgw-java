package java0626;

import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		
		
		
		/* �ڵ� �ۼ��ϱ� �� �ؾ��� �� - ���� �ľ�, �䱸���� ����
		 
		 // ���ڿ� - " " ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
		   ���ڿ��� String Ŭ����Ÿ���� ����ؾ� �Ѵ�.
		 	
		 	
		 	����2.
		 	���� �̸�, �ҼӺμ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
		 	������ 8%�� ����. �Ǽ��ɾ��� ������ ���
		 	�̸�, �μ�, �Ǽ��ɾ��� ����ϼ���
		 	�� ���� ������ ���� ����ϼ���.
		 
		 */
		Scanner sca = new Scanner(System.in);
		
		String name, dept, name2, dept2;
		int money, money2;
		float tax = 0.08f;
		
		System.out.print("�̸� : ");
		name = sca.nextLine();
		System.out.print("�μ� : ");
		dept = sca.nextLine();
		
		System.out.print("�� �޿� : ");
		money = sca.nextInt();		
		float salary = (int)(money - (money*tax));

		System.out.println("�̸� : " + name + " �μ� : " + dept + " ���ɾ� : " + salary );
		
		sca.nextLine();

		
		System.out.print("�̸� : ");
		name2 = sca.nextLine();
		System.out.print("�μ� : ");
		dept2 = sca.nextLine();
		
		System.out.print("�� �޿� : ");
		money2 = sca.nextInt();
		
		float salary2 = (int)(money2 - (money2*tax));
		
		System.out.println("�̸� : " + name2 + " �μ� : " + dept2 + " ���ɾ� : " + salary2);
		
		
		/*
		  next() - �����̽�Ű, ��Ű, ����Ű�� ������ �Է� ��
		  nextLine() - ����Ű ������ �Է� ��
		  
		  
		 */
	}

}
