package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {

		HashMap<String, ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("�ڹټ�ġ", "javava", "��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("mysql ��ġ ���", "��ġ �λ�", "mysql��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("����", "�������", "����.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("��Դ¹�", "�Թ�", "��Ʃ��.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("�˽δ¹�", "ȭ���", "������ȭ���.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("����", "ġŲ����", "ġŲ������.jpg");
		board.put(temp.getTitle(), temp);

		System.out.println( board.get("����") );
		
		Scanner scan = new Scanner(System.in);
		// �̹��� �Խ����� �� ������ ����ϰ� ���� ���� ���� ������ �Է��ϸ� ������ �� �� �ִ�.
		
		Set<String> titles = board.keySet();
		System.out.println("=== �̹��� �Խ��� ��� ===");
		
		titles.forEach( title -> System.out.println(title) );
		
		System.out.println("�� ���� �Է� : ");
		String inputTitle = scan.nextLine();
		
		System.out.println(board.get(inputTitle));
	}

}
