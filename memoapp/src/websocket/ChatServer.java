package websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.*;


// @ServerEndpoint 애너테이션으로 웹 소켓 서버를 지정함
// ws : // 호스트 : 포트번호 / ChatingServer
@ServerEndpoint("/ChatingServer")
public class ChatServer {
	// 새로 접속한 클라이언트의 세션을 지정하는 컬렉션을 생성
	// Collections 클래스의 synchronizedSet() 메서드는 안전하게 Set 컬렉션을 생성해줌
	// 여러 클라이언트가 동시에 접속해도 문제가 발생하지 않게 해줌
	private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());

	// 클라이언트가 접속했을 때 실행할 매서드를 정의함
	// 이 매서드에서는 단순하게 clients 컬렉션에 세션을 추가하게 됨
	@OnOpen // 클라이언트 접속 시 실행
	public void onOpen(Session session) {
		clients.add(session); // 세션 추가
		System.out.println("웹 소켓 연결 : " + session.getId());
	}

	// 클라이언트로부터 메세지를 받았을 때 실행되는 매서드를 정의함
	// 클라이언트가 보낸 메시지와 클라이언트의 세션이 매개변수로 넘어옴
	// 모든 클라이언트들에게 전송함
	// 단 메세지 작성자는 제외시킴
	@OnMessage // 메시지를 받으면 실행
	public void onMessage(String message, Session session) throws IOException {
		System.out.println("메세지 전송 : " + session.getId() + ":" + message);
		synchronized (clients) {
			for (Session client : clients) { // 모든 클라이언트들에게 메세지 전달 반복
				if (!client.equals(session)) { // 메세지 작성자는 제외
					client.getBasicRemote().sendText(message);
				}
			}
		}
	}

	// 클라이언트가 접속을 종료했을 때 실행되는 매서드를 정의함
	// clients에서 해당 세션을 삭제함
	@OnClose // 클라이언트와의 연결이 끊기면 실행
	public void onClose(Session session) {
		clients.remove(session);
		System.out.println("웹소켓 종료 : " + session.getId());
	}
	
	// 에러가 발생했을 때 실행될 매서드를 정의함
	@OnError // 에러가 발생할 때 실행
	public void onError(Throwable e) {
		System.out.println("에러 발생");
		e.printStackTrace();
	}
}
