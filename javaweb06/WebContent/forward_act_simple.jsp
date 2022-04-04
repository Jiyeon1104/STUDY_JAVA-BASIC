<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>forward 단일 파라미터</b>

<%
	String msg = "forward 단일 파라미터";
	request.setCharacterEncoding("UTF-8");
%>

<jsp:forward page = "inc_act_simple.jsp">
	<jsp:param name = "para1" value = "p1 값"/>
	<jsp:param name = "para2" value = "p2 값"/>
	<jsp:param name = "para3" value = "파라미터3 값"/>
</jsp:forward>

<p>forward 단일 파라미터</p>
메시지 출력 : <%=msg %>
</body>
</html>