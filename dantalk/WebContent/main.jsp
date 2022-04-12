<%@ page import = "jdbc.*" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Single+Day&display=swap" rel="stylesheet">
<style>
*{
font-family: 'Single Day', cursive;
background-color : #ffe4e1;
border-radius : 5%;
}
</style>
<meta charset="UTF-8">
<title>단톡방</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<div class = "container shadow mx-auto mt-5 p-5 w-75">
<form action = "feedAdd.jsp" method = "post" enctype = "multipart/form-data">

<h2><b>톡작성 > </b></h2><br><br>

<div class="mb-3">
  <label for="inputid" class="form-label"><b>아이디</b></label>
  <input type="text" class="form-control" name = "uid" id="inputid" placeholder="글작성자 아이디" required>
</div>
<div class="mb-3">
  <label for="inputcontent" class="form-label"><b>글작성</b></label>
  <textarea class="form-control" name = "ucon" id="inputcontent" rows="3"></textarea>
</div>


<div class="mb-3">
  <label for="formFile" class="form-label"><b>이미지</b></label>
  <input class="form-control" name = "uimage" type="file" id="formFile">
</div>

<tr><td colspan = 2 align = center height = 40><input type = "submit" value = "등록"></td></tr>
<br><br>

</form>

<table class = "table table-hover" align = center>
<tr><td colspan = 2><h2><b>톡보기 > </b></h2></td></tr>

<%
ArrayList<FeedDTO> feeds = (new FeedDAO()).getList();
for(FeedDTO feed : feeds){
	String img = feed.getImages();
	String imgstr = " ";
	if(img != null){
		imgstr = "<img src = 'images/" + img + "'width = 240>";
	}
%>

<tr><td colspan = 2><hr></td></tr>
<tr><td><%=feed.getId() %></td>
	<td><%=feed.getTs() %></td></tr>
<tr><td colspan = 2><%=imgstr %></td></tr>
<tr><td colspan = 2><%=feed.getContent() %></td></tr>

<%
}
%>

</table>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</div>
</body>
</html>