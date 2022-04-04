<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward action</title>
</head>
<body>
<b>forward 액션태그</b>

<%
String msg = "forward 액션태그 테스트";
%>

<jsp:forward page = "inc_sum_for.jsp"/>

<p>forward 액션 태그</p>
메시지 출력 : <%=msg %>
</body>
</html>