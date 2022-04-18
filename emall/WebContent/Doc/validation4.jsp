<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>슛자인지 여부 검사</title>
</head>
<body>
<script type = "text/javascript">
function CheckFortm(){
	
	var regExp = /i/i;	//var regExp = new RegExp('java', 'i');
	var str = document.loginForm.title.value;
	var result = regExp.exec(str);
	alert(result[0]);
	}
	
	form.submit();

</script>
<form name = "Testdb.jsp" name = "loginForm">
제목 : <input type = "text" name = "title">
<input type = "submit" onclick = "CheckForm()">
</form>

</body>
</html>