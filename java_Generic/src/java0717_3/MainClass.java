package java0717_3;

import java.util.Date;



@FunctionalInterface
interface moveable {
	public void move();
}

class A<T> {
	T item;
	void get( T add ) {
		
	}
}

public class MainClass {
	
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {
		aaa();
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		
		//today.getYear();

	}

}
/*
	�����ڸ� ���� �޸� - �ּ�
	annotation - �ּ� ���� �ǹ̸� ������.
	Ư�� �ڵ���� ��ǻ�Ϳ��� ���� ����
	ǥ�� annotation, a��Ÿ annotation
	
	@Override
	�����Ϸ����� �޼��带 �������̵��ϴ� ���̶�� �˷��ش�.
	
	@Deprecated
	������ ������� ���� ����̶�� �˷��ش�.
	
	@SuppressWarnings
	�����Ϸ� ��� ������� �ʰ��ϵ��� ����

	- @SuppressWarnings("all") ��� ��� ����
					   ("deprecation") ������� �ʴ� ��� ��� ����
					   ("null") null�� ���õ� ��� ����
					   ("unchecked") ��Ȯ�� ���۷��̼� ��� ����
					   ("unused") ������� �ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ��� ����
					   
					   
	@FunctionalInterace
	�Լ��� �������̽���� ���� �˷��ش�.
	
	@Safevaragrs
	���׸��� ���� ���� ������ �Ű������� ����� �� ��� ��Ÿ���� �ʱ�
	
	
	��Ÿ annotation
	@Target	  - �������̼��� ������ �� ������ ��� ����
	@Documented - javadoc�� �ۼ��� ������ ����
	@Inherited - ���� Ŭ������ ��ӵǵ��� �� �� ���
	@Retention - �ֳ����̼� �Ⱓ ����
	@Repeatable - �ֳ����̼� �ݺ� ����

*/