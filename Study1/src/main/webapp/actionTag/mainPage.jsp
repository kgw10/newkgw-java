<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- mainPage.jsp --%>

<%
	String part = request.getParameter("part");	
	if( part != null ) {
		if( part.equals("notify") && session.getAttribute("user") == null ) {	// 신고 메뉴를 클릭했는데 로그인하지 않은 상태
%>
			<jsp:forward page="login.jsp" />
			
<%
		}
	}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="loginBox">

	<a href=""> 로그인 </a>
</div>

	<h2> 내가 main 이야!!! </h2>
	<!-- 메뉴 표시 header.jsp -->
	<jsp:include page="header.jsp" />
	</jsp:incude>
	
	<div id="main">
		<%
			if(part == null) {
		%>
		첫 페이지 내용
		<% }else { %>
				<jsp:include page="imageBoard.jsp" />
			<%  } %>
	</div>
	
	<div id="main">
		첫 페이지 내용
	</div>
	
	<!-- footer.jsp 표시 -->
	<jsp:include page="footer.jsp" />
	
</body>
</html>