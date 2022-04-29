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
Cookie[] cookies = request.getCookies();

if (cookies != null) {
	for (int i = 0; i < cookies.length; i++) {
		String name = cookies[i].getName();
		String value = cookies[i].getValue();
		
		out.print("쿠키이름: " + name + "<br>");
		out.print("쿠키밸류: " + value + "<br>");
		}
	} else {
		out.print("설정된 쿠키 정보가 없습니다.");
	}
%>

<a href = "cookie_delete.jsp">쿠키 삭제</a>
</body>
</html>