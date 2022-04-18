<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--유효성 검사는 사용자가 입력한 데이터 값이 서버로 전송되기 전에 규칙에 맞는지 검사하여 검증하는 것
사용자가 실수로 유효하지 않은 데이터 값을 입력하게 되면 부적합하다고 판단하여 다시 입력하도록 알려줌

아이디  검사, 패스워드 검사 , 빈칸 여부...
  -->
<script type = "text/javascript">
function CheckForm(){
	/*alert("아이디 : " + document.loginForm.id.value + "\n" + 
		  "비   번 : " + document.loginForm.pw.value);*/
		  
		  if (document.loginForm.pw.value == ""){
			  alert("아이디를 입력해주세요");
			  form.id.focus();
		  } else if (document.loginForm.pw.value == ""){
			  alert("비밀번호를 입력해주세요.");
			  form.pw.focus();
			  return false;
		  }
		  form.submit();
}
</script>
<form name = "loginForm">
아이디 : <input type = "text" name = "id">
비밀번호 : <input type = "password" name = "pw">
<input type = "submit" onclick = "CheckForm()">
</form>

</body>
</html>