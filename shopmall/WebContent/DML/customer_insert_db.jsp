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
<%@ include file="/common/jsp_id_check_irud.inc" %>

<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rset = null;
conn = DbConnClose.getConnection();
String sql ="SELECT * FROM customer WHERE (cust_id = ?)";
pstmt = conn.prepareStatement(sql);
   pstmt.setString(1, cust_id);
rset = pstmt.executeQuery();
if (rset.next()) { // 중복
   out.print("<script>alert('사용할수 없는 아이디입니다')"  
         + "history.back();"
         + "</script>");
} else {
   %>
   <%@ include file="/common/jsp_sql_dbset_iu.inc" %>
   <%
   sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?)";
   pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, cust_id);
      pstmt.setString(2, cust_pw);
      pstmt.setString(3, cust_name);
      pstmt.setString(4, cust_tel_no);
      pstmt.setString(5, cust_addr);
      pstmt.setString(6, cust_gender);
      pstmt.setString(7, cust_email);
      pstmt.setString(8, LocalDate.now().toString());
   pstmt.executeUpdate();
   
   
   DbConnClose.resourceClose(rset, pstmt, conn);
   
}
   %>


</body>
</html>