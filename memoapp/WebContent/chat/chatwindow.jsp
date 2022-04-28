<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채팅</title>
<script>
var webSocket = new WebSocket(
		"<%= application.getInitParameter("CHAT_ADDR")%>/ChatingServer");
		// web.xml에 선언해 둔 웹 소켓 접속 url 뒤에 요청명을 덧붙여서 웹 소켓 객체를 생성함
var chatWindow, chatMessage, chatId;
// 대화창 메세지 대화명 선언
		
//채팅창이 열릴 때 자동으로 실행되는 함수
widow.onload = function(){
	chatWindow = document.getElementById("chatWindow");
	chatMessage = document.getElementById("chatMessage");
	chatId = docuament.getElementById('chatId'.value);
}

// 메세지 전송
function sendMessage(){
	chatWindow.innerHTML += "<div class = 'myMsg'>" + chatMessage.value + "</div>";
	webSocket.send(chatId + ' | ' + chatMessage.value); // 서버로 전송
	chatMessage.value = ""; // 보냈으니까 메세지 입력창 내용 지우기
	chatWindow.scrollTop = chatWindow.scrollHeight; // 대화창 스크롤
// 클라이언트의 메세지를 전송하는 메서드
// 메세지를 먼저 대화창에 표시하고 서버로 전송해줌
// 작성자 | 메시지 형태로 조립하여 서버로 전송해줌
// 전송 후 입력 상자는 비우고 화면을 아래로 내려줌
}

// 서버와 연결 종료
function disconnect(){
	webSocket.close();
}

// 엔터키 입력 처리
function enterKey(){
	if(window.event.keyCode == 13){ // 13은 enter 코드 값
		sendMessage();
	}
}
// 메세지 작성 후 엔터키를 누르면 sendMessage() 매서드를 호출함
// 전송버튼을 누르지 않아도 엔터키로 메세지를 전송해주는 기능

webSocket.onopen = function(event){
	chatWindow.innerHTML += "웹소켓 서버에 연결되었습니다. <br/>";
};

webSocket.onclose = function(event){
	chatWindow.innerHTML += "웹소켓 서버가 종료되었습니다. <br/>";
};

webSocket.onerror = function(event){
	alert(event.data);
	chatWindow.innerHTML += "채팅 중 에러가 발생하였습니다. <br/>";
};

// 메세지를 받았을 때 실행
webSocket.onmessage = function(event){
	var message = event.data.split("|"); // 대화명과 메세지 분리
	var sender = message[0];
	var content = message[1];
	if(content != ""){
		if (content.match("/")){ // 귓속말인지 여부
			if (content.match(("/" + chatId))){
				var temp = content.replace(("/" + chatId), "[귓속말] : ");
				chatWindow.innerHTML += "<div>" + sender + "" + temp + "</div>";
			}
		}
		else { // 일반 대화
			chatWindow.innerHTML += "<div>" + sender + " : " + content + "</div>";
		}
	}
	
	chatWindow.scrollTop = chatWindow.scrollHeight;
	
};

</script>
</head>
<body>
대화명 : <input type="text" id="chatId" value = "${param.chatId}" readonly />
<button id = "closeBtn" onclick = "disconnect();">채팅 종료</button>
<div id = "chatWindow"></</div>
<input type = "text" id = "chatMessage" onkeyup = "enterKey();" />
<button id = " sendBtn" onclick = "sendMessage();">전송</button>

</body>
</html>