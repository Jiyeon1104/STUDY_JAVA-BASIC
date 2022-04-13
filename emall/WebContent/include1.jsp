<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><%@ include  %>

현재 JSP 페이지의 특정 영역에 외부 파일의 내용을 포함하는 태그임
HTML, JSP, TXT 파일 등을 삽입할 수 있음
JSP 페이지 내의 어느 위치에서도 선언하여 삽입할 수 있음

include 디렉티브 태그는 서블릿으로 변환될 때 그 때 현재 JSP
페이지와 다른 외부 파일의 내용이 병합되어 처리됨 다시 말하면 현재 JSP 페이지에서
include 디렉티브 태그가 사용된 위치에 설정된 파일의 원본 내용을 있는 그대로
붙여넣은 다음 전체 페이지를 서블릿으로 변환하게 됨
</body>
</html>