<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	
	out.println(myId);
	
	if(myId.equals("kw103011") && myPw.equals("kw103011@")) {
%>
		<script>
			alert("로그인 성공");
			location.href="login.jsp";
		</script>
<%			
	}


%>
	
<%=myPw %>	
	
<%-- jsp 주석 --%>
	
	