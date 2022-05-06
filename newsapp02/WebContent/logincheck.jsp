<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//jdbc 드라이버 로딩

String driverClass = "org.mariadb.jdbc.Driver";

try {
	Class.forName(driverClass);
	out.print("JDBC 드라이버 로딩 성공!<br>");
} catch (ClassNotFoundException err) {
	out.print("JDBC 드라이버 로딩 실패!<br>");
}

// MariaDB 서버 연결
String url = "jdbc:mariadb://localhost:3306/news";
String id = "root";
String pw = "0000";

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
	conn = DriverManager.getConnection(url, id, pw);
	out.println("MariaDB 서버 연결 성공!<br>");
} catch (SQLException sqlerr) {
	out.println("MariaDB 서버 연결 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
}


request.setCharacterEncoding("utf-8");

String uid = request.getParameter("uid");	
String upw = request.getParameter("upw");	

// Connection Pool 로 연결은 나중에...



// PreparedStatement 구문 설정

try {
	String sql = "SELECT uid, upw FROM user WHERE uid = ?";

	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid);
	rs = pstmt.executeQuery();
	
	if(!rs.next()) {
		out.print("아이디가 존재하지 않습니다.<br>");
	} else if (!upw.equals(rs.getString("upw"))) {
		out.print("비밀번호가 일치하지 않습니다.<br>");
	} else {
		session.setAttribute("uid", uid);
		out.print("로그인 성공!!<br>");
		//response.sendRedirect("index.html");
	}

} catch (SQLException sqlerr) {
	out.print("데이터 베이스 연결 실패 ! <br>");
	out.print(sqlerr.getMessage() + "<br>");
} finally {

	//연결 종료
	
	//if(rset != null) rset.close();
	if (pstmt != null) pstmt.close();
	if (conn != null) conn.close(); 
} 
%>

	
	


