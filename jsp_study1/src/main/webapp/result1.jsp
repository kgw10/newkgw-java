<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- result1.jsp -> html 삭제
    
    이름과 국어, 수학, 과학 성적을 받아서 평균이 90 이상이면 참 잘했어요
    80 이상이면 잘했어요
    70 이상이면 노력해라 나머지는 이게 점수야! 출력
    
    --%>
<%

int 국어 = Integer.parseInt(request.getParameter("국어"));
int 수학 = Integer.parseInt(request.getParameter("수학"));
int 과학 = Integer.parseInt(request.getParameter("과학"));

int 평균 = (국어 + 수학 + 과학) / 3;

String 결과;

if (평균 >= 90) {
    결과 = "참 잘했어요";
} else if (평균 >= 80) {
    결과 = "잘했어요";
} else if (평균 >= 70) {
    결과 = "노력해라";
} else {
    결과 = "이게 점수야!";
}

out.println("국어: " + 국어 + "<br>");
out.println("수학: " + 수학 + "<br>");
out.println("과학: " + 과학 + "<br>");
out.println("평균: " + 평균 + "<br>");
out.println(결과 + "<br>");

%>

<br><br>
<hr>

<%@ include file="requestTest2.jsp" %>

