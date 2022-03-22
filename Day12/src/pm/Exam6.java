package pm;

public class Exam6 extends Thread{ // Thread 클래스를 상속받아서 클래스를 재정의했고 
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "삼", "넷", "오"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (String b : strArray) {
			System.out.println(" - 자막번호" + b);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}

	public static void main(String[] args) {
		/* 1. 스레드 클래스를 상속 받아서 run() 매서드를 오버라이딩
		 * - step1. 클래스 정의 
		 	public class Exam6 extends Thread
		 * - step2. 객체를 생성
		 * - step3. 스레드 실행
		 */
		
		// 객체 생성 및 시작
		Thread smiFileThread = new Exam6();		// 객체를 생성하여 start() 매서드로 실행하였음 
		smiFileThread.start();
		
		int[] intArray = {1,2,3,4,5}; // 비디오 프레임
		
		for (int a : intArray) {
			System.out.print("비디오프레임" + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}

}

/* 이전에 단일 스레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티스레드로 변경하였음
* 출력하고자 하는 작업은 비디오 프레임의 번호와 자막의 동시출력임
* 프로그램이 처음 실행될 때 이미 main 스레드가 실행되고 있으므로 이 2개의 작업을 동시에 실행하기 위해서는
* 적어도 하나 이상의 스레드를 추가로 생성하여 실행해야 함

* Thread 클래스를 상속받아서 클래스를 정의했고
* 객체를 생성하여 start() 매서드로 실행하였음 
* main 스레드와 smiFileThread 스레드를 사용하여 각각 비디오 번호와 자막번호를 출력하였음
* 참고로 멀티 스레드는 독립적으로 실행되기 때문에 먼저 start() 매서드로 호출이 되었다 하더라도
* 나중에 실행된 Thread보다 늦게 실행될 수도 있음
* 이런 이유로 자막 번호가 항상 비디오번호 뒤에 나오도록 스레드에 Thread.sleep(10)을 추가해서
* 0.01초 늦게 출력되도록 했음 
*/