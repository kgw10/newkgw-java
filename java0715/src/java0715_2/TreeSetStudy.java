package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34);	tree.add(45);	tree.add(20);
		tree.add(9);	tree.add(40);	tree.add(15);
		tree.add(48);	tree.add(2);	tree.add(11);
		tree.add(39);
		
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());
		
// �Է°����� ū ���߿��� ���� ����� �� �˻�		
		
		System.out.println(tree.higher(25));
		System.out.println(tree.lower(19));
		
// �Է°����� ���� ��� ��
		
		System.out.println(tree.headSet(35));
		

		System.out.println(tree.tailSet(30));
		
// �Է°����� ���� ���� �˻�
		System.out.println(tree.subSet(9, 39));
		
		
		TreeSet<String> word = new TreeSet<>();
		word.add("�̼���"); word.add("������");
		word.add("�庸��"); word.add("������");
		word.add("������"); word.add("���س�");
		word.add("����"); word.add("������");
		word.add("���ƾ�");
		
		System.out.println(word);
		
		System.out.println( word.higher("��"));
		System.out.println( word.headSet("���"));
		System.out.println( word.subSet("��", "��"));
		
		// 90�� �̻� - ���� 10%, 70�� �̻� - ���� 30%
		// 40�� �̻� - ���� 80%
		
		Scanner sc = new Scanner(System.in);

        TreeSet<Integer> rank = new TreeSet<>();
        rank.add(90); rank.add(70); rank.add(40);

        // ���� ������ �Է��Ͽ� ���� �� �������� ���
        System.out.print("���� ������ �Է��ϼ���: ");
        int Score = sc.nextInt();

        if (rank.lower(Score) >= 90 ) {
        	System.out.println("���� 10%");
        } else if(rank.lower(Score) >= 70) {
        	System.out.println("���� 30%");
        } else if( rank.lower(Score) >= 40) {
        	System.out.println("���� 80%");
        }
		
		TreeSet<String> score = new TreeSet<>();
		score.add("89�� �̼���"); score.add("67�� ������");
		score.add("45�� ������"); score.add("98�� �Ѽ���");
		score.add("72�� �ڹ���"); score.add("81�� ������");
		score.add("59�� �̼���"); score.add("32�� �����");
		
		// �� ������ �Է��ϰ� ������ ������ ���� ����� ���
		System.out.print("������ �Է��ϼ���");
		String mysc = sc.nextLine();
		// System.out.println(score.higher("mysc"));
		System.out.println("������ ������ ���� ����� : " + score.tailSet(mysc));

		

	
	}

}
/*
	Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
	- ���������� ������ �������� �ʴ´�.
	- �ߺ� ������� ����.
	- ���� Ʈ���� ����ϱ� ������ �����Ͱ� ���ĵǾ� ����Ѵ�.
	- ���� �˻� �Ǵ� ������ �ߺ� ���� �� ���Ŀ� �����ϴ�.


*/