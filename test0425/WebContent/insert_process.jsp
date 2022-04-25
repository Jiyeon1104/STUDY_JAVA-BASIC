<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");

// 드라이버 로딩
	Class.forName("com.mysql.jdbc.Driver");

// DB연결
	String url = "jdbc:mysql://localhost:3306/ExerciseDB?useUnicode=true&serverTimezone=Asia/Seoul";
	String id = "root";
	String pw = "1104jy";
	
	Connection Exercise_Conn = null;	// DB연결 객체
	PreparedStatement pstmt = null; // DB에 전달할 SQL 구문 객체
	
	Exercise_Conn = DriverManager.getConnection(url, id, pw);
	
	// 테이블 데이터 넣는 SQL
	String num = request.getParameter("num");
	String depart = request.getParameter("depart");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");
	
	// 테이블 만들기 SQL
	String sql = "INSERT INTO student VALUES(?,?,?,?,?)";
	pstmt = Exercise_Conn.prepareStatement(sql);
		pstmt.setString(1,num);
		pstmt.setString(2,depart);
		pstmt.setString(3,name);
		pstmt.setString(4,address);
		pstmt.setString(5,phone);
	pstmt.executeUpdate();
	
// DB연결 종료
	if (pstmt != null){
		pstmt.close();
	}

	if (Exercise_Conn != null){
		Exercise_Conn.close();
	}
	
	out.print("Student 테이블 삽입이 성공했습니다.");
%>