package java_thread1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.start();	// 쓰레드 실행
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println( num );
		
	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		for( int i = 1; i <= 10; i++) {
			System.out.println("          나는 Main" + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//			System.out.println("나는 짱이다!!");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		
	}
}

/*

	프로세스 - cpu에 의해 메모리(ram)에 로드 되어 있는 프로그램을 말한다.
		    즉, 실행중인 프로그램들이 프로세스다.
		    102개의 프로세스가 있다라는 얘기는 102개의 프로그램이 실행중이다라는 얘기다.
		    내 컴퓨터에 실행중인 프로세스 확인하는 방법
		    1. 하단에 작업표시줄에서 오른쪽 마우스 클릭하여 작업관리자 선택 프로세스라는 탭이 있다.
		    2. 명령 프롬프트창을 열기( 돋보기에서 cmd라고 검색 또는 ctrrl + r하고 cmd 입력 앤터)
		    	윈도우 - tasklist 명령어
		    	맥, 리눅스 - 터미널 열어서 ps - e
		    	
		    	프로세스 종료 - taskkill / pid[pid값]
		    	맥, 리눅스 - pkill -9 -f 프로세스 이름
		    		    - sudo kill 프로세스 번호
	
	쓰레드 - 프로세스 안에서 실제 동작을 수행하는 단위 쓰레드를 추가하면 동시에 여러 개의 동작을 수생할 수 있다.
	
	
	자바 쓰레드
	쓰레드 생성자
	Thread() : 새로운 쓰레드 객체 할당
	Thread("이름") : 새로운 쓰레드 객체를 할당하면서 이름 부여


*/