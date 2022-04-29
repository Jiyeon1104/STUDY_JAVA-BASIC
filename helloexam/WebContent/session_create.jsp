<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("id", "admin");
	session.setAttribute("name", "관리자");
	out.print("세션 속성이 설정되었습니다 <br>");
%>

<a href = "session_check.jsp">[세션 확인]</a>
</body>
</html>