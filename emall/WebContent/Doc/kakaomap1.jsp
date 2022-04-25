<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="map" style="width:500px;height:400px;"></div>

<%
String lat = request.getParameter("lat");
String lng = request.getParameter("lng");
%>


<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=eb87d531ac2ccb7011e1e6d0d8a328e3"></script>
<script>
var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
var options = { //지도를 생성할 때 필요한 기본 옵션
   center: new kakao.maps.LatLng(<%=lat %>,<%=lng %> ), //지도의 중심좌표.
   level: 3 //지도의 레벨(확대, 축소 정도)
};

var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴

</script>
</body>
</html>