package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {

		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for( Board board : list) {
			if(board.getTitle().contains(" ")) {
			System.out.println(board);
			}
		}
		
		for(Board board : list) {
			if(board.getHit() >= 50) {
				System.out.println(board);
			}
		}
		
		// ������ ���ڼ��� 10�� �̻��� �͸� ���
		
		for(Board board : list) {
			if(board.getTitle().length() >= 10) {
				System.out.println(board);
			}
		}
		
		// content�� ���ڼ��� 10�� ������ ��ü�� title�� writer�� ���
		for(Board board : list) {
			if(board.getTitle().length() <= 10 && board.getWriter().length() <= 10) {
				System.out.println(board);
			}
		}
		
		
		
		System.out.println("\n hit ���� 100 �̻��� ��ü���� �����Ͽ� hot �迭�� ����");
	}

}
