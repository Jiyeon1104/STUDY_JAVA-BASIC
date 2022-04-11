<%@ page import = "DAO.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8");

String uid = request.getParameter("uid");
String ucon = request.getParameter("ucon");

FeedDAO dao = new FeedDAO();
if(dao.insert(uid, ucon)){
	response.sendRedirect("main.jsp");
} else {
	out.print("글 작성 중 에러 발생");
}

%>