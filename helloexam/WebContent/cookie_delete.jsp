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

if (cookies != null){
	for (int i = 0; i < cookies.length; i++){
		if(cookies[i].getName().equals("id")){
			cookies[i].setMaxAge(0);
			response.addCookie(cookies[i]);
			out.print("쿠키 정보가 삭제 되었습니다<br>");
		} else {
			out.print("쿠키 정보가 없습니다<br>");
		}
	}
}
%>

<a href = "cookie_create.jsp">쿠키 생성</a>
</body>
</html>