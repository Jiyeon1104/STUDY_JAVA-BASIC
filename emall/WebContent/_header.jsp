<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>/* 눈누에서 가져온 폰트 */
@font-face {
    font-family: 'HSYuji-Regular';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2108@1.1/HSYuji-Regular.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
body {
   font-family: 'HSYuji-Regular';
   padding-bottom: 70px;
   background-color: #ffe4e1;
}

.container-fluid{
	background-color: #ffe4e1;
}

</style>


<nav class="navbar navbar-expand-lg navbar-pink" aria-label = "Ninth navbar example">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><b>e-MALL</b></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/product/productlist.jsp">상품목록</a>
        </li>
<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            회원
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="/user/login.jsp">로그인</a></li>
            <li><a class="dropdown-item" href="/user/logout.jsp">로그아웃</a></li>
            <li><a class="dropdown-item" href="#">주문목록</a></li>
            <li><a class="dropdown-item" href="/user/useradd.jsp">회원가입</a></li>
            <li><a class="dropdown-item" href="#">회원탈퇴</a></li>
          </ul>
        </li>

<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            관리
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">회원관리</a></li>
            <li><a class="dropdown-item" href="#">제품관리</a></li>
            <li><a class="dropdown-item" href="#">판매관리</a></li>
            <li><a class="dropdown-item" href="#">게시판관리</a></li>
          </ul>
        </li>
        
<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            게시판
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">공지사항</a></li>
            <li><a class="dropdown-item" href="#">질문답변</a></li>
            <li><a class="dropdown-item" href="/board/board_list.jsp">자유게시판</a></li>
          </ul>
        </li>
   
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>