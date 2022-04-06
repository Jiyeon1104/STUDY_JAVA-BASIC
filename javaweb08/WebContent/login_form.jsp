<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션 정보 확인
	String cust_id = (String)session.getAttribute("cust_id");
	String cust_name = (String)session.getAttribute("cust_name");
	boolean login = false;
	
	if((cust_id != null) && (cust_name != null)){
		login = true; //로그인 상태 확인
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
</head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body class="text-center">
    
<main class="form-signin">
  <form action = "login_check.jsp" method = "POST">
    <img class="mb-4" src="https://avatars.githubusercontent.com/u/98381511?s=400&u=52fd5dcc7fafc4d3847f789be9ee731d9433c31f&v=4" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">로그인하세요</h1>

    <div class="form-floating">
      <input type="text" name = "cust_id" class="form-control" id="floatingInput">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" name = "cust_pw" class="form-control" id="floatingPassword">
      <label for="floatingPassword">암호</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> 로그인 상태 유지
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-muted">&copy; by jiyeon 2022</p>
  </form>
</main>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>