<%@page import="jdbc.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");       //한글처리
	String mid = request.getParameter("mid");  // 전 페이지에서 입력한 메모 내용 받기
	String uid = "test";                         // 임시 작성자 test로 설정하였으나 유저생성 후에는 session id 로 대체 
	
	MemoDAO dao = new MemoDAO();                 // 객체 생성 ?? 매서드를 호출하기위해서
	dao.undelete(mid);                       // 메모삭제 매서드 호출
	
	response.sendRedirect("main.jsp");           // 메모 db에 삽입 후에 다시 main으로 돌아가 메모 목록 보기 
%>