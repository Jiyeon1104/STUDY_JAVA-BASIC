<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전송 파라미터 1: <%= request.getParameter("para1") %><br>
전송 파라미터 2: <%= request.getParameter("para2") %><br>
전송 파라미터 3: <%= request.getParameter("para3") %><br>

</body>
</html>