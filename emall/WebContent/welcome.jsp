<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Single+Day&display=swap" rel="stylesheet">
<style>
*{
font-family: 'Single Day', cursive;
}
.alert{
background-color : #ffe4e1;
}
a.navbar-brand{
text-color : black;
}
.container-fluid{
background-color : #ffe4e1;
}
</style>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<%@ include file = "_header.jsp" %>

<%! 
// 선언문 : 전역변수 선언
String greeting = "Welcome to e-MALL" ;
String tagline = "Welcome to Web Market!" ;
%>
<!-- 표현문 -->
<div class="alert" role="alert">
<div class = "container">
<h1><%=greeting %></h1>
</div>
</div>

<div class = "container">
<div class = "text-center">
<h3><%=tagline %></h3>
<%
Date day = new java.util.Date();
int hour = day.getHours();
int minute = day.getMinutes();
int second = day.getSeconds();

String CT = hour + " : " + minute + " : " + second;
out.print("현재 접속 시간 : " + CT + "\n");
%>
</div>
<hr>
</div>

<%@ include file = "_footer.jsp" %>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>