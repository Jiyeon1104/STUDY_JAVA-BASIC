<%@page import="jdbc.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");      //한글처리
   String memo=request.getParameter("memo");      //전페이지에서 입력한 메모 내용 받기
   String uid="test"; //세션에서 유저 아이디 가져오는 줄 세션으로 유저 아이디 끌고 오기
   
   MemoDAO dao=new MemoDAO();         //객체 생성?? 메서드를 호출하기 위해
   
   dao.insert(memo, uid);         //메모 삽입 메서드 호출
   response.sendRedirect("main.jsp");

%>