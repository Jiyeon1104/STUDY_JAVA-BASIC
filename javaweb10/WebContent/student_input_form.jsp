<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 입력</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<%@ include file="menu.jsp" %>


<div class = "container bg-warning shadow mx-auto mt-5 p-5 w-75">
<div class="alert alert-primary" role="alert">  
<p class="text-center"> 학생 정보 입력 </p>
</div>
   <form class="row g-3" action="student_input.jsp" method="post">
   
   
  <div class="col-md-6">
    <label for="inputEmail4" class="form-label">학번</label>
    <input type="text" name="hakbun" class="form-control" id="inputEmail4">
  </div>
  <div class="col-md-6">
    <label for="inputPassword4" class="form-label">이름</label>
    <input type="text" name="name" class="form-control" id="inputPassword4">
  </div>
  
  
  
    <div class="col-md-6">
    
    <label for="inputState" class="form-label">성별</label>
    <br>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="남자">
  <label class="form-check-label" for="inlineRadio1">남자</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="여자">
  <label class="form-check-label" for="inlineRadio2">여자</label>
</div>

  </div>
      <div class="col-md-6">
    <label for="inputState" class="form-label">학년</label>
    <select id="inputState" name = "year" class="form-select">
      <option selected>Choose...</option>
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      
    </select>
  </div>

  <div class="col-12">
    <label for="inputAddress" class="form-label">전공</label>
    <input type="text"  name="dept" class="form-control" id="inputAddress" >
  </div>
  <div class="col-12">
    <label for="inputAddress2" class="form-label">주소</label>
    <input type="text"  name="addr" class="form-control" id="inputAddress2" >
  </div>
 
 
 
 
  <div class="col-12 text-center">
    <button type="submit" class="btn btn-primary">학생 등록</button>
  </div>
</form>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>