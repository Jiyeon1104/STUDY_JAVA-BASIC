package pm;

public class Exam9 {

	public static void main(String[] args) {
		Runnable audioRunnable = new audioThread();
		
		Thread thread1 = new Thread(audioRunnable);
		thread1.start();
		
		Runnable videoRunnable = new videoThread();
		
		Thread thread2 = new Thread(videoRunnable);
		thread2.start();
	}

}

class videoThread implements Runnable {
	@Override
	public void run() { 	
		int[] intArray = {1,2,3,4,5}; // 비디오 프레임
		
		for (int a : intArray) {
			System.out.print("비디오프레임" + a);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}


class audioThread implements Runnable {
	@Override
	public void run() { // 자막 스레드
		String[] strArray = {"하나", "둘", "삼", "넷", "오"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (String b : strArray) {
			System.out.println(" - 자막번호" + b);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
