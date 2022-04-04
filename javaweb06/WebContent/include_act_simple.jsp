<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include 액션태그</title>
</head>
<body>
<b>include 단일 파라미터</b><br>
<% request.setCharacterEncoding("UTF-8"); %>

<jsp:include page = "inc_act_simple.jsp">
	<jsp:param name = "para1" value = "p1 값"/>
	<jsp:param name = "para2" value = "p2 값"/>
	<jsp:param name = "para3" value = "파라미터3 값"/>
</jsp:include>

</body>
</html>