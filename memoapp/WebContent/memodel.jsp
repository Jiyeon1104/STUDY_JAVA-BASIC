<%@page import="jdbc.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String mid = request.getParameter("mid");
String uid = "test";

MemoDAO dao = new MemoDAO();

dao.delete(mid);
response.sendRedirect("main.jsp");
%>