package java0712_3;

public class LinkedList2 {

	Node head;	// 링크드 리스트의 첫 번째 노드
	Node tail;	// 링크드 리스트의 마지막 노드
	
	
	void add(int n) { // 새 데이터 저장
		
		
		
	}
	
	@Override
	public String toString() {	// 전체 출력
		Node move = head;
		while(move != null) {
			System.out.println(move.num)
			move = move.next;
		}
		
		
		return null;
	}
	
	int get(int index) {	// 지정된 위치의 데이터 출력
		return 0;
	}
	
	void remove(int index) {	// 저장한 위치의 데이터 삭제
		
	}
}

// 새 데이터 저장 - ad
// 데이터 삭제 - remove
// 전체 출력 - toString()
// 데이터 하나 출력 - get