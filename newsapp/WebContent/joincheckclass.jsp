<%@page import="java.sql.*"%>
<%@page import="dbconnclose.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// JDBC 드라이버 로딩 > class 연결

Connection conn = null;
PreparedStatement pstmt = null;
// ResultSet rs = null;

conn = DbconnClose.getConnection();

request.setCharacterEncoding("utf-8");

String uid = request.getParameter("uid");
String upw = request.getParameter("upw");
String unm = request.getParameter("unm");


// Connection Pool로 연결은 나중에
try{
	String sql = "INSERT INTO user VALUES (?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,uid);
	pstmt.setString(2,upw);
	pstmt.setString(3,unm);
	pstmt.executeUpdate();
	out.print("데이터베이스 입력 성공! <br>");
	
} catch (SQLException sqlerr){
	out.print("데이터베이스 입력 실패! <br>");
	out.print(sqlerr.getMessage() + "<br>");
} finally{
	// if (rs != null)pstmt.close();
	if (pstmt != null) pstmt.close();
	if (conn != null) conn.close();
}
%>