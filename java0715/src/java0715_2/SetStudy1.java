package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<>();
		
		����.add("¥���"); ����.add("������");
		����.add("������"); ����.add("�޲ٹ̺���");
		
		���.add("��ġ������"); ���.add("������");
		���.add("¥���"); ���.add("������");
		System.out.println( ��� );
		
		// ������ - �� �� �̻��� �׷쿡 �������� ���� ����
		HashSet<String> ���� = new HashSet<>();
		
		Iterator<String> it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if(���.contains(����food)) {
				����.add(����food);
			}
		}
		
		System.out.println("����, ��� ������ : " + ����);
		
		// ������ - A���տ��� B���հ��� ������ �����͸� ������ �������� ����
		HashSet<String> ������ = new HashSet<>();
		it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if( !���.contains(����food)) {
				������.add(����food);
			}
		}
		System.out.println("��ο� ���� ���� ������ : " + ������ );
		
		// ������ - A���հ� B������ ��(�ߺ� ����)
		HashSet<String> �� = new HashSet<>();
		�� = (HashSet<String>)����.clone();
		��.addAll(���);
		System.out.println(��);
		

		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while(num1.size() <= 10) {
			num1.add(Integer.valueOf( (int)(Math.random()*50)));
		}
		System.out.println(num1);
		while(num2.size() <= 10) {
			num2.add(Integer.valueOf( (int)(Math.random()*50)));
		}
		System.out.println(num2);
		while(num3.size() <= 10) {
			num3.add(Integer.valueOf( (int)(Math.random()*50)));
		}
		System.out.println(num3);
		
		// num1, num2, num3 �� ���� ������ ����� ���� 1 ~ 50������ ������ 15�� ������ �ϼ���.
		// num1�� num3�� ������
		// num1�� num2�� ������
		// num2�� num3�� ������
		// num1, num2, num3�� ������
		

        HashSet<Integer> ������13 = new HashSet<>();
        for (Integer num : num1) {
            if (num3.contains(num)) {
                ������13.add(num);
            }
        }
        System.out.println("num1�� num3�� ������: " + ������13);

        HashSet<Integer> ������12 = new HashSet<>();
        for (Integer num : num1) {
            if (!num2.contains(num)) {
                ������12.add(num);
            }
        }
        System.out.println("num1�� num2�� ������: " + ������12);

        HashSet<Integer> ������23 = new HashSet<>();
        for (Integer num : num2) {
            if (num3.contains(num)) {
                ������23.add(num);
            }
        }
        System.out.println("num2�� num3�� ������: " + ������23);

        HashSet<Integer> ������ = new HashSet<>();
        ������.addAll(num1);
        ������.addAll(num2);
        ������.addAll(num3);
        System.out.println("num1, num2, num3�� ������: " + ������);
		
		
		// ������ - addAll
		// ������ - retainAll		����.retainAll(���);
		// ������ - removeAll		����.removeAll(���);
		
		
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("�������");
//		hash.add("���� ����");
//		hash.add("¥���");
//		
//		System.out.println(hash);
//		
//		hash.remove("«��");
//		System.out.println( hash );
//		
//		for(String food : hash) {
//			System.out.println( food);
//		}
//		ArrayList<String> list = new ArrayList<>(hash);
//		System.out.println( list );
//		System.out.println( list.get(3) );
	}

}
/*
	Set �������̽�
	- HashSet, TreeSet
	- ������� ������� �ʴ´�.
	- �ߺ� ������� �ʴ´�.
	- �ε����� ����.
	- Set�� ����(�������� �׷�)�� �ٷ� �� ���ȴ�.
	- HashSet -> ������ ǥ��
	- TreeSet -> �˻��� Ưȭ
	
	
*/