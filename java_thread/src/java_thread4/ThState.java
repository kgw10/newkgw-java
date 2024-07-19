package java_thread4;

public enum ThState {
	NEW, RUNABLE, BLOCKED, WATING, TIMED_WATING, TERMINATED

//	int num;
//	ThState(int num) {
//		this.num = num;
//	}
//	
//	int getNum() {
//		return this.num;
//	}
}
/*

	사웃들의 클래스처럼 사용하라 수 있는 방법 - Enum
	
	final int num = 20;
	num = 30; 오류
	
	
	const nm = 10;
	num30;	오류
	
	
	menu <- 1. 파일 열기 2. 파일 저장 3. 다른이름 저장
			4. 환경 설정 5. 종료
	enum Menu {
		OPEN, SAVE, SAVEAS, SET, EXIT
	}
	
	int menu = scan.nextInt();
	
	switch( menu ) {
		case Menu.파일열기:
		case Menu.파일저장:
		case Menu.SAVEAS:
		case 4:
		case 5:


*/