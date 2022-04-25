package jdbc;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class OrderDAO {
	
	public ArrayList<OrderDTO> getList()
	throws NamingException, SQLException {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = ConnectionPool.get();
		
		String sql = "SELECT * FROM orders";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		ArrayList<OrderDTO> orders = new ArrayList<OrderDTO>();
		
		while(rs.next()) {
			orders.add(new OrderDTO(rs.getString("oid"),
									rs.getString("opid"),
									rs.getString("ouid"),
									rs.getString("opname"),
									rs.getString("oprice"),
									rs.getString("ostatus"),
									rs.getString("odate"),
									rs.getString("ograde"),
									rs.getString("ocomm")));
		}

		return orders;
	}
	
	public ArrayList<OrderDTO> getList(String status)
			throws NamingException, SQLException {
			
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				conn = ConnectionPool.get();
				
				String sql = "SELECT * FROM orders WHERE status = ?";				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, status);
				rs = pstmt.executeQuery();
				
				ArrayList<OrderDTO> orders = new ArrayList<OrderDTO>();
				
				while(rs.next()) {
					orders.add(new OrderDTO(rs.getString("oid"),
											rs.getString("opid"),
											rs.getString("ouid"),
											rs.getString("opname"),
											rs.getString("oprice"),
											rs.getString("ostatus"),
											rs.getString("odate"),
											rs.getString("ograde"),
											rs.getString("ocomm")));
				}

				return orders;
			}
	
	// 구매 시작 매서드  status 1  고객
	public int insert() {
	
	return 1;
	}
	
	// 입금 확인 매서드 status 2  고객
	public int confrim() {
	
	return 1;
	}
	
	// 발송 매서드 status 3  판매자
	public int delivery() {
	
	return 1;
	}
	
	
	// 리뷰 status 4 고객
	public int review() {
	
	return 1;
	}
	
	
	
	
}