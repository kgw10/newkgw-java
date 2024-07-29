<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri='http://java.sun.com/jsp/jstl/core' %>

<%-- core 태그 변수 --%>
<c:set var="num" value="10"/>

${num + 20 }

<c:set var="num" value="300" scope="session"/>
${sessionScope.num }

<%-- core 태그 조건문 --%>
<c:if test="${ 30>20}">
	10 > 20 참이다.
</c:if>

<c:choose>

	<c:when test="${num>5}">
		<h1> 5보다 크다.</h1>
	</c:when>
	<c:when test="${100>10} ">
		10보다 크다.
	</c:when>
	
	<c:otherwise>
		나는 위에 모든 when이 거짓일 경우에 실행된다.
	
	</c:otherwise>

</c:choose>

<%-- core태그 반복문 --%>
<%	// for(int i=1; i<=10; i++); %>
<c:forEach begin="1" end="10" step="1">
	내가 반복된다.
</c:forEach>
<%
	
	ArrayList<String> list = new ArrayList<>();
	list.add("강감찬"); list.add("이순신"); list.add("장보고");
	
	request.setAttribute("list", list);
	
%>

<c:forEach var="name" items="${list}">
	${name}
</c:forEach>

<c:forTokens items="${'포도@딸기@수박@참외@토마토'}" var="fruit" delims="@">
	${fruit }


</c:forTokens>

<%--

	웹 모델 1: 사용자 요청 -> 서버 -> 컨테이너 -> 서블릿 -> 페이지 처리
			-> 컨테이너 -> 서버 -> 사용자 
	
	모델2 (MVC 디자인 패턴)
		사용자 요청 -> 서버가 받고 -> 컨테이너도 받음 -> 요청에 맞는 서블릿 실행함 -> 그걸 서비스에 넘김
		-> (데이터 베이스가 필요한다면 DAP, DTO) -> 그걸 다시 서블릿에 넘기고 -> 다시 컨테이너에 주고 -> 서버
		-> 사용자까지로 감
		
	M : model -	service, DAO, DTO
	V : view - html, jsp 패이지(실제로 사용자의 브라우저에 표시되는 부분임)
	C : controller - 사용자의 요청을 어떻게 처리할 지 결정해주는 부분이 컨트롤러임(서블릿을 컨트롤러라고 부른다.)
	
	DAO : Data Access Object - 데이터 베이스에 접근하기 위한 클래스
	DTO : Data Transfer Object - 데이터 저장 클래스
	
	예) 회원가입을 위해 아이디, 비번, 이름, 주소, 연락처 등을 입력하고 가입 버튼을 클릭
	
	   1. 제일 첫 번째로 가입 요청을 Controller가 받는다. 이 컨트롤러는 서블릿이다.
	   2. 가입 요청을 처리해줄 service를 실행한다.
	   3. service에서 데이터 베이스에 저장하기 위해 DAO를 실행
	   4. DAO 실행이 끝나면 가입 완료 페이지를 Controller에게 보내기
	   5. 그러면 Controller는 가입 완료 페이지를 사용자에게 보내줌.
	   
	   사용자가 로그인을 한다. 아이디 비번을 입력하고 로그인 버튼을 클릭
	   
	   1. 로그인 요청을 Controller가 받는다.
	   2. 로그인 처리를 해줄 수 있는 service를 실행한다.
	   3. service에서 데이터 베이스 작업을 수행하는 DAO 실행
	   4. DAO 실행 결과 아이디 비번이 일이하면 service에서 세션 생성
	   	  일치하지 않으면 로그인 실패를 Controller에게 전달
	   5. Controller는 로그인 성공 유무에 다른 service의 결과를 사용자에게 보낸다.
	   


 --%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>