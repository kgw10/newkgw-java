package java0712_3;

public class LinkedList2 {

	Node head;	// ��ũ�� ����Ʈ�� ù ��° ���
	Node tail;	// ��ũ�� ����Ʈ�� ������ ���
	
	
	void add(int n) { // �� ������ ����
		
		
		
	}
	
	@Override
	public String toString() {	// ��ü ���
		Node move = head;
		while(move != null) {
			System.out.println(move.num)
			move = move.next;
		}
		
		
		return null;
	}
	
	int get(int index) {	// ������ ��ġ�� ������ ���
		return 0;
	}
	
	void remove(int index) {	// ������ ��ġ�� ������ ����
		
	}
}

// �� ������ ���� - ad
// ������ ���� - remove
// ��ü ��� - toString()
// ������ �ϳ� ��� - get