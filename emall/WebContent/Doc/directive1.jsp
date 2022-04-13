<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  page  JSP 페이지에 대한 정보를 설정
include include ... %> JSP페이지의 특정 영역에 다른 문서를 포함 

language 속성 jsp페이지에서 사용할 언어를 설정
contentType 속성 jsp페이지의 콘텐츠 유형을 설정함
test/html	test/xml	text/plain
문자열 세트 설정 charset = UTF-8로 한글을 사용함-->

Today is : <%= new java.util.Date() %>
</body>
</html>