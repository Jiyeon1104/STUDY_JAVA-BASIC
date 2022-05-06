<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스 등록</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css"
	rel="stylesheet">
	
<select name = "nca" class="form-select" aria-label="Default select example">
  <option selected>카테고리를 선택하세요</option>
  <option value="정치">정치</option>
  <option value="경제">경제</option>
  <option value="사회">사회</option>
  <option value="생활/문화">생활/문화</option>
  <option value="IT/과학">IT/과학</option>
</select>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">뉴스 제목</label>
  <input type="text" name = "nsj" class="form-control" id="exampleFormControlInput1" placeholder="뉴스 제목을 입력하세요">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">뉴스 링크</label>
  <input type="text" name = "nlk" class="form-control" id="exampleFormControlInput1" placeholder="뉴스 링크를 달아주세요">
</div>

<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">뉴스 내용</label>
  <textarea name = "nct" class="form-control" id="exampleFormControlTextarea1" rows="5"></textarea>
  
</div>

<div class="form-check form-switch">
  <input name = "npu" class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckChecked" checked>
  <label class="form-check-label" for="flexSwitchCheckChecked">공개 여부</label>
</div>
<input type = "submit" value = "뉴스 저장">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<!— 제이쿼리 js—>
	<script type="text/javascript"
		src="//code.jquery.com/jquery-3.6.0.min.js"></script>
</body>
</html>