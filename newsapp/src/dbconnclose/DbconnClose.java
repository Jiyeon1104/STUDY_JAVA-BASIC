package dbconnclose;

import java.sql.*;

public class DbconnClose {
	public static Connection getConnection() {

		// JDBC로딩
		String driverClass = "com.mysql.jdbc.Driver";

		try{
		Class.forName(driverClass);
		System.out.print("jdbc로딩 성공!<br>");
		} catch (ClassNotFoundException err){
			System.out.print("jdbc 드라이버 로딩 실패! <br>");
		}

		// SQL 서버 연결
		String url = "jdbc:mysql://localhost:3306/news?useUnicode=true&serverTimezone=Asia/Seoul";
		String id = "root";
		String pw = "1104jy";
		
		Connection conn = null;         // 연결객체

		try{
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("SQL 서버 연결 성공!<br>");
		} catch (SQLException sqlerr){
			System.out.println("SQL 서버 연결 실패 <br>");
			System.out.println(sqlerr.getMessage() + "<br>");
		}
		return conn;
	}
	
	public static void resourceClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
		try {
			if (rs != null)pstmt.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (SQLException sqlerr) {
			System.out.println("데이터베이스 종료 오류!");
			System.out.println(sqlerr.getMessage());
		}
	}
		
	// 메서드 오버로딩
		public static void resourceClose(PreparedStatement pstmt, Connection conn) {
			
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException sqlerr) {
				System.out.println("데이터베이스 종료 오류!");
				System.out.println(sqlerr.getMessage());
			}
	}
}
