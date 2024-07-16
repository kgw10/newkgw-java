package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {

		HashMap<String, ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("자바설치", "javava", "설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("mysql 설치 방법", "설치 인생", "mysql설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("뭐지", "배아프다", "영상.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("밥먹는법", "먹방", "유튜버.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("똥싸는법", "화장실", "깨끗한화장실.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("음식", "치킨피자", "치킨이좋아.jpg");
		board.put(temp.getTitle(), temp);

		System.out.println( board.get("음식") );
		
		Scanner scan = new Scanner(System.in);
		// 이미지 게시판의 글 제목을 출력하고 보고 싶은 글의 제목을 입력하면 내용을 볼 수 있다.
		
		Set<String> titles = board.keySet();
		System.out.println("=== 이미지 게시판 목록 ===");
		
		titles.forEach( title -> System.out.println(title) );
		
		System.out.println("글 제목 입력 : ");
		String inputTitle = scan.nextLine();
		
		System.out.println(board.get(inputTitle));
	}

}
