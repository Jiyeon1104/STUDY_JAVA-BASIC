<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

	int sum = 0;
	
	for(int s = 1; s <= 10; s++){
		sum += s;
		}
		
%>

1부터 10까지의 정수 합은 <%=sum %>입니다.
