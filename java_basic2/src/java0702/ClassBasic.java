package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		
		// �Լ��� �޼����� ���̴� ���������� �ͼӵǾ� �ֳ� ������ ���̴�.
		// �Լ��� �������̰� �޼���� ���ӵǾ� �ִ� �Լ���.
		
		// class �̸� { } -> ���⼭ �̸��� ù ���ڴ� �빮�ڷ� �����Ѵ�.
		// ��) Scanner, String, Arrays
		
		// ���ǵ� Ŭ���� Ÿ���� ������ �����Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ�.
		
		// Ŭ���� �ν��Ͻ� ���� - ������ �޼���
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		
		member1.name = "�̼���";
		member1.age = 23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name = "������";
		member2.age = 34;
		
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		// java - 495p, �޸�����ȭ��� - 893p
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		System.out.println(book1.title);
		System.out.println(book1.page + "p");
		System.out.println(book2.title);
		System.out.println(book2.page + "p");
		
		Smartphone phone1 = new Smartphone();
		Smartphone phone2 = new Smartphone();
		Smartphone phone3 = new Smartphone();
		
		phone1.name = "�Ｚ";
		phone2.name = "����";
		phone3.name = "������";
		
		phone1.operatingsystem = "�ȵ���̵�";
		phone2.operatingsystem = "iOS";
		phone3.operatingsystem = "������";
		
		phone1.ram = 8;
		phone2.ram = 16;
		phone3.ram = 32;
		
		System.out.println(phone1.name + " " + phone1.operatingsystem + " " + phone1.ram + "GB");
		System.out.println(phone2.name + " " + phone2.operatingsystem + " " + phone2.ram + "GB");
		System.out.println(phone3.name + " " + phone3.operatingsystem + " " + 	phone3.ram + "GB");
		
		
		
		// ����Ʈ�� ��ǰ��, � ü��, �޸�(ram) ũ�⿡ ���� ������ �� �մ� Ŭ������ �����ϰ� �ν��Ͻ� �������Ͽ�
		// �� ����, ����� �ϼ���(����Ʈ�� 3��)

	}

}

// å ����� �� ������ ���� �����ϱ� ���� Ŭ���� ����
class Smartphone{
	String name;
	String operatingsystem;
	int ram;
}

class Book{
	String title;
	int page;
}

// Ŭ���� - ���赵, ��ü - ��ǰ
// Ŭ���� - �ؾƲ, ��ü - �ؾ

// Ŭ������ ����� ���� ������ Ÿ���̶�� �Ѵ�.
class Member{	// Member��� �̸��� Ŭ���� ����
	String name;	// �̸�
	int age;	// ����
	Member(){
		
	}
}