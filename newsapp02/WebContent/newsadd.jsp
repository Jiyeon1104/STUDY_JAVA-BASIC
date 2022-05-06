<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스 등록</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css"
	rel="stylesheet">
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <%@ include file="menu.jsp"%>    
    
	<div class="alert alert-secondary" role="alert">
		<div class="container">
			<h1 class="display-3">
				뉴스 등록
			</h1>
		</div>
	</div>        
        
<form action = "newscheck.jsp" method="post">
<div class="container">
<div class="mb-3">
<select name = "nca" class="form-select" aria-label="Default select example">
  <option selected>뉴스 카테고리를 선택하세요</option>
  <option value="정치">정치</option>
  <option value="경제">경제</option>
  <option value="사회">사회</option>
  <option value="연예">연예</option>
  <option value="컴터">컴터</option>
  <option value="기타">기타</option>
</select>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">뉴스 제목</label>
  <input name = "nsj" type="text" class="form-control" id="exampleFormControlInput1" placeholder="뉴스 제목을 입력하세요">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">뉴스 링크</label>
  <input name = "nlk" type="text" class="form-control" id="exampleFormControlInput1" placeholder="뉴스 링크를 입력하세요">
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">뉴스 내용</label>
  <textarea name = "nct" class="form-control" id="summernote" rows="6"></textarea>
</div>
<div class="mb-3">
<div class="form-check form-switch">
  <input name = "npu" class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckChecked" checked>
  <label class="form-check-label" for="flexSwitchCheckChecked">공개 여부</label>
</div>
</div>


<input type = "submit" value = "뉴스 저장">
</div>
</form>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


	<!— 제이쿼리 js—>
	<script type="text/javascript"
		src="//code.jquery.com/jquery-3.6.0.min.js"></script>
		
		
	<!— summernote js —>
	<script
		src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>

	<script>
		$('#summernote').summernote({
			placeholder : '신문기사를 입력하세요',
			tabsize : 2,
			height : 100
		});
	</script>

</body>
</html>