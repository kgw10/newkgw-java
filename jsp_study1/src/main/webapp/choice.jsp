<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%
 	request.setCharacterEncoding("utf-8");
// 	String title = request.getParameter("title");
// 	out.println( title);
 
 %>
 <jsp:useBean id="lunch" class="test.Lunch" />
 <jsp:setProperty name="lunch" property="*" />
 
 <jsp:getProperty name="lunch" property="menu" />
 <%
 
 	out.println(lunch.getRestaurant());
 
 %>
    
<%=lunch.getPrice() %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>