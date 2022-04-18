<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- setProperty는 useBean과 함게 자바빈즈의 Setter() 메서드에 접근하여
자바빈즈의 멤버변수인 프로퍼티의 값을 저장하는 태그임
setProperty태그는 폼 페이지로부터 전달되는 요청 파라미터 값을 직접 저장하거나
자바 빈즈의 프로퍼티로 변경하여 값을 저장할 수 있움

속성
name useBean 태그에 id 속성값으로 설정된 자바빈즈를 식별하기 위한 이름
property - 자바빈즈의 프로퍼티 이름임 이름에 '*'를 사용하면 모든 요청 파라미터가
자바 빈즈 프로퍼티의 setter() 메서드에 전달됨을 의미함
values - 변경할 자바 빈즈의 프로퍼티 값, 만약 프로퍼티 값이 null이거나 존재하지 않는 요청인 경우에는
param - 요청 파라미터의 이름 param과 values를 동시에 모두 사용할 수 없으며 하나만 선택하여 사용 가능

<jsp:setProperty name = "자바빈즈 이름" property = "속성이름" value = "값"/>

<form action = "memberdb.jsp" method = "post">
<input name = "id" value = "admin">
</form>
--%>
</body>
</html>