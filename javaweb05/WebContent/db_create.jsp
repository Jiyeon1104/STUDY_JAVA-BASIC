<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 생성</title>
</head>
<body>
<%

//JDBC 드라이버 로딩 테스트
   Class.forName("com.mysql.jdbc.Driver");

//DB 연결

   String url = "jdbc:mysql://localhost:3306/workdb?useUnicode=true&serverTimezone=Asia/Seoul";
   String id = "root";
   String pw = "1104jy";
   
   Connection conn = null;         // 연결객체
   PreparedStatement pstmt = null; // 구문객체
   
   conn = DriverManager.getConnection(url, id, pw);
      
   String sql = "CREATE DATABASE visit";//DB생성 sql 구문
      
   pstmt = conn.prepareStatement(sql);//구문을 객체에 넣어서
      
   pstmt.executeUpdate();             //구문객체 실행
      
      
      //데이터베이스 연결 종료 
      if (conn != null) { conn.close();

      }
%>
</body>
</html>