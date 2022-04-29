<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>변수와 연산</title>
</head>
<body>
<%!
// 선언문 - 전역변수로 선언
int su1 = 10;
int su2 = 1;
%>

<%
int result = 0;
int temp = 0;

if(su1 >= su2){
	result = su1 + su2;
} else {
	// su1, su2 = su2. su1 파이썬에서읙 교환
	temp = su1;
	su1 = su2;
	result = su1 - su2;
}
%>

<%=su1 %><br>
<%=su2 %><br>
연산결과 : <%=result %>
</body>
</html>