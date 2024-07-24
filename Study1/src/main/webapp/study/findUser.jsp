<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
    <meta charset="UTF-8">
    <title>아이디/비밀번호 찾기</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div id="findUserBox">
        <h2>아이디/비밀번호 찾기</h2>
        <form action="findUserResult.jsp" method="post">
            <div>
                <label for="userEmail">이메일 주소</label>
                <input type="email" id="userEmail" name="userEmail" placeholder="이메일" required>
            </div>
            <div>
                <input type="submit" value="찾기">
            </div>
        </form>
    </div>
</body>
</html>