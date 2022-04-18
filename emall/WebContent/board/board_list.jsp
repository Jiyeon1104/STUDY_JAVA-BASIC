<%@page import="jdbc.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판목록</title>
</head>
<body>
<%! 
// 선언문 : 전역변수 선언
String title = "게시판 목록" ;
%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<%@ include file = "/_header.jsp" %>

<div class="alert" role="alert">
<div class = "container">
<h1><%=title %></h1>

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">작성자</th>
      <th scope="col">제목</th>
      <th scope="col">날짜</th>
    </tr>
  </thead>
  <tbody>
  
<%
ArrayList<BoardDTO> boards = (new BoardDAO()).getList();

for (BoardDTO board : boards){
%>

    <tr>
      <th scope="row"><%=board.getBoard_id() %></th>
      <td><%=board.getBoard_name() %></td>
      <td><a href = "board_detail.jsp?id=<%=board.getBoard_id() %>"><%=board.getBoard_title() %></a></td>
      <td><%=board.getBoard_join_date() %></td>
    </tr>
 <%} %>
  </tbody>
</table>
</div>
</div>

<%@ include file = "/_footer.jsp" %>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>