package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class UserDAO {
   public int insert(String uid, String upw, String uname, String ugender, String ubirth, String uemail, String uphone,
         String uaddr) throws NamingException, SQLException{
         Connection conn=null;
         PreparedStatement pstmt=null;
         
         try {
            String sql="INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?)";
            conn = ConnectionPool.get();
            pstmt = conn.prepareStatement(sql);
               pstmt.setString(1, uid);
               pstmt.setString(2, upw);
               pstmt.setString(3, uname);
               pstmt.setString(4, ugender);
               pstmt.setString(5, ubirth);
               pstmt.setString(6, uemail);
               pstmt.setString(7, uphone);
               pstmt.setString(8, uaddr);
               pstmt.setString(9, LocalDate.now().toString());
               
            int result =pstmt.executeUpdate();
            return result;
         }finally {
            
            if(pstmt !=null) pstmt.close();
            if(conn !=null) conn.close();
         }
   }
   
   public int login(String uid, String upw) throws NamingException, SQLException{
	   
       Connection conn = null;
       PreparedStatement pstmt = null;
       ResultSet rs = null;
       
	   try {
		   String sql = "SELECT uid,upw FROM user WHERE uid = ?";
		   
		   conn = ConnectionPool.get();
		   pstmt = conn.prepareStatement(sql);
		   		   pstmt.setString(1,uid);
		   rs = pstmt.executeQuery();
		   
		   if(!rs.next()) return 1;							//회원이 아닌 경우
		   if(!upw.equals(rs.getString("upw"))) return 2;	//암호 틀린 경우
		   return 0;
		   }finally {
			    if(rs != null) rs.close();
	            if(pstmt !=null) pstmt.close();
	            if(conn !=null) conn.close();
	         }
   }
}