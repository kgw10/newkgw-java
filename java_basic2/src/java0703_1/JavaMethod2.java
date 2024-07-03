package java0703_1;

import java.time.LocalDate;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {

		Member member1 = new Member("이순신", 31, "군인");
		Member member2 = new Member("문익점", 29, "산업스파이");
		Member member3 = new Member("장영실", 45, "발명가");
		// 태어난 년도

		member1.birth();
		member2.birth();
		member3.birth();
		
		// 나이 - 20대인가? 30대인가? 40대인가? 50대인가?
		
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(null, 0);
		
		// 국가 직무 분류
		// 군인 - 05.국방	기계공학자 - 15.기계
		// 섬유공장사장 - 18.섬유의복
		
		Job job1 = new Job("군인", 05, ".국방");
		Job job2 = new Job("기계공학자", 15, ".기계");
		Job job3 = new Job("섬유공장사장", 18, ".섬유의복");
		
		System.out.println(job1);
		
		// System.out.println( today.getMonthValue());
		// 년도 - .getYear();
		// 월 - .getMonthValue();
		// 일 - .getDayOfMonth();
	}
}

// 컨트롤용 클래스, 실제기능의 동작 클래스, 데이터 클래스
// Controller, Service, DTO(VO)

class Job {
	String kind;
	int number;
	String function;
	
	Job(){}
	Job(String kind, int number, String function){
		this.kind = kind;
		this.number = number;
		this.function = function;
	}
	
	void JobKind() {
		
	}
}


class DataIdenti {	// 연령대, 직업 분류 등등 데이터 분류를 위한 클래스
	void ageGroup( String name, int age ) {
		
		String group = null;
		group = age/10 + "0대";
		System.out.println(name + " : " + group);
	}
}




class Member{
	String name;	// 이름
	int age;	// 나이
	String job;	// 직업
	// 기본 생성자 메서드
	Member(){}
	// 매개 변수가 있는 생성자 메서드
	Member(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	// 태어난 년도 언제인가 출ㄹ력하는 메서드
	void birth(  ) {
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		// 화면 출력 - 이순신 태어난 년도 : 0000년도
		
		int birthYear1 = nowYear - this.age;
		System.out.printf("%s 태어난 년도 : %d년 \n", this.name, birthYear1);
	}
}



// 메서드나 함수를 사용하는 이유
// 배열, 계산 - 반복문
// 메서드를 사용하면 코드의 재사용과 유지 보수, 가독성이 좋아 진다.
// 메서드를 사용하면 구조화된 프로그래밍이 가능하다.
// 