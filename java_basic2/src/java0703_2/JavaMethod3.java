package java0703_2;

import java.util.Scanner;

public class JavaMethod3 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		// ���� �� �� �Է� �޾� ���� ����ϱ�
//		Calc calc = new Calc();
//		calc.sum(40, 50);
		
		// calc.sum();
		
		// �� ������ ������ ���Ͽ� ����ϼ���
        int kor = 89, eng = 74, mat = 43;

        Study study = new Study();
        int total = study.sum(kor, eng, mat); 
        

        System.out.println("���� : " + total);
        


        // �޼��� ȣ���Ͽ� '�޼��� dog����~' ��� ���
        
        Calc subject = new Calc();

        
        subject.Study();
        
        Calc ab = new Calc();
        
        ab.view();
        
        // �޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
        // �Ű� ���� ���� �޼���, Ű���� �Է� X
        

        
        Jumin �ֹ� = new Jumin();
        �ֹ�.resident();
        
        // �޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
        String animal = "��� ��Ʈ����";
        String ������ = "2024 - 07 - 01";

        TestMethod testMethod = new TestMethod();
        testMethod.test(animal, ������);
        
        // ���� ��¥ �߿��� ���� �ϸ� ����ϼ���
        // ���ڿ� �޼��� substring �Ǵ� split ���
        String examDay = "2024-08-13";
        testMethod.day(examDay);
        testMethod.datePrint(examDay);
        
        // �� ����� ���� ��հ��� ���Ͽ� ����ϼ���.
        // ��հ��� �����Դϴ�.
        int ��� = 31, ���� = 23, ���� = 28, ��� = 37;
        testMethod.avg(���, ����, ����, ���);
        
	}

}

class TestMethod {
	
	void avg(int num1, int num2, int num3, int num4) {
		int total = num1 + num2 + num3 + num4;
		int average = total/4;
		System.out.println("���� ��� : " + average);
	}
	
	void datePrint(String date) {
		String[] current = date.split("-");
		System.out.println(current[1] + " " + current[2]);
	}
	
	void day(String examDay) {
		 
	     String month = examDay.substring(5, 7);
	     month = "8��";
	        
	     String Day = examDay.substring(8, 10);
	     Day = "13��";
		 System.out.println(month + " " + Day);	// 15

	}
	
	
    void test(String animal, String ������) {
        System.out.println(animal + " " + ������);
    }
}

// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
// Ŭ���� �޼���, Ŭ���� ������ Ŭ���� �̸����� ~~~ ���

class Jumin {
	void resident() {
		String name = "��ǿ�";
		int age = 20;
		System.out.println("�̸� : " + name + " , ���� : " + age + "��");
	}
}

class Calc {
	
	void view() {	// ���� a, b�� ���� ����ϴ� �޼���
		int a = 10, b = 20;
		System.out.println(a + " " + b);
	}

    void Study() {
        System.out.println("�޼��� dog����~");
    }
}
class Study {
    void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("�� : " + result);
    }

    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
//class Calc{
//	
//	void sum(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("�� : " + result);
//	}
//	
//	
//	void sum() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ù ��° ���� : ");
//		int num1 = scan.nextInt();
//		System.out.print("�� ��° ���� : ");
//		int num2 = scan.nextInt();
//		int result = num1 + num2;
//		System.out.println("�� : " + result);
//	}
//}