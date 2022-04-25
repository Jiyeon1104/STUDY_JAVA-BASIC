<%@page import="java.util.ArrayList"%>
<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메모앱</title>
<meta name=viewpoint
	content="width = device-width, initial-scale = 1, user-scalable = 0">
</head>
<body>
	<!-- CSS only -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">

	<div align="center">
		<div class="btn-group" role="group"
			aria-label="Button group with nested dropdown">
			<a href="main.jsp" class="btn btn-danger">메모 보기</a>
			 <a href="memodeletelist.jsp" class="btn btn-danger">삭제 메모</a>

					<div class="btn-group" role="group">
						<button id="btnGroupDrop1" type="button"
							class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown"
							aria-expanded="false">회원 메뉴</button>
						<ul class="dropdown-menu" aria-labelledby="btnGroupDrop1">
							<li><a class="dropdown-item" href="#">회원가입</a></li>
							<li><a class="dropdown-item" href="#">회원탈퇴</a></li>
						</ul>
					</div>
		</div>
	</div>

	<form action="memoadd.jsp" method="post">
		<div class="alert alert-secondary" role="alert">

			<div class="input-group mb-3">
				<input type="text" name="memo" class="form-control"
					placeholder="메모를 작성하세요" aria-label="Recipient's username"
					aria-describedby="button-addon2"> <input type="submit"
					value="메모저장">
			</div>
		</div>

	</form>

	<%
		ArrayList<MemoDTO> memos = (new MemoDAO()).getList();

	for (MemoDTO memo : memos) {
	%>

	<div class="alert alert-secondary" role="alert">
		<div class="card text-center">
			<div class="card-header">메모</div>
			<div class="card-body">
				<h5 class="card-title"><%=memo.getMemo()%></h5>
				<a href="memodel.jsp?mid=<%=memo.getMid()%>"
					class="btn btn-secondary">삭제</a>
			</div>
			<div class="card-footer text-muted">
				<%=memo.getMdate()%>
			</div>
		</div>
	</div>

	<%
		}
	%>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>