<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns","root", "1104jy");
	// Statement stmt = conn.createStatement();
	// ResultSet rs = stmt.executeQuery("Select id, name From user");

%>