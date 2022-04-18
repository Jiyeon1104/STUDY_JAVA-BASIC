<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="jdbc.*"%>
<%@ page import = "java.util.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@page import="util.FileUtil"%>
<%

request.setCharacterEncoding("utf-8");
// images로 전체 데이터가 넘어옴
String pid = null;
String pname = null;
String pprice = null;
String pdesc = null;
String pmanu = null;
String pcate = null;
String pcondi = null;
String pimage = null;

byte[] pfile = null;

ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());
// 추출 값들을 객체 형태로 저장할 준비
List items = sfu.parseRequest(request);
// 입력된 값들을 추춣하여 객체에 저장
Iterator iter = items.iterator();
// 순차적으로 접근하기 위해 객체 생성

while(iter.hasNext()){ // 요소가 있으면 계속 반복, 없으면 종료
	FileItem item = (FileItem) iter.next(); // 요소를 하나씩 추출
	String name = item.getFieldName(); // 요소의 이름을 추출
	
	if(item.isFormField()){ // 이름과 값으로 즉 맵 형태 쌍으로 구성이 되어 있는지 확인
		// 텍스트를 추출
		String value = item.getString("utf-8");
		if(name.equals("pid")) pid = value;
		else if (name.equals("pname")) pname = value;
		else if (name.equals("pprice")) pprice = value;
		else if (name.equals("pdesc")) pdesc = value;
		else if (name.equals("pmanu")) pmanu = value;
		else if (name.equals("pcate")) pcate = value;
		else if (name.equals("pcondi")) pcondi = value;
	} else {
		// 사진을 추출
		if (name.equals("pimage")) {
			pimage = item.getName();
			pfile = item.get();
			// 서버에 사진 저장
			String root = application.getRealPath(java.io.File.separator);
			FileUtil.saveImage(root, pimage, pfile);
		}
	}
}

// 디비에 게시물 모든 정보 전달
ProductDAO dao = new ProductDAO();
if (dao.insert(pid, pname, pprice, pdesc, pmanu, pcate, pcondi, pimage)) {
	response.sendRedirect("productlist.jsp");
}

%>