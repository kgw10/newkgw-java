package java0709;

public class ObhectArray2 {

	public static void main(String[] args) {
		
		Game[] gm = new Game[7];
		
		gm[0] = new Game("���� ���� ������", "AOS", "PC");
		gm[1] = new Game("������ġ2", "FPS", "�÷��̽����̼�");
		gm[2] = new Game("������ ����", "�׼�", "switch");
		gm[3] = new Game("���� ������", "���÷���", "���ٵ�");
		gm[4] = new Game("���� Ŀ��", "�׼�", "���ٵ�");
		gm[5] = new Game("��Ÿũ����Ʈ", "RTS", "PC");
		gm[6] = new Game("������", "MMORPG", "PC");

		for(Game game : gm) {
			System.out.println(game);
		}
	}

}
// 7���� ���� ������ ���� ��ü�� �����ϰ� ����ϼ���