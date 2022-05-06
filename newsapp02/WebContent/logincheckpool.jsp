<%@page import="jdbc.UserDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("utf-8");

String uid = request.getParameter("uid");	
String upw = request.getParameter("upw");	

// Connection Pool 

UserDAO dao = new UserDAO();

int result = dao.login(uid, upw);

if(result == 1) {
	out.print("아이디가 존재하지 않습니다.<br>");
} else if (result == 2) {
	out.print("비밀번호가 일치하지 않습니다.<br>");
} else {
	session.setAttribute("uid", uid);
	out.print("로그인 성공!!<br>");
	//response.sendRedirect("index.html");
}

%>

	
	


