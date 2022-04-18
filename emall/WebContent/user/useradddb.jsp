<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@page import="util.FileUtil"%>

<%
request.setCharacterEncoding("utf-8");

String uid=request.getParameter("uid");
String upw=request.getParameter("upw");
String uname=request.getParameter("uname");
String ugender=request.getParameter("ugender");
String ubirth=request.getParameter("ubirth");
String uemail=request.getParameter("uemail");
String uphone=request.getParameter("uphone");
String uaddr=request.getParameter("uaddr");


 UserDAO dao=new UserDAO();
int result=dao.insert(uid, upw, uname, ugender, ubirth, uemail, uphone, uaddr);
if(result==1){
   response.sendRedirect("/user/login.jsp");
}else{
   response.sendRedirect("/user/useradd.jsp");
} 
%>