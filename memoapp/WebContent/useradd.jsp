<%@page import="jdbc.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<% 

   request.setCharacterEncoding("UTF-8");

   String userid = request.getParameter("userid");
   String userpw = request.getParameter("userpw");
   String username = request.getParameter("username");
   
   UserDAO dao = new UserDAO();
   
   
   // 테이블에 이미 아이디가 존재하는 지 확인 후 존재하면 창으로 알려주고 다시 회원가입 페이지로 강제이동
   

if (dao.exists(userid)) {
      out.print("<script> alert('이미 존재하는 아이디입니다. 다시 설정하세요.');");%>
         history.back();         
         <%out.print("</script>");
   }else{
      dao.insert(userid, userpw, username); 
      session.setAttribute("userid", userid);
      response.sendRedirect("main.jsp");
      }


   
%>    
    
