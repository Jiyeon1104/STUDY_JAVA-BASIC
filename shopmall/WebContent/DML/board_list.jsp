<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "dbconnclose.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
<%
Connection conn = null;
Statement stmt = null;
ResultSet rset = null;

conn = DbConnClose.getConnection();

String sql = "SELECT * FROM board ORDER BY board_join_date DESC";
stmt = conn.createStatement();
rset = stmt.executeQuery(sql);
%> 
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
  while (rset.next()){
	  String board_id = rset.getString("board_id");
	  String board_name = rset.getString("board_name");
	  String board_title = rset.getString("board_title");
	  String board_join_date = rset.getString("board_join_date");
%>

    <tr>
      <th scope="row"><%=board_id %></th>
      <td><%=board_name %></td>
      <td><a href = "board_detail.jsp?id=<%=board_id %>"><%=board_title %></a></td>
      <td><%=board_join_date %></td>
    </tr>
 <%} %>
  </tbody>
</table>

<%
DbConnClose.resourceClose(rset, stmt, conn);
%>
</body>
</html>