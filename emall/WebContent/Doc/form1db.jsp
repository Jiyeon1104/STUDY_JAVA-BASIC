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
request.setCharacterEncoding("utf-8");

String[] items = request.getParameterValues("hobby");

if(items != null){
	for(String item : items){
		out.print(item + "<br>");
	}
	
}

%>
</body>
</html>