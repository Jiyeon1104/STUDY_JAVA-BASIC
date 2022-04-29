<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 속성 id : <%=session.getAttribute("id") %><br>
세션 속성 name : <%=session.getAttribute("name") %><br>

<a href = "session_delete.jsp">[세션 삭제]</a>
</body>
</html>