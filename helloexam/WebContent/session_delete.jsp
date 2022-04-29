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
	session.removeAttribute("id");
	session.removeAttribute("id");
	
	out.print("세션이 삭제되었습니다 > 로그아웃 되었습니다");
%>

<a href = "session_check.jsp">쿠키 확인</a>
</body>
</html>