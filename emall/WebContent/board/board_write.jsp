<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String uid = (String) session.getAttribute("id");
if (uid == null){
	response.sendRedirect("/user/login.jsp");
	return;
} // 세션 정보를 확인해서 로그인 상태인지 확인한 후 진입 허용 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성</title>
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/summernote.css" rel="stylesheet">
</head>
<body>
<%! 
// 선언문 : 전역변수 선언
String title = "게시판 작성" ;
%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<%@ include file = "/_header.jsp" %>


<%@ include file = "/_footer.jsp" %>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>