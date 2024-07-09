package java0709;

public class ObhectArray2 {

	public static void main(String[] args) {
		
		Game[] gm = new Game[7];
		
		gm[0] = new Game("리그 오브 레전드", "AOS", "PC");
		gm[1] = new Game("오버워치2", "FPS", "플레이스테이션");
		gm[2] = new Game("젤다의 전설", "액션", "switch");
		gm[3] = new Game("슈퍼 마리오", "롤플레잉", "닌텐도");
		gm[4] = new Game("별의 커비", "액션", "닌텐도");
		gm[5] = new Game("스타크래프트", "RTS", "PC");
		gm[6] = new Game("리니지", "MMORPG", "PC");

		for(Game game : gm) {
			System.out.println(game);
		}
	}

}
// 7개의 게임 정보를 가진 객체를 생성하고 출력하세요