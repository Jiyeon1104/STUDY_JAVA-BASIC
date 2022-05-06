package dbconnclose;

import java.sql.*;
public class DbConnClose {

		public static Connection getConnection() {
			
			
			//jdbc 드라이버 로딩

			String driverClass = "org.mariadb.jdbc.Driver";

			try {
				Class.forName(driverClass);
				System.out.print("JDBC 드라이버 로딩 성공!<br>");
			} catch (ClassNotFoundException err) {
				System.out.print("JDBC 드라이버 로딩 실패!<br>");
			}

			// MariaDB 서버 연결
			String url = "jdbc:mariadb://localhost:3306/news";
			String id = "root";
			String pw = "0000";

			Connection conn = null;

			try {
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("MariaDB 서버 연결 성공!<br>");
			} catch (SQLException sqlerr) {
				System.out.println("MariaDB 서버 연결 실패!<br>");
				System.out.println(sqlerr.getMessage() + "<br>");
			}
			return conn;
		}
		
		public static void resourceClose
		(ResultSet rset, PreparedStatement pstmt, Connection conn) {
			
			try {
				if (rset != null) rset.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close(); 
			} catch (SQLException sqlerr) {
				System.out.println("데이터 베이스 종료 오류!");
			}
			
		}
		
		public static void resourceClose
		(PreparedStatement pstmt, Connection conn) {
			
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close(); 
			} catch (SQLException sqlerr) {
				System.out.println("데이터 베이스 종료 오류!");
			}
			
		}		
		
		
}
