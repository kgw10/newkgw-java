<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<h1> 객체 속성 </h1>
request객체 -> name : <%=request.getAttribute("name") %><br>
session객체 -> age : <%=session.getAttribute("age") %> <br>
application개체 -> job : <%=application.getAttribute("job") %>