<%@page import="jdbc.NewsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	String nau = "1111";
	String nca = request.getParameter("nca");
	String nsj = request.getParameter("nsj");
	String nct = request.getParameter("nct");
	String nlk = request.getParameter("nlk");
	String npu = request.getParameter("npu");

	NewsDAO dao = new NewsDAO();
	
	dao.insert(nau, nca, nsj, nct, nlk, npu);
	
	response.sendRedirect("main.jsp");
%>

