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
	
	/*	if(!isNan(document.loginForm.id.value.substr(0,1))){*/
	// 첫 글자가 소문자인지 확인
	var ch = loginForm.id.value.charAt(0);
	if((ch < 'a' || ch > 'z') && (ch > 'A' || ch < 'Z') && (ch > '0' || ch < '9')){
		alert("아이디는 영문 소문자로만 입력 가능합니다.");
		document.loginForm.select();
		return;
	}
	
	form.submit();
}
</script>
<form name = "Testdb.jsp" name = "loginForm">
아이디 : <input type = "text" name = "id">
비밀번호 : <input type = "password" name = "pw">
<input type = "submit" onclick = "CheckForm()">
</form>

</body>
</html>