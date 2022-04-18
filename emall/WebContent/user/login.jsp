<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="text-center">
   <!-- CSS only -->
   <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">
    
<main class="form-signin">
  <form action = "logindb.jsp" method = "post">
    <img class="mb-4" src="https://avatars.githubusercontent.com/u/98381511?v=4" alt="" width="100" height="100">
    <h1 class="h3 mb-3 fw-normal">로그인</h1>

    <div class="form-floating">
      <input type="text" name = "uid" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" name = "upw" class="form-control" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">비밀번호</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> 아이디 저장
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017–2022</p>
  </form>
</main>


     <!-- JavaScript Bundle with Popper -->
   <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
      crossorigin="anonymous"></script>  
  </body>
</html>