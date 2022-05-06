<%@page import="java.sql.*"%>
<%@page import="dbconnclose.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//jdbc 드라이버 로딩  -> class 연결
	// MariaDB 서버 연결-> class 연결

Connection conn = null;
PreparedStatement pstmt = null;
//ResultSet rs = null; 

conn = DbConnClose.getConnection();

request.setCharacterEncoding("utf-8");

String unm = request.getParameter("unm");	
String uid = request.getParameter("uid");	
String upw = request.getParameter("upw");	

// Connection Pool 로 연결은 나중에...



// PreparedStatement 구문 설정

try {
	String sql = "INSERT INTO user VALUES(?,?,?)";

	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid);
		pstmt.setString(2, upw);
		pstmt.setString(3, unm);
	pstmt.executeUpdate();
	out.print("데이터 베이스 입력 성공 ! <br>");

} catch (SQLException sqlerr) {
	out.print("데이터 베이스 입력 실패 ! <br>");
	out.print(sqlerr.getMessage() + "<br>");
} finally {

	//연결 종료
	
	//if(rset != null) rset.close();
	if (pstmt != null) pstmt.close();
	if (conn != null) conn.close(); 
} 
%>

	
	


