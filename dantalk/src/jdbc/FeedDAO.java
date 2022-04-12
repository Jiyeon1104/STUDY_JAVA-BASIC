package jdbc;

import java.sql.*;
import java.util.ArrayList;
import javax.naming.NamingException;
import util.ConnectionPool;


public class FeedDAO {

	public boolean insert(String uid, String ucon, String ufname) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "INSERT INTO feed(id, content, images) VALUES (?,?,?)";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.setString(2, ucon);
			pstmt.setString(3, ufname);			
			int count = pstmt.executeUpdate();
			return (count > 0) ? true : false;
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
	
	public ArrayList<FeedDTO> getList() throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM feed ORDER BY ts DESC";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<FeedDTO> feeds = new ArrayList<FeedDTO>();
			
			while(rs.next()) {
				feeds.add(new FeedDTO(rs.getString("id"),
									  rs.getString("content"),
									  rs.getString("ts"),
									  rs.getString("images")));
			}
			return feeds;
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
}
