package jdbc;
import java.sql.*;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class NewsDAO {
public int insert(String nau, String nca, String nsj, String nct, String nlk, String npu)
	throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO news (nau, nca, nsj, nct, nlk, npu) VALUES (?,?,?,?,?,?)";
			
		conn = ConnectionPool.get();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nau);
		pstmt.setString(2, nca);
		pstmt.setString(3, nsj);
		pstmt.setString(4, nct);
		pstmt.setString(5, nlk);
		pstmt.setString(6, npu);
			
		int result = pstmt.executeUpdate();
	return result;
}

public int delete() {
	return 1;
}

public ArrayList<NewsDTO> getlist() throws NamingException, SQLException{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "SELECT * FROM news";
	
	conn = ConnectionPool.get();
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	
	ArrayList<NewsDTO> news = new ArrayList<NewsDTO>();
	
	while(rs.next()) {
		news.add(new NewsDTO(rs.getString(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getString(6),
				rs.getString(7),
				rs.getString(8)));
	}	
	return news;
}

public int getlist(String nau) {
	return 1;
}

public int getlist(String nau, String npu) {
	return 1;
}
}
