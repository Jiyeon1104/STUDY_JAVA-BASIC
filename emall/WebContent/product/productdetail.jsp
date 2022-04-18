<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
<%! 
// 선언문 : 전역변수 선언
String title = "상품 상세" ;
%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


<%@ include file = "/_header.jsp" %>
<div class="alert" role="alert">
<div class = "container">
<h1><%=title %></h1>
</div>
</div>

<%
String pid = request.getParameter("pid");
ProductDTO product = (new ProductDAO()).getDetail(pid);
%>

<div class = "container">
<div class = "row">
<div class = "col-ma-5">
<img src = "/images/<%=product.getPimage() %>" style = "width : 100%">
</div>
<div class = "col-ma-6">
<h3><%=product.getPname() %></h3>
<p><%=product.getPdesc() %>
<p><b>상품코드 : <%=product.getPid() %></b>
<p><b>상품가격 : <%=product.getPprice() %></b><br>
<a href = "" class = "btn btn-info">상품주문</a>
<a href = "productlist.jsp" class = "btn btn-secondary">상품목록</a>
</div>

</div>
</div>

<%@ include file = "/_footer.jsp" %>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>