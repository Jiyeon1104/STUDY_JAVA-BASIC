package jdbc;

import java.sql.*;

import javax.naming.NamingException;

import util.ConnectionPool;

public class UserDAO {

		public int login(String uid, String upw)
		throws NamingException, SQLException {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "SELECT uid, upw FROM user WHERE uid = ?";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, uid);
			rs = pstmt.executeQuery();
			
			if(!rs.next()) {
				return 1;
			} else if (!upw.equals(rs.getString("upw"))) {
				return 2;
			} else {
				return 0;
			}
			
	
		}
}
