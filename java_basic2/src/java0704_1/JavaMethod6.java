package java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		
		// ��ǻ�Ϳ� ���������� �ϱ�
		// ��ǻ���� ���������� ���� comInput �޼��带 ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��,��,�п� ���� ����Ѵ�.
		// �޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		// 	    - ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		// Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		// main �޼��忡���� Game Ŭ���� ��ü�� �޼���鸸 ����
		
		Game game = new Game();
		game.comInput();
		game.userInput();
		game.winlose();
		
	}

}
class Game {	// rock - paper - scissors ����
	String com;
	String user;
	
	void comInput() {
		int temp = (int)(Math.random()*3) + 1;
		switch(temp) {
		case 0 : this.com = "����"; break;
		case 1 : this.com = "����"; break;
		case 2 : this.com = "��"; break;
		}
	}
	
	void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("����, ����, �� �� �ϳ��� �Է��ϼ���: ");
        this.user = sc.nextLine();
	}
	
	void winlose() {
		if(user.equals(com)) {
			System.out.println("���º�");
		} else {
			switch(user) {
			case "����" : 
				if(com.equals("����")) {System.out.println("�й��߽��ϴ�.");}
				else {System.out.println("�¸��߽��ϴ�.");}
				break;
			case "����" : 
				if(com.equals("��")) {System.out.println("�й��߽��ϴ�.");}
				else {System.out.println("�¸��߽��ϴ�.");}
				break;
			case "��" : 
				if(com.equals("����")) {System.out.println("�й��߽��ϴ�.");} 
				else {System.out.println("�¸��߽��ϴ�.");}
				break;
			}
		}
        
  
	}
}