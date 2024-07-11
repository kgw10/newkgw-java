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
		
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호
		// 위 이름을 ArrayList에 저장하고 출력하세요
		
		ArrayList<String> names = new ArrayList<> ();
		names.add("김춘추");
		names.add("장영실");
		names.add("이성계");
		names.add("정몽주");
		names.add("정도전");
		names.add("김정호");
		
		for(String name : names) {
			System.out.println(name);
		}
		names2.forEach(name -> System.out.println(name));
	}

}
/*
	자바 컬렉션 프레임워크
	
	데이터를 저장, 관리하기 위한 자료 구조와 데이터를 가공 처리하는 알고리즘의 클래스들의 집합체
	
	Collection, Map 인터페이스
	
	Collection 인터페이스
		- List 인터페이스
			ArrayList 클래스
			vectior
			LinkedList
			Stack
			Queue
		- Set  인터페이스
			HashSet
			TreeSet
			LinekdHashSet
		- Map 인터페이스
			- Hash<ap
			- TreeMap
			- LinkHashMap

*/