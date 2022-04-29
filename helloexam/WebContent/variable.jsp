<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
// 선언문
int global_var = 0;
%>

<%
//스크립틀릿
int local_var = 0;
out.print("global" + global_var++ + 1);
out.print("local" + local_var++);

%>
</body>
</html>