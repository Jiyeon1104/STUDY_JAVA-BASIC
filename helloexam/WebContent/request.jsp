<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 내장 객체</title>
</head>
<body>
[기본 정보 보기]
<br><br>
클라이언트 IP 주소 <%=request.getRemoteAddr() %>
클라이언트 이름<%=request.getRemoteHost() %>
클라이언트 포트<%=request.getRemotePort() %>
클라이언트 사용자<%=request.getRemoteUser() %>
쿠키 정보
세션 정보
</body>
</html>