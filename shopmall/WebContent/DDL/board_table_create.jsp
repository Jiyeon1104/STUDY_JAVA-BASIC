<%@page import="java.sql.*"%>
<%@page import="dbconnclose.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 테이블 생성</title>
</head>
<body>
<%
Connection conn = null;			// 연결 객체
PreparedStatement pstmt = null; // 구문 객체

conn = DbConnClose.getConnection();

String sql = "CREATE TABLE board("
		+ "board_id		varchar(10) NOT NULL,"
		+ "board_name	varchar(15),"
		+ "board_title	varchar(100),"
		+ "board_content	varchar(30),"
		+ "board_join_date	date,"
		+ "primary key(board_id))";

pstmt = conn.prepareStatement(sql);
pstmt.executeUpdate();

DbConnClose.resourceClose(pstmt, conn);
%>
</body>
</html>