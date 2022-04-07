<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="database_connect.inc" %>
<%
	request.setCharacterEncoding("UTF-8");
	
// 테이블 데이터 넣는 SQL
	String hakbun = request.getParameter("hakbun");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String year = request.getParameter("year");
	String dept = request.getParameter("dept");
	String addr = request.getParameter("addr");
	String sql = "INSERT INTO student VALUES(?,?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		pstmt.setString(2, name);
		pstmt.setString(3, gender);
		pstmt.setString(4, year);
		pstmt.setString(5, dept);
		pstmt.setString(6, addr);
	pstmt.executeUpdate(); 
	
%>

<%@ include file = "database_close.inc"%>

<% response.sendRedirect("student_list.jsp");  %>