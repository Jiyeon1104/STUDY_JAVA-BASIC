<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<%@ include file = "menu.jsp" %>

<div class = "container bh-warning shadow mx-auto mt-5 p -5 w-75">
<!--container : 화면 전체를 차지하지 않는 고정된 크기를 지정하는 컨테이너로 브라우저의 크기 변동에 반응하게 됨
bg-warning : 배경색을 지정함	shadow 그림자 조건
mx-auto : 자동으로 크기를 적절하게 배치
mt-5 : 박스가 브라우저 상단에 붙지 않도록 최대 마진을 설정 0-5
p-5 : 박스 안 쪽 여백을 설정
w-75: 박스의 크기를 브라우저 크기의 75%로 유지
-->
   <table align=center>
      <tr height=40>
         <td><b>방명록 리스트</b></td>
         <td align=right><a href='feed.jsp'><button>글쓰기</button></a>
         </td>
      </tr>

      <%
         request.setCharacterEncoding("UTF-8"); // 한글 구동용
      //JDBC 드라이버 로딩
      Class.forName("com.mysql.jdbc.Driver");
      //wep-inf -> li-> 에 존재하는 sql을 연결하기 위해서 문구를 적으면 된다.

      //DB 연결
      String url = "jdbc:mysql://127.0.0.1:3306/visit?useUnicode=true&serverTimezone=Asia/Seoul";
      String id = "root";
      String pw = "1104jy";

      Connection conn = null; //DB 연결객체를 conn 으로 생성
      PreparedStatement pstmt = null; //DB에 전달할 SQL 구문 객체 pstmt 으로 생성
      ResultSet rset = null; //DB에서 꺼내올 객체(데이터를 담을)

      conn = DriverManager.getConnection(url, id, pw);

      //입력된 컬럼값 출력 SQL

      String sql = "SELECT * FROM feed ORDER BY ts DESC"; //데이터 가지고 오기
      pstmt = conn.prepareStatement(sql); // 명령을 요청후 pstmt에 들어온다.

      rset = pstmt.executeQuery(); // Query로 rest에 가지고오는 데이터를 입력한다.
      %>


      <%
         while (rset.next()) { // rset의 데이터가 없어질때 까지 진행된다. foreach와 비슷한 용도이다.

         String name = rset.getString("name");
         String content = rset.getString("content");
         String ts = rset.getString("ts");
      %>

      <tr>
         <td colspan=2><hr></td>
      </tr>
      <tr>
         <td><small><%=name%></small></td>
         <td><small><%=ts%></small></td>
      <tr>
         <td colspan=2><%=content%></td>
      </tr>


      <%
         }
      %>



   </table>
   </div>
   <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>