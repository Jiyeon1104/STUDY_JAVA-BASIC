<%@ page import="java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//jdbc 드라이버 로딩

String driverClass = "com.mysql.jdbc.Driver";

try {
   Class.forName(driverClass);
   out.print("JDBC 드라이버 로딩 성공!<br>");
} catch (ClassNotFoundException err) {
   out.print("JDBC 드라이버 로딩 실패!<br>");
}

// MariaDB 서버 연결
String url = "jdbc:mysql://localhost:3306/?useUnicode=true&serverTimezone=Asia/Seoul";
String id = "root";
String pw = "1104jy";

Connection conn = null;

try {
   conn = DriverManager.getConnection(url, id, pw);
   out.println("SQL DB 서버 연결 성공!<br>");
}catch (SQLException sqlerr) {
   out.println("SQL DB 서버 연결 실패!<br>");
   out.println(sqlerr.getMessage() + "<br>");
}

// PreparedStatement 구문 설정

//에러 감춤용 임시 변수
String sno = "1234";
String sname = "홍길동";

String sql = "INSERT INTO student VALUES(?,?)";

PreparedStatement pstmt = conn.prepareStatement(sql);
   pstmt.setString(1,sno);
   pstmt.setString(2,sname);
   
int result = pstmt.executeUpdate();
// 데이터 삽입후 결과는 0 또는 1로 반환된다. 

//연결 종료

//if(rset != null) rset.close();
if(pstmt != null) pstmt.close();
if(conn != null) conn.close();
%>
</body>
</html>