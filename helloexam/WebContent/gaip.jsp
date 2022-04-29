<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- POST 방식으로 전송 시 한글 깨짐 방지 -->
<%request.setCharacterEncoding("UTF-8"); %>
이이디  : <%=request.getParameter("id") %><br>
암호 : <%=request.getParameter("pw") %>
</body>
</html>