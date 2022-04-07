<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String hakbun = (String)session.getAttribute("hakbun");
String name = (String)session.getAttribute("name");
boolean login = false;

if((hakbun != null) && (name != null)){
	login= true;	// 학번과 이름이 세션에 있으면 로그인 상태
}
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="university.css">
<meta charset="UTF-8">
<title>학생 테이블 확인</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<%@ include file = "menu.jsp" %>
<div class="alert alert-primary" role="alert">  
<p class="text-center">로그인 </p>
</div>
	
	<div class = "container shadow mx-auto mt-5 p-5 w-75" style="background-color: #FFE4E1;">
<form action = "univ_db_std_check.jsp">
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">학번</label>
  <!-- JavaScript Bundle with Popper -->
  <input type="text" name = "hakbun" class="form-control" id="formGroupExampleInput" placeholder="학번을 입력하세요.">
</div>

  <div class="col-12 text-center">
    <button type="submit" class="btn btn-primary">로그인</button>
  </div>
</form>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>