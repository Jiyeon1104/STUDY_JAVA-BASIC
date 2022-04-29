<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
<%
Cookie cookie = new Cookie("id", "admin");
cookie.setMaxAge(300); // 300초  > 5분
response.addCookie(cookie);

out.print("쿠키 생성 완료 <br>");
%>

쿠키 이름 : <%=cookie.getName() %><br>
쿠키 밸류 : <%= cookie.getValue() %><br>
쿠키 시간 : <%=cookie.getMaxAge() %>초 <br>

<a href = "cookie_check.jsp">쿠키 확인</a>
</body>
</html>