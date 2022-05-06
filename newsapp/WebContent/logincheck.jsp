<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String driverClass = "com.mysql.jdbc.Driver";
try{
Class.forName(driverClass);
out.print("jdbc로딩 성공!<br>");
} catch (ClassNotFoundException err){
	out.print("jdbc 드라이버 로딩 실패! <br>");
}
String url = "jdbc:mysql://localhost:3306/news?useUnicode=true&serverTimezone=Asia/Seoul";
String id = "root";
String pw = "1104jy";
Connection conn = null;         // 연결객체
PreparedStatement pstmt = null; // 구문객체
ResultSet rs = null;
try{
	conn = DriverManager.getConnection(url, id, pw);
	out.println("SQL 서버 연결 성공!<br>");
} catch (SQLException sqlerr){
	out.println("SQL 서버 연결 실패 <br>");
	out.println(sqlerr.getMessage() + "<br>");
}
request.setCharacterEncoding("utf-8");
String uid = request.getParameter("uid");
String upw = request.getParameter("upw");
// Connection Pool로 연결은 나중에
try{
	String sql = "SELECT uid, upw FROM user WHERE uid = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,uid);
	rs = pstmt.executeQuery();
	out.print("데이터베이스 입력 성공! <br>");
	
	if(!rs.next()) {
		out.print("아이디가 존재하지 않습니다.");
		} else if (!upw.equals(rs.getString("upw"))) {
			out.print("비밀번호가 일치하지 않습니다");
		} else {
			session.setAttribute("uid", uid);
			out.print("로그인 성공");
			// response.setRedirect("index.html")
		}
	
} catch (SQLException sqlerr){
	out.print("데이터베이스 입력 실패! <br>");
	out.print(sqlerr.getMessage() + "<br>");
} finally{
	if (rs != null)pstmt.close();
	if (pstmt != null) pstmt.close();
	if (conn != null) conn.close();
}
%>