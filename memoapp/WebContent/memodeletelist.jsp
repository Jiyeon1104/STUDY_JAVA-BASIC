<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jdbc.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제된 메모 열람</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<%
	ArrayList<MemoDTO> memos = (new MemoDAO()).getDeleteList();
	for (MemoDTO memo : memos) {
%>

<div class="alert alert-secondary" role="alert">
<div class="card text-center">
  <div class="card-header">
    메모
  </div>
  <div class="card-body">
    <h5 class="card-title"><%=memo.getMemo() %></h5>

    <a href="memoundelete.jsp?mid=<%=memo.getMid() %>" class="btn btn-secondary">복구</a>
  </div>
  <div class="card-footer text-muted">
    <%=memo.getMdate() %>
  </div>
</div>
</div>

<%
	}
%>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>