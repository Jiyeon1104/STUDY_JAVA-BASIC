<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
function CheckForm() {
   if(document.loginForm.id.value.length < 3 || document.loginForm.pw.value.length > 20) {
      alert("아이디 값이 너무 작거나 큽니다. 다시 입력하세요");
      form.id.focus();
   }if (document.loginForm.pw.value.length < 2){
      alert("비번은 두 글자 이상 입력");
      form.pw.focus();
      return false;
   }
   form.submit();
}
</script>
