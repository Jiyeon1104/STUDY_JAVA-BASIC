<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  form

action : 폼에 입력받은 데이터를 처리할 jsp를 설정
method : 전송될 방식을 설정 get, post 방식
enctype : 전송되는 콘텐츠 유형을 설정 (사진 전송)
type
text : 기본값으로 한 줄 텍스트를 입력받을 때 사용
radio : 여러 개 제시된 값들 중 단 하나만 선택
checkbox : 여러 개 제시된 값들 중 여러 개 선택
password : 보이지 않게 숨겨서 값을 전송할 때 사용
file : 파일, 사진 업로드를 위한 파일 선택용으로 사용
button : 버튼 모양으로 출력
reset : 입력된 내용을 모두 초기화
submit : 입력된 값들을 모두 서버로 전송-->
<form action = "form1db.jsp">
취미 : 독서 <input type = "checkbox" name = "hobby" value = "독서" checked>
	  운동 <input type = "checkbox" name = "hobby" value = "운동">
	  영화 <input type = "checkbox" name = "hobby" value = "영화">
<br>
<!--<textarea cols = "상자 너비" rows = "상자 높이"></textarea>-->

<textarea cols = "30" rows = "3"></textarea>

<input type = "submit" value = "전송">
<input type = "reset" value = "취소">
</textarea>
</form>
</body>
</html>