<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// JDBC 드라이버 로딩
	Class.forName("com.mysql.jdbc.Driver");
// DB연결
	String url = "jdbc:mysql://localhost:3306/ExerciseDB?useUnicode=true&serverTimezone=Asia/Seoul";
	String id = "root";
	String pw = "1104jy";
	
	Connection Exercise_Conn = null;  // 디비 연결 객체
	PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체
	
	Exercise_Conn = DriverManager.getConnection(url, id, pw);
	
// 테이블 만들기 SQL

String sql = "CREATE TABLE student("
		 + "num int not null,"
		 + "depart varchar(10),"
		 + "name varchar(10),"
		 + "address varchar(20),"
		 + "phone varchar(50),"
		 + "primary key (num))";

	pstmt = Exercise_Conn.prepareStatement(sql);
	pstmt.executeUpdate(); 
	
	
// DB 연결 종료
	if (pstmt != null) pstmt.close();
	if (Exercise_Conn != null) Exercise_Conn.close();
	
%>
