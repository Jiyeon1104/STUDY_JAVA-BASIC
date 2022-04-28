<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page import="smtp.NaverSMTP"%>
<%@page import = "java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

Map<String, String> emailInfo = new HashMap<String, String>();

emailInfo.put("from", request.getParameter("from")); // 보내는 사람
emailInfo.put("to", request.getParameter("to"));	// 받는 사람
emailInfo.put("subject", request.getParameter("subject")); // 제목

// 내용은 html text 형태에 따라 다르게 설정
String content = request.getParameter("content"); // 이메일의 내용
String format = request.getParameter("format"); // 이메일의 형태

if (format.equals("text")) {
	emailInfo.put("content", content);
	emailInfo.put("format", "text/plain;charset = UTF-8");
} else if (format.equals("html")){
	content = content.replace("\r\n", "<br/>");	// 줄바꿈 처리
	String htmlContent = "";
	try{
		String templatePath = application.getRealPath("/email/emailform.html");
		BufferedReader br = new BufferedReader(new FileReader(templatePath));

		String oneLine;
		while((oneLine = br.readLine()) != null){
			htmlContent += oneLine + "\n";
		}
		br.close();
	} catch (Exception e){
		e.printStackTrace();
	}
	
	// 템플릿의 내용 교재
	htmlContent = htmlContent.replace("__CONTENT__", content);
	emailInfo.put("content", htmlContent);
	emailInfo.put("format", "text/html;charset=UTF-8");
}

try {
	NaverSMTP smtServer = new NaverSMTP();
	smtpServer.emailSending(emailInfo);
	out.print("전송 성공");
} catch(Exception e){
	out.print("전송 실패");
}
%>