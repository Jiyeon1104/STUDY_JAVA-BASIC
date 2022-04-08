<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8");%>
<%@page import="java.sql.*"%>
<%@page import="dbconnclose.*" %>
<%@page import="java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>db 확인</title>
</head>
<body>

<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rset = null;

conn = DbConnClose.getConnection();

   %>
   <%@ include file="/common/jsp_board_dbset_iu.inc" %>
   <%
   String sql = "INSERT INTO board VALUES(?,?,?,?,?)";
   pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, 0);
      pstmt.setString(2, board_name);
      pstmt.setString(3, board_title);
      pstmt.setString(4, board_content);
      pstmt.setString(5, LocalDate.now().toString());

   pstmt.executeUpdate();
   
   
   DbConnClose.resourceClose(rset, pstmt, conn);
   %>


</body>
</html>