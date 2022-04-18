package jdbc;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.NamingException;
import jdbc.ProductDTO;
import util.ConnectionPool;

public class ProductDAO {
	
	public ArrayList<ProductDTO> getAllProducts(){
		return listOfProducts;
	}

	public ArrayList<ProductDTO> getList()
	throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM product";
			
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<ProductDTO> products = new ArrayList<ProductDTO>();
			
			while(rs.next()) {
				products.add(new ProductDTO(rs.getString("pid"),
						rs.getString("pname"),
						rs.getString("pprice"),
						rs.getString("pdesc"),
						rs.getString("pmanu"),
						rs.getString("pcate"),
						rs.getString("pcondi"),
						rs.getString("pimage")));
			}
			return products;
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) pstmt.close();
		}
	}
	
	public ProductDTO getDetail(String pid) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM product where pid = ?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, pid);
			rs = pstmt.executeQuery();
			
			rs.next();
			String id = rs.getString(1);
			String pname = rs.getString(2);
			String pprice = rs.getString(3);
			String pdesc = rs.getString(4);
			String pmanu = rs.getString(5);
			String pcate = rs.getString(6);
			String pcondi = rs.getString(7);
			String pimage = rs.getString(8);
			
			ProductDTO product = new ProductDTO(id, pname, pprice, pdesc, pmanu, pcate, pcondi, pimage);
			
			return product;
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) pstmt.close();
		}
	}
	
	public boolean insert(String pid, String pname, String pprice, String pdesc, String pmanu, String pcate, String pcondi, String pimage) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "INSERT INTO product(pid, pname, pprice, pdesc, pmanu, pcate, pcondi, pimage) VALUES (?,?,?,?,?,?,?,?)";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pid);
			pstmt.setString(2, pname);
			pstmt.setString(3, pprice);		
			pstmt.setString(4, pdesc);	
			pstmt.setString(5, pmanu);	
			pstmt.setString(6, pcate);	
			pstmt.setString(7, pcondi);	
			pstmt.setString(8, pimage);	
			int result = pstmt.executeUpdate();
			return (result == 1) ? true : false;
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}

}
