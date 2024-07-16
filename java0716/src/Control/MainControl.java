package Control;

import java.util.TreeMap;

public class MainControl {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println( tree);
		
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		System.out.println(tree.floorKey(15));
		System.out.println(tree.floorKey(33));
		System.out.println(tree.floorEntry(15));
		System.out.println(tree.subMap(10, 40));
		System.out.println(tree.lowerKey(25));
		System.out.println(tree.higherKey(40));
		
	}
}
