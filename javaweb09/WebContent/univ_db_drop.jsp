
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 삭제</title>
</head>
<body>
<%
//JDBC 드라이버 로딩 테스트
	try {
	Class.forName("com.mysql.jdbc.Driver");
	out.print("JDBC Driver loading 성공!!<br>");
	} catch (ClassNotFoundException err) {
		out.print("JDBC Driver loading 실패!!<br>");
	}
//DB 연결
	String url = "jdbc:mysql://localhost:3306/workdb?useUnicode=true&serverTimezone=Asia/Seoul";
	String id = "root";
	String pw = "1104jy";
	
	Connection conn = null;         // 연결객체
	PreparedStatement pstmt = null; // 구문객체
	
	try {
		conn = DriverManager.getConnection(url, id, pw);
		out.print("SQL DB 연결 성공!! by 00홍길동<br>");
		
		String sql = "DROP DATABASE university";//DB생성 sql 구문
		
		pstmt = conn.prepareStatement(sql);//구문을 객체에 넣어서
		
		pstmt.executeUpdate();             //구문객체 실행
		
		out.print("univ 데이터베이스 삭제 성공 !!<br>");
		
	} catch (SQLException sqlerr) {
		out.print("univ 데이터베이스 삭제 실패 !!<br>");
	} finally {
		//데이터베이스 연결 종료 
		if (conn != null) {
			try {
				conn.close();
				out.print("SQL DB 연결 종료!!<br>");
			}catch (Exception conerr) {
				conerr.printStackTrace();
			}
		}
	}
%>
</body>
</html>