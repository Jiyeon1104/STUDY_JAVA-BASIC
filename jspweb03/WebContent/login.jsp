<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<%
	Date now = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	String date = df.format(now);
	
	if (date.endsWith("30")){
		response.sendRedirect("underCheck.jsp");
		return;
	}

	String uid = request.getParameter("id");
	out.print(uid);
%>