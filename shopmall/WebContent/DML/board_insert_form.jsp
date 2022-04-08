<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<form method = "post" action = "board_insert_db.jsp">

<table>
<caption>게시판 입력</caption>
<tr style = "border-style : hidden hidden solid hidden;">
<td colspan = "2" style = "background-color : white; text-align : right;">
*부분은 필수 입력사항입니다.</td></tr>

<tr>
<th>*&nbsp; 이름 &nbsp;</th>
<td><input type = "text" name = "board_name" required></td>
</tr>

<tr>
<th>&nbsp; 제목 &nbsp;</th>
<td><input type = "text" name = "board_title"></td>
</tr>

<tr>
<th>&nbsp; 내용 &nbsp;</th>
<td><input type = "text" name = "board_content">
</td>
</tr>

<tr>
<td colspan = "2" style = "text-align : center;">
<input type = submit value = "게시물등록"></td>
</tr>

</table>

</form>
</body>
</html>