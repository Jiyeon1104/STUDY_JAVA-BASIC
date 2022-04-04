<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>쿠키 생성</b>

<%
Cookie cookie = new Cookie("id", "12jiyeon"); // 쿠키 객체 생성
cookie.setMaxAge(300); // 초 단위 5분 쿠키 생존 기간 설정
response.addCookie(cookie);

out.print("쿠키 생성 완료<br>");
%>

쿠키 이름 : <%=cookie.getName() %><br> 
쿠키 값 : <%=cookie.getValue() %><br>
쿠키 유효시간 : <%=cookie.getMaxAge() %>초<br>

<p><a href = "cookie_check.jsp">[쿠키 확인]</a>
</body>
</html>