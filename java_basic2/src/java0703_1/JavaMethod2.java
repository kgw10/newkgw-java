package java0703_1;

import java.time.LocalDate;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {

		Member member1 = new Member("�̼���", 31, "����");
		Member member2 = new Member("������", 29, "���������");
		Member member3 = new Member("�念��", 45, "�߸�");
		// �¾ �⵵

		member1.birth();
		member2.birth();
		member3.birth();
		
		// ���� - 20���ΰ�? 30���ΰ�? 40���ΰ�? 50���ΰ�?
		
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(null, 0);
		
		// ���� ���� �з�
		// ���� - 05.����	�������� - 15.���
		// ����������� - 18.�����Ǻ�
		
		Job job1 = new Job("����", 05, ".����");
		Job job2 = new Job("��������", 15, ".���");
		Job job3 = new Job("�����������", 18, ".�����Ǻ�");
		
		System.out.println(job1);
		
		// System.out.println( today.getMonthValue());
		// �⵵ - .getYear();
		// �� - .getMonthValue();
		// �� - .getDayOfMonth();
	}
}

// ��Ʈ�ѿ� Ŭ����, ��������� ���� Ŭ����, ������ Ŭ����
// Controller, Service, DTO(VO)

class Job {
	String kind;
	int number;
	String function;
	
	Job(){}
	Job(String kind, int number, String function){
		this.kind = kind;
		this.number = number;
		this.function = function;
	}
	
	void JobKind() {
		
	}
}


class DataIdenti {	// ���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
	void ageGroup( String name, int age ) {
		
		String group = null;
		group = age/10 + "0��";
		System.out.println(name + " : " + group);
	}
}




class Member{
	String name;	// �̸�
	int age;	// ����
	String job;	// ����
	// �⺻ ������ �޼���
	Member(){}
	// �Ű� ������ �ִ� ������ �޼���
	Member(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	// �¾ �⵵ �����ΰ� �⤩���ϴ� �޼���
	void birth(  ) {
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		// ȭ�� ��� - �̼��� �¾ �⵵ : 0000�⵵
		
		int birthYear1 = nowYear - this.age;
		System.out.printf("%s �¾ �⵵ : %d�� \n", this.name, birthYear1);
	}
}



// �޼��峪 �Լ��� ����ϴ� ����
// �迭, ��� - �ݺ���
// �޼��带 ����ϸ� �ڵ��� ����� ���� ����, �������� ���� ����.
// �޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.
// 