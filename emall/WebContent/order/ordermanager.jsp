<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jdbc.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 관리</title>
</head>
<body>



   <%!// 선언문
   String title = "게시판 목록";%>
   <!-- CSS only -->
   <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">

   <%@ include file="/_header.jsp"%>
   <div class="alert alert-secondary" role="alert">
      <div class="container">
         <h1 class="display-3">
            <%=title%>
         </h1>
      </div>
   </div>

   <div class="container">
      <div class="row" align="center">
      

      
<div class="container my-3">
<div align ="right">
<a href ="orderstatus.jsp?status="1">[입금 전]</a>
<a href ="orderstatus.jsp?status="2">[입금 완료]</a>
<a href ="orderstatus.jsp?status="3">[배송 중]</a>
<a href ="orderstatus.jsp?status="4">[배송 완료]</a>
</div>
<table class="table table-striped table-hover">
        <thead>
        <tr class="table-dark">
            <th>주문번호</th>
            <th>제품번호</th>
            <th>구매자</th>
            <th>제품명</th>
            <th>가격</th>
            <th>구매일</th>
            <th>평점</th>
            <th>후기</th>
            <th>상태</th>
        </tr>
        </thead>
        <tbody>

      <%
         ArrayList<OrderDTO> orders = (new OrderDAO()).getList();
         
         for (OrderDTO order : orders) {
      %>

        <tr>
<td><%=order.getOid() %></td>
<td><%=order.getOpid() %></td>
<td><%=order.getOuid() %></td>
<td><%=order.getOpname() %></td>
<td><%=order.getOprice() %></td>
<td><%=order.getOdate() %></td>
<td><%=order.getOgrade() %></td>
<td><%=order.getOcomm() %></td>
<td><a href = "orderdelivery.jsp?bid=<%=order.getOid()%>">[발송]</td>
        </tr>


<% } %>


        </tbody>
    </table>
    
    <a href="/board/boardwrite.jsp">글쓰기</a>
    
</div>




      



      </div>
      <hr>
   </div>









   <%@ include file="/_footer.jsp"%>


   <!-- JavaScript Bundle with Popper -->
   <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
      crossorigin="anonymous"></script>
</body>
</html>