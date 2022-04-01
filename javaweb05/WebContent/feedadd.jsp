<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");

// 드라이버 로딩
	Class.forName("com.mysql.jdbc.Driver");

// DB연결
	String url = "jdbc:mysql://localhost:3306/visit?useUnicode=true&serverTimezone=Asia/Seoul";
	String id = "root";
	String pw = "1104jy";
	
	Connection conn = null;	// DB연결 객체
	PreparedStatement pstmt = null; // DB에 전달할 SQL 구문 객체
	
	conn = DriverManager.getConnection(url, id, pw);
	
	// 테이블 데이터 넣는 SQL
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	
	
	// 테이블 만들기 SQL
	String sql = "INSERT INTO feed VALUES(?,?,now())";
	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setString(2,content);
		pstmt.executeUpdate();
	
// DB연결 종료
	if (pstmt != null) pstmt.close();

	if (conn != null) conn.close();
	
	
	response.sendRedirect("main.jsp");
%>