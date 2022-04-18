<%@page import="jdbc.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id = "productDAO" class = "jdbc.ProductDAO" scope = "session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상품 목록</h1>
<%
ArrayList<ProductDTO> listOfProducts = productDAO.getAllProducts();
%>

<%
for(int i = 0; i < listOfProducts.size(); i++){
	ProductDTO product = listOfProducts.get(i);
%>

<%=product.getPname() %>
<%=product.getPdesc() %>
<%=product.getPprice() %> 원

<%
}
%>

</body>
</html>