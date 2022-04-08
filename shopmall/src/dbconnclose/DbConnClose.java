package dbconnclose;

import java.sql.*;

public class DbConnClose {

	public static Connection getConnection() {
		try {
		//JDBC 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException err) {
			System.out.println(err.getMessage());
		}
		
		//DB연결
		String url = "jdbc:mysql://localhost:3306/shopmall?useUnicode=true&serverTimezone=Asia/Seoul";
		String id = "root";
		String pw = "1104jy";
		
		Connection conn = null; // 디비 연결 객체
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException sqlerr) {
			System.out.println(sqlerr.getMessage());
		}
		return conn;
	}
	
	public static void resourceClose(ResultSet rset, Statement stmt, Connection conn) {
		try {
		if (rset != null) rset.close();
		if (stmt != null) stmt.close();
		if (conn != null) conn.close();
		} catch(SQLException sqlerr) {
		System.out.println(sqlerr.getMessage());
		}
	}
	
	public static void resourceClose(Statement stmt, Connection conn) {
		try {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close();
		} catch(SQLException sqlerr) {
		System.out.println(sqlerr.getMessage());
		}
	}
}
