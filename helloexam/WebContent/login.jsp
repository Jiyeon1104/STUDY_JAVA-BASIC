<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "logincheck.jsp" method = "post">
아이디 : <input type = "text" name = "id" maxlength = "20" required autofocus><br>
비  번  : <input type = "password" name = "pw" required>

<input type = "submit" value = "전송">
<input type = "reset" value = "취소">

</form>
</body>
</html>