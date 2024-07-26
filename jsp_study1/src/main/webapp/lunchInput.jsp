<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 음식 메뉴 입력 </h3>
	<form method="post" action="choice.jsp">
		음식 메뉴 : <input type="text" name="menu"> <br>
		가격 : <input type="number" name="price" min="1000"> <br>
		식당 이름 : <input type="text" name="restaurant"> <br>
		<button> 끄읕 </button>
	</form>


</body>
</html>