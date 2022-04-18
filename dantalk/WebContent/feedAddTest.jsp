<%@page import="jdbc.FeedDAO"%>
<%@ page import = "java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jdbc.*"%>  
<%@ page import = "java.util.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@page import="util.FileUtil"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//추출할 전역 변수값 초기화
String uid = null;
String ucon = null;
String ufname = null;
byte[] ufile = null;

request.setCharacterEncoding("utf-8");

ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());
List items = sfu.parseRequest(request);
Iterator iter = items.iterator();

while(iter.hasNext()){
	FileItem item = (FileItem) iter.next();
	String name = item.getFieldName();
	if(item.isFormField()){
		// 텍스트를 추출
		String value = item.getString("utf-8");
		if(name.equals("uid")) uid = value;
		else if (name.equals("ucon")) ucon = value;
	} else {
		// 사진을 추출
		if (name.equals("uimage")) {
			ufname = item.getName();
			ufile = item.get();
			// 서버에 사진 저장
			String root = application.getRealPath(java.io.File.separator);
			FileUtil.saveImage(root, ufname, ufile);
		}
	}
}

// 디비에 게시물 모든 정보 전달
FeedDAO dao = new FeedDAO();
if (dao.insert(uid, ucon, ufname)) {
	response.sendRedirect("main.jsp");
}

%>
<%=uid %><br>
<%=ucon %><br>
<%=ufname %><br>
<%=ufile %><br>
</body>
</html>