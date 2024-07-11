package java0711;

import java.util.ArrayList;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		// Byte = byte
		// short -> short
		// Integer - int
		// Long -> long
		// Dcuble = >duglce
		// Character - > cahr
		// Boolean boolean
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(89);
		list1.add(230);
		list1.add(4542);
		list1.add( 3434);
		list1.add(2);
		
		
		System.out.println(list1); 
		System.out.println(list1.get(2));
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// ������, �念��, �̼���, ������, ������, ����ȣ
		// �� �̸��� ArrayList�� �����ϰ� ����ϼ���
		
		ArrayList<String> names = new ArrayList<> ();
		names.add("������");
		names.add("�念��");
		names.add("�̼���");
		names.add("������");
		names.add("������");
		names.add("����ȣ");
		
		for(String name : names) {
			System.out.println(name);
		}
		names2.forEach(name -> System.out.println(name));
	}

}
/*
	�ڹ� �÷��� �����ӿ�ũ
	
	�����͸� ����, �����ϱ� ���� �ڷ� ������ �����͸� ���� ó���ϴ� �˰����� Ŭ�������� ����ü
	
	Collection, Map �������̽�
	
	Collection �������̽�
		- List �������̽�
			ArrayList Ŭ����
			vectior
			LinkedList
			Stack
			Queue
		- Set  �������̽�
			HashSet
			TreeSet
			LinekdHashSet
		- Map �������̽�
			- Hash<ap
			- TreeMap
			- LinkHashMap

*/