package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		Member member = new Member("이순신", 2005);
		System.out.println( member.name + " " + member.birth );
		member.setAge();

		try {
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());		
		}
		System.out.println( member.age);
	}

}

class Member{
	String name;
	int age;
	
	int birth;
	Member(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}
	
	// setAge 메서드를 호출하여 age 변수값 저장하는데 age 변수는 나이를 표현하기 위한 변수라 0보다 작은 값이 저장되면 안된다.
	// 올해 년도에서 태어난 년도를 빼기를 했을 때 0보다 작은 값이 나온다면 잘못된 값이다.
	// 이 문제는 birth 변수의 값이 잘못되었기에 발생한 문제이기에 setAge 메서드에서 처리를 하는 게 아니고 상위 코드에서 해결해야 하므로 예외 발생시키고 넘겨주기를 한다.
	
	void setAge() throws RuntimeException{
		this.age = 2023 - birth;
		if(age < 0) 
			throw new RuntimeException("태어난 년도가 잘못되었다.");
	}
	
	// throw - 예외 발생시키기
	// throw - 예외처리 미루기
	
	
//	void setAge() {
//		try {
//			this.age = 2024 - birth;
//			if(age < 0)
//				throw new RuntimeException("태어난 년가 잘못되었습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
}

