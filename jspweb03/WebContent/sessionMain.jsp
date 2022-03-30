<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String sid = (String) session.getAttribute("id");

if (sid == null){
	out.print("로그인 정보가 없습니다.");
} else {
	out.print("회원 페이지입니다. by 12김지연");
}
%>
