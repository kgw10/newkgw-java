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
		
		// 제목의 글자수가 10자 이상인 것만 출력
		
		for(Board board : list) {
			if(board.getTitle().length() >= 10) {
				System.out.println(board);
			}
		}
		
		// content의 글자수가 10자 이하인 객체의 title와 writer만 출력
		for(Board board : list) {
			if(board.getTitle().length() <= 10 && board.getWriter().length() <= 10) {
				System.out.println(board);
			}
		}
		
		
		
		System.out.println("\n hit 수가 100 이상인 객체들을 추출하여 hot 배열에 저장");
	}

}
