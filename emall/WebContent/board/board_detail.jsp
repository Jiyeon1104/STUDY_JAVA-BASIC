<%@page import="jdbc.*"%>
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
<title>게시판목록</title>
</head>
<body>
<%! 
// 선언문 : 전역변수 선언
String title = "게시판 상세" ;
%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<%@ include file = "/_header.jsp" %>
<div class="alert" role="alert">
<div class = "container">
<h1><%=title %></h1>
</div>
</div>

<%
String board_id = request.getParameter("board_id");
BoardDTO board = (new BoardDAO()).getDetail(board_id);
%>

<div class = "container">
<div class = "row">
<div class = "col-ma-5">
</div>
<div class = "col-ma-6">
<h3><%=board.getBoard_name() %></h3>
<p><%=board.getBoard_content() %>
<p><b>게시판번호 : <%=board.getBoard_id() %></b>
<p><b>게시판내용 : <%=board.getBoard_content() %></b><br>
<a href = "" class = "btn btn-info">댓글달기</a>
<a href = "board_list.jsp" class = "btn btn-secondary">게시판목록</a>
</div>

</div>
</div>

<%@ include file = "/_footer.jsp" %>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>