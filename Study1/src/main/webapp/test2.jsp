<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"% %>
    

<%--
	JSP 스크립트
		JSP 스크립트릿 : <%		%>
					자바 로직 코드를 작성( 일반적인 코드 작성 )
		선언문 : <%!	%>
				자바 변수나 메섣, 클래스 정의할 때
		표현식 : <%=	%>
 --%>
 
 <%!
 	int age = 20;	// 변수 선언
 	String name="이순신"; // 변수 선언
 	
 	int sum(int a, int b) {	// 메서드 정의
 		return a+b;
 	}
 	
 	class mem {	// 클래스 정의
 		String userName;
 	}
 	// if, for 같은 제어문 사용 불가
 	// sum(10, 20); 메서드 호출 안됨
 			
 	Scanner scan = new Scanner(System.in);
 
 %>
 
 <%	// 스크립틀릿
 
 	int num = scan.nextInt();
 
 	sum(10, 20);	// 메서드 호출 가능
 	if( age > 15 ) {	// 제어문 사용 가능
 		
 	}
 	String job = "군인";	// 변수 선언 가능
 	
 	// void print(){	메서드, 클래스 정의 불가
 	//	out.println("출력출력");
 	// }
 
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>