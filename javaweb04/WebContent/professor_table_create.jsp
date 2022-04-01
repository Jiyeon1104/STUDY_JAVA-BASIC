<%@ page import = "java.sql.*" %>
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

Class.forName("com.mysql.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/univ?useUnicode=true&serverTimezone=Asia/Seoul";
String id = "root";
String pw = "1104jy";

Connection conn = null;         // 연결객체
PreparedStatement pstmt = null; // 구문객체

conn = DriverManager.getConnection(url, id, pw);

String sql = "CREATE TABLE professor("
		 + "sabun int not null,"
		 + "name varchar(10),"
		 + "dept varchar(20),"
		 + "primary key (sabun))";

pstmt = conn.prepareStatement(sql);
pstmt.executeUpdate();

//DB연결 종료
if (pstmt != null){
	pstmt.close();
}

if (conn != null){
	conn.close();
}

out.print("DB연결 문제 없음 by 12김지연");
%>

</body>
</html>