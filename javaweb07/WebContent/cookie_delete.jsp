<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>쿠키 삭제</b>
<% 

	Cookie[] cookies = request.getCookies();

	if (cookies != null){
	for(int i = 0; i < cookies.length; i++){
		if (cookies[i].getName().equals("id")){
	cookies[i].setMaxAge(0);	// 쿠키의 생존 기간을 0으로 설정	
	response.addCookie(cookies[i]);
	out.print("쿠키 정보가 삭제되었습니다.");
		}
	}
} else {
out.print("설정된 쿠키 정보가 없습니다.");
}
	
%>

</body>
</html>