<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 삭제</title>
</head>
<body>
<b>세션 속성 확인</b><br>
세션 아이디 : <%= session.getAttribute("id") %> <br>
세션 네임 : <%= session.getAttribute("name") %> <br>

<%
session.removeAttribute("id");
session.removeAttribute("name");
out.print("세션 속성을 삭제하였습니다.");
%>

<b>세션 속성 확인</b><br>
세션 아이디 : <%= session.getAttribute("id") %> <br>
세션 네임 : <%= session.getAttribute("admin") %> <br>

<p><a href = "session_check.jsp">[세션 확인]</a>
</body>
</html>