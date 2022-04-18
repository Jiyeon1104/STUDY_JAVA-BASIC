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
<jsp:setProperty name = "person" property = "id" value = "20182005"/>
<jsp:setProperty name = "person" property = "name" value = "홍길동"/>

아이디 : <% out.print(person.getId()); %>
이  름  : <% out.print(person.getName());%>
</body>
</html>