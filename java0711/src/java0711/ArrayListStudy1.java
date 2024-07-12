package java0711;

import java.util.ArrayList;




public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list =new ArrayList<>();
		
		list.add( new Member("이순신",34,"19900405")  );
		list.add( new Member("김춘추", 25, "19991208") );
		list.add( new Member("장보고", 28, "19960712") );
		list.add( new Member("한석봉", 31,  "19930120") );
		list.add( new Member("김광식", 39, "19851010") );
		
		
		System.out.println( list );
		
		for( Member m : list ) {
			if( m.getAge() >= 10) {
				System.out.println( m );
			}
		}
		
		System.out.println( "=====1995년이후에 태어난 사람들==== ");
		for( Member m : list) {
			String temp = m.getBirth().substring( 0, 4 );
			int year = Integer.parseInt(temp);
			if( year > 1995)
				System.out.println( m );
		}
		
		// 8월,9월,10월,11월에 태어난 사람만 출력
		System.out.println("===8월,9월,10월,11월에 태어난 사람===");
		
		for( Member member : list) {
			String temp = member.getBirth().substring(4,6);
			int mon = Integer.parseInt(temp);
			if( mon >=8 && mon <= 11) {
				System.out.println( member );
			}
		}
		
		
		list.add( 2 , new Member("장영실", 34 , "") );
		System.out.println(  list );
		
// 생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고
// 0월0일 로 저장 되게 하라
		
		for( Member mem : list) {
			if( mem.getBirth().isBlank() ) {
				int year = 2024 - mem.getAge();
				mem.setBirth( year + "0000" );
			}
		}
		
		System.out.println( list );
		
		
		// 개발자가 정의한 클래스를 컬렉션에 사용하는 경우
		// 컬레션의 메서드 둘을 온전히 사용하려면 필요한 메서드를 클래스에 구현해야 한다.
		// 필요한 메서드는 최상위 부모 클래스인 Object가 가지고 있다.
		// 추가로 컬렉션에 관련된 인터페이스를 implements 하기도 한다.
		
		
		
		Member t = new Member("장보고",0,"0");
		
		System.out.println(list.indexOf( t ));
		
		
		
		// 정렬
		Collection.sort(list);
		
		
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
