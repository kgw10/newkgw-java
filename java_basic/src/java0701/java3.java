package java0701;

import java.util.Scanner;

public class java3 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 자바에서 문자열을 사용하려면 String 클래스를 사용해야 한다.
		// String 클래스는 내부적으로 char 기본 데이터 타입의 배열이 생성되도록 되어 있다.
		// char 타입으로 생성된 배열은 동적 배열의 동작을 한다.
		// 프로그램에서 사용되는 데이터 중 70% 정도는 문자열 데이터이다.
		// 문자열 관련 메서드는 필히 꼭 반드시 익혀야 한다.
		
		// 문자열 데이터를 저장하는 방법
		
//		String word = "i like banana";
//		
//		// 문자열 비교 - 같은 문자열인가?
//		// equals
//		System.out.println("equals : " + (word.equals("i like orenage") ));
//		
//		// 문자열 포함 여부
//		System.out.println("contains : " + (word.contains("banana")));
//		System.out.println("indexOf : " + word.indexOf("orange"));
//		
//		// 문자열 합치기
//		System.out.println(word + " 합치기");
//		System.out.println(word.concat(" 합치기 "));
//		
//		// 특정 문자 또는 문자열 위치 찾기
//		System.out.println(word.indexOf('b'));
//		System.out.println(word.lastIndexOf('a'));
//		
//		
//		// 문자열에서 특정 문자 추출
//		System.out.println(word.charAt(0));
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// 키보드로 문자 입력 받기
//		System.out.print("알파벳 하나 입력 : ");
//		char alp = sc.nextLine().charAt(0);
//		System.out.println("입력한 문자 : " + alp);
//		
//		// 문자 코드 중에서 기본 문자 코드는 아스키 코드이다.
//		// 아스키코드표는 총 128개 문자
//		// 아스키코드에서 65는 대문자 A, 97은 소문자 a
//		char ch = 65;
//		System.out.println(ch + 4);
//		
//		// 문자열의 길이
//		System.out.println("문자열 글자수 : " + word.length());
//		
//		// 대문자 소문자 변환
//		String 대문자 = word.toUpperCase();
//		String 소문자 = word.toLowerCase();
//		
//		System.out.println(대문자);
//		System.out.println(소문자);
//		
		
		// 공백 제거
//		String word2 = " i hate java ";
//		System.out.println(word2);
//		System.out.println(word2.trim());
//		
		// 위 메서드 중 가장 많이 사용되는 것들
		// equals, contains
		
		// 문자열 분할
		// System.out.println( Arrays.toString(word.split(" ")) );
//		String name = "이순신@김유신@강감찬@";
//		
//		String[] names = name.split("@");
//		System.out.println(names[1]);
//		
//		// 문자열 자르기(추출)
//		
//		System.out.println(word.substring(2));
//		System.out.println(word.substring(6));
//		System.out.println(word.substring(2, 6));
		
		
		
		// 문자열 변환
//		String 뭘할까 = "집에가서 손발 닦고 누워서 자고 싶은 마음이 굴뚝 같네요."
//				+ "오늘 저녁은 무얼 먹을까요, 어제는 배달 음식을 먹었지요";
//		
//		String 변경 = 뭘할까.replace("집에가서", "학교에가서");
//		System.out.println(변경);
//		
//		변경 = 변경.replaceAll("학교에가서", "집으로 가서");
//		System.out.println(변경);
		
		// replaceAll에서만 정규표현식 사용 가능
		/*
		  
		  정규 표현식
		  ^ - 문자열의 시작
		  $ - 문자열의 종료
		  . - 임의의 한 문자
		  * - 앞 문자가 있거나 없거나  (*가 -> 가 로 끝나는 단어)
		  + - 앞 문자가 하나 이상
		  ? - 앞 문자가 없거나 하나 있음
		  [] - 문자의 집합이나 범위를 나타냄
		  {} - 횟수 또는 범위
		  () - 소괄호의 문자를 하나의 문자로 인식
		  | - 패턴 안에서 or 연산 수행
		  \s - 공백 문자
		  \S - 공백문자가 아닌 나머지 문자
		  \w - 알파벳이나 숫자
		  \W - 알파벳이나 숫자를 제외한 문자
		  \d - 숫자
		  \D - 숫자를 제외한 모든 문자
		  
		  
		  문자열에서 숫자만 제거 - replace("[0-9]", "");
		  연락처 - ^010-(?:\d{4})-\d{4}$
		  한글만 작성 확인 - ^[가-힔]
		  
		 */
		
//		String a = "abc73jd82kd74j우리나라";
//		System.out.println(a.replaceAll("[0-9]", ""));
//		System.out.println(a.replaceAll("[\\d]", ""));
//		System.out.println(a.replaceAll("^[가-힔]",""));
//		
		
		
		
		/*
		 String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다."라는 문자열이 있을 때는 String
		 클래스의 메서드를 이요해 stirng name -> "홍길동", int age -> 15가 저장되도록 코드를 작성하시오
		 (단, String 클랙스의 indexOf(), substring() 메서드느느 반드시 한 버 이상 사용해야 함).
		 
		 String bb = "203"
		 int cc = Integer.parseInt(bb);	// 문자열을 정수로 변환
		 
		 String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.
		 String name;
		 int age;
		 
		 
		 System.out.println(name);	// 홍길동
		 System.out.println(age);	// 15
		 */
		
		
		 // String bb = "203";
		 // int cc = Integer.parseInt(bb);	// 문자열을 정수로 변환
		 
		 String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		 String name;
		 int age;
		 
	     name = str.substring(str.indexOf('[') + 1, str.indexOf(']'));
	        
	     String temp = str.substring(str.lastIndexOf('[') + 1, str.lastIndexOf(']'));
	     age = Integer.parseInt(temp);
		 // 결과 출력
		 
		 System.out.println(name);	// 홍길동
		 System.out.println(age);	// 15


	        

		
		
		
		
		
		

		
		
		
		
		
	}


}
