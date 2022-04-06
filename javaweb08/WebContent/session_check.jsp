<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 속성 확인</title>
</head>
<body>

<b>세션 속성 확인</b><br>
세션 아이디 : <%= session.getAttribute("id") %> <br>
세션 네임 : <%= session.getAttribute("name") %> <br>

<p><a href = "session_create.jsp">[세션 생성]</a>
<p><a href = "session_delete.jsp">[세션 삭제]</a>
</body>
</html>