package jdbc;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO { 
   public boolean insert(String memo, String uid) throws NamingException , SQLException{
      Connection conn=null;
      PreparedStatement pstmt=null;
      
      try {
      String sql="insert into memo (uid, memo, mdone) values(?,?,?)";
      conn=ConnectionPool.get();
      pstmt=conn.prepareStatement(sql);
         pstmt.setString(1, uid);
         pstmt.setString(2, memo);
         pstmt.setString(3, "1");
         
      int result=pstmt.executeUpdate();
      
      return (result==1)?true:false;
      }finally {
         if(pstmt!=null) pstmt.close();
         if(conn!=null) conn.close();
      }
      
   }
   
   public ArrayList<MemoDTO> getList() throws NamingException, SQLException{
	   Connection conn = null;
	   PreparedStatement pstmt = null;
	   ResultSet rset = null;
	   
	   try {
		   String sql = "SELECT * FROM memo WHERE uid = 'test' and mdone = '1' ORDER BY mdate DESC";
		   conn = ConnectionPool.get();
		   pstmt = conn.prepareStatement(sql);
		   rset = pstmt.executeQuery();
		   
		   ArrayList<MemoDTO> memos = new ArrayList<MemoDTO>();
		   
		   while (rset.next()) {
			   memos.add(new MemoDTO(rset.getString("mid"),
					   				 rset.getString("uid"),
					   				 rset.getString("memo"),
					   				 rset.getString("mdone"),
					   				 rset.getString("mdate")));		   
		   } return memos;
	   } finally {
		   if(rset != null) rset.close();
		   if(pstmt != null) pstmt.close();
		   if(conn != null) conn.close();
	   }
   }

   public boolean delete(String mid) throws NamingException , SQLException{
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      
	      try {
	      String sql="UPDATE memo SET mdone = '0' WHERE mid = ?";
	      conn=ConnectionPool.get();
	      pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1,mid);
	         
	      int result=pstmt.executeUpdate();
	      
	      return (result==1)?true:false;
	      }finally {
	         if(pstmt!=null) pstmt.close();
	         if(conn!=null) conn.close();
	      }
	      
	   }
   
   public ArrayList<MemoDTO> getDeleteList() throws NamingException, SQLException{
	   Connection conn = null;
	   PreparedStatement pstmt = null;
	   ResultSet rset = null;
	   
	   try {
		   String sql = "SELECT * FROM memo WHERE uid = 'test' and mdone = '0' ORDER BY mdate DESC";
		   conn = ConnectionPool.get();
		   pstmt = conn.prepareStatement(sql);
		   rset = pstmt.executeQuery();
		   
		   ArrayList<MemoDTO> memos = new ArrayList<MemoDTO>();
		   
		   while (rset.next()) {
			   memos.add(new MemoDTO(rset.getString("mid"),
					   				 rset.getString("uid"),
					   				 rset.getString("memo"),
					   				 rset.getString("mdone"),
					   				 rset.getString("mdate")));		   
		   } return memos;
	   } finally {
		   if(rset != null) rset.close();
		   if(pstmt != null) pstmt.close();
		   if(conn != null) conn.close();
	   }
   }
   
   public boolean undelete(String mid) throws NamingException, SQLException	{
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		String sql = "UPDATE memo SET mdone = '1' WHERE mid = ?";
		conn = ConnectionPool.get();
		
		pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);

		
		int result = pstmt.executeUpdate();
		
		return (result == 1) ? true : false;
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}

}
   
}