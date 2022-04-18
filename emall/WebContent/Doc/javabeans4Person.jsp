<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "person" class = "study.Person" scope = "request"/>
아이디 : <%=person.getId() %>
이름 : <%=person.getName() %>
</body>
</html>