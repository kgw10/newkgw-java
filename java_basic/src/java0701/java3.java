package java0701;

import java.util.Scanner;

public class java3 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// �ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�.
		// String Ŭ������ ���������� char �⺻ ������ Ÿ���� �迭�� �����ǵ��� �Ǿ� �ִ�.
		// char Ÿ������ ������ �迭�� ���� �迭�� ������ �Ѵ�.
		// ���α׷����� ���Ǵ� ������ �� 70% ������ ���ڿ� �������̴�.
		// ���ڿ� ���� �޼���� ���� �� �ݵ�� ������ �Ѵ�.
		
		// ���ڿ� �����͸� �����ϴ� ���
		
//		String word = "i like banana";
//		
//		// ���ڿ� �� - ���� ���ڿ��ΰ�?
//		// equals
//		System.out.println("equals : " + (word.equals("i like orenage") ));
//		
//		// ���ڿ� ���� ����
//		System.out.println("contains : " + (word.contains("banana")));
//		System.out.println("indexOf : " + word.indexOf("orange"));
//		
//		// ���ڿ� ��ġ��
//		System.out.println(word + " ��ġ��");
//		System.out.println(word.concat(" ��ġ�� "));
//		
//		// Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��
//		System.out.println(word.indexOf('b'));
//		System.out.println(word.lastIndexOf('a'));
//		
//		
//		// ���ڿ����� Ư�� ���� ����
//		System.out.println(word.charAt(0));
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// Ű����� ���� �Է� �ޱ�
//		System.out.print("���ĺ� �ϳ� �Է� : ");
//		char alp = sc.nextLine().charAt(0);
//		System.out.println("�Է��� ���� : " + alp);
//		
//		// ���� �ڵ� �߿��� �⺻ ���� �ڵ�� �ƽ�Ű �ڵ��̴�.
//		// �ƽ�Ű�ڵ�ǥ�� �� 128�� ����
//		// �ƽ�Ű�ڵ忡�� 65�� �빮�� A, 97�� �ҹ��� a
//		char ch = 65;
//		System.out.println(ch + 4);
//		
//		// ���ڿ��� ����
//		System.out.println("���ڿ� ���ڼ� : " + word.length());
//		
//		// �빮�� �ҹ��� ��ȯ
//		String �빮�� = word.toUpperCase();
//		String �ҹ��� = word.toLowerCase();
//		
//		System.out.println(�빮��);
//		System.out.println(�ҹ���);
//		
		
		// ���� ����
//		String word2 = " i hate java ";
//		System.out.println(word2);
//		System.out.println(word2.trim());
//		
		// �� �޼��� �� ���� ���� ���Ǵ� �͵�
		// equals, contains
		
		// ���ڿ� ����
		// System.out.println( Arrays.toString(word.split(" ")) );
//		String name = "�̼���@������@������@";
//		
//		String[] names = name.split("@");
//		System.out.println(names[1]);
//		
//		// ���ڿ� �ڸ���(����)
//		
//		System.out.println(word.substring(2));
//		System.out.println(word.substring(6));
//		System.out.println(word.substring(2, 6));
		
		
		
		// ���ڿ� ��ȯ
//		String ���ұ� = "�������� �չ� �۰� ������ �ڰ� ���� ������ ���� ���׿�."
//				+ "���� ������ ���� �������, ������ ��� ������ �Ծ�����";
//		
//		String ���� = ���ұ�.replace("��������", "�б�������");
//		System.out.println(����);
//		
//		���� = ����.replaceAll("�б�������", "������ ����");
//		System.out.println(����);
		
		// replaceAll������ ����ǥ���� ��� ����
		/*
		  
		  ���� ǥ����
		  ^ - ���ڿ��� ����
		  $ - ���ڿ��� ����
		  . - ������ �� ����
		  * - �� ���ڰ� �ְų� ���ų�  (*�� -> �� �� ������ �ܾ�)
		  + - �� ���ڰ� �ϳ� �̻�
		  ? - �� ���ڰ� ���ų� �ϳ� ����
		  [] - ������ �����̳� ������ ��Ÿ��
		  {} - Ƚ�� �Ǵ� ����
		  () - �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		  | - ���� �ȿ��� or ���� ����
		  \s - ���� ����
		  \S - ���鹮�ڰ� �ƴ� ������ ����
		  \w - ���ĺ��̳� ����
		  \W - ���ĺ��̳� ���ڸ� ������ ����
		  \d - ����
		  \D - ���ڸ� ������ ��� ����
		  
		  
		  ���ڿ����� ���ڸ� ���� - replace("[0-9]", "");
		  ����ó - ^010-(?:\d{4})-\d{4}$
		  �ѱ۸� �ۼ� Ȯ�� - ^[��-�G]
		  
		 */
		
//		String a = "abc73jd82kd74j�츮����";
//		System.out.println(a.replaceAll("[0-9]", ""));
//		System.out.println(a.replaceAll("[\\d]", ""));
//		System.out.println(a.replaceAll("^[��-�G]",""));
//		
		
		
		
		/*
		 String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�."��� ���ڿ��� ���� ���� String
		 Ŭ������ �޼��带 �̿��� stirng name -> "ȫ�浿", int age -> 15�� ����ǵ��� �ڵ带 �ۼ��Ͻÿ�
		 (��, String Ŭ������ indexOf(), substring() �޼������ �ݵ�� �� �� �̻� ����ؾ� ��).
		 
		 String bb = "203"
		 int cc = Integer.parseInt(bb);	// ���ڿ��� ������ ��ȯ
		 
		 String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�.
		 String name;
		 int age;
		 
		 
		 System.out.println(name);	// ȫ�浿
		 System.out.println(age);	// 15
		 */
		
		
		 // String bb = "203";
		 // int cc = Integer.parseInt(bb);	// ���ڿ��� ������ ��ȯ
		 
		 String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�.";
		 String name;
		 int age;
		 
	     name = str.substring(str.indexOf('[') + 1, str.indexOf(']'));
	        
	     String temp = str.substring(str.lastIndexOf('[') + 1, str.lastIndexOf(']'));
	     age = Integer.parseInt(temp);
		 // ��� ���
		 
		 System.out.println(name);	// ȫ�浿
		 System.out.println(age);	// 15


	        

		
		
		
		
		
		

		
		
		
		
		
	}


}
