package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		
		Book book = new Book();
		book.setTitle("JAVA 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		
		Book book2 = new Book("JAVA, 웹, 성공적","이병헌", 564);

		System.out.println(book2);
	}

}
/*
클래스 
	- 변수, 메서드
	- 인스턴스, 클래스
	- 생성자 메서드
	- 인스턴스 변수, 클래스 변수 초기화
	- 오버로딩
	- 오버라이딩
	- 상속
	- 제어자
	- 다향성
	- 추상화
	- 인터페이스
	- 내부 클래스(익명 클래스, 정적 클래스)
	- 열거형
	
컬렉션	- 자료 구조와 알고리즘
	- collection, List, Map, Set
	- ArrayList, Vector, LinkedList, Queue, stack , HashSet, TreeSet
	- HashMap, treeMap 등등
	
	
제네릭
매너테이션
스트림
쓰래드
JAVA 기본 문법 끝
->


*/