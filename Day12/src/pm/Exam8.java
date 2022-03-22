package pm;

public class Exam8 {

		/* Thread 사용 2번째 방법
		 * 1. Runnable 인터페이스를 구현한 클래스 정의
		 * 2. run()을 실제 구현하면서 여기에 스레드의 작업 내용을 작성함
		 * 3. 앞에서 정의한 클래스를 이용해서 Runnable객체를 생성
		 * 문제 ? Runnable 객체의 내부에는 start() 매서드가 존재하지 않기 때문에 start()를 가진 Thread 객체를 생성해야 함
		 * 다만 구현한 run() 매서드 자체는 Runnable 객체가 갖고 있으므로 Thread 객체를 생성할 때 
		 * 생성자의 매개변수로 넘겨줌. 이렇게 객체를 생성하면 생성된 Thread 객체 내부의 run() 매서드는
		 * 생성자 매개변수로 넘어온 Runnable 객체 내부의 run() 으로 대체됨
		 */

	public static void main(String[] args) {
		Runnable smiFileRunnable = new SMIFileRunnable();
		
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		
		int[] intArray = {1,2,3,4,5}; // 비디오 프레임
		
		for (int a : intArray) {
			System.out.print("비디오프레임" + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	}

class SMIFileRunnable implements Runnable{
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "삼", "넷", "오"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (String b : strArray) {
			System.out.println(" - 자막번호" + b);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

