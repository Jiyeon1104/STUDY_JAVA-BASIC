package jdbc;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.NamingException;
import jdbc.BoardDTO;
import util.ConnectionPool;

public class BoardDAO {

	public ArrayList<BoardDTO> getList()
	throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM board";
			
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<BoardDTO> boards = new ArrayList<BoardDTO>();
			
			while(rs.next()) {
				boards.add(new BoardDTO(
						rs.getString("board_id"),
						rs.getString("board_name"),
						rs.getString("board_title"),
						rs.getString("board_content"),
						rs.getString("board_join_date")));
			}
			return boards;
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) pstmt.close();
		}
	}
	
	public BoardDTO getDetail(String board_id) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM board WHERE board_id = ?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board_id);
			rs = pstmt.executeQuery();
			
			rs.next();
			board_id = rs.getString(1);
			String board_name = rs.getString(2);
			String board_title = rs.getString(3);
			String board_content = rs.getString(4);
			String board_join_date = rs.getString(5);
			
			BoardDTO board = new BoardDTO(board_id, board_name, board_title, board_content, board_join_date);
			
			return board;
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) pstmt.close();
		}
	}

}
