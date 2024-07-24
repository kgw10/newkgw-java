<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- cook.jsp --%>

<%
	//웹 서버에서 쿠키를 생성
	Cookie ck = new Cookie("name", "이순신");

	// 생성된 쿠키를 클라이언트에게 전송
	

%>