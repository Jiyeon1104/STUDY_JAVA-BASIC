<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
kakao test<br><br>
<% String nick = request.getParameter("nickname"); 
   String mail = request.getParameter("mail");
   String gender = request.getParameter("gender"); 
   String birthday = request.getParameter("birthday");
%>

<%=nick %><br>
<%=mail %><br>
<%=gender %><br>
<%=birthday %><br>
</body>
</html>