<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "emailsend2.jsp" method ="post">
보내는 사람 <input type = "text" name = "from"><br>
받는 사람  <input type = "text" name = "to"><br>
제목 <input type = "text" name = "subject"><br>
형식 <input type = "radio" name = "format" value = "text" checked>TEXT
<input type = "radio" name = "format" value = "html" checked>HTML<br>
본문<br>
<textarea name = "content" cols = "60" rows = "10"></textarea>
<br>
<button type = "submit">전송</button>
</form>
</body>
</html>