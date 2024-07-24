<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    String userId = request.getParameter("userId");
    String userPassword = request.getParameter("userPassword");

    // 예시: 하드코딩된 사용자 정보 (실제 환경에서는 DB를 사용)
    String correctUserId = "admin";
    String correctPassword = "1234";

    if (userId.equals(correctUserId) && userPassword.equals(correctPassword)) {
        // 로그인 성공
        out.println("<script>");
        out.println("alert('로그인 성공');");
        out.println("location.href='welcome.jsp';"); // 로그인 성공 후 이동할 페이지
        out.println("</script>");
    } else {
        // 로그인 실패
        out.println("<script>");
        out.println("alert('아이디 또는 비밀번호가 틀렸습니다.');");
        out.println("history.back();"); // 이전 페이지로 돌아가기
        out.println("</script>");
    }
%>