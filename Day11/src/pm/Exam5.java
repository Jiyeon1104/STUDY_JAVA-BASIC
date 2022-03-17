package pm;

public class Exam5 {

	public static void main(String[] args) {
		/* 예외 던지기
		 * 예외가 발생했을 때 그 위치에서 바로 예외처리를 할 수도 있지만 호출한 지점으로 예외를 던질 수도 있음 throws
		 * 예외가 발생했을 때 2가지 해결책
		 * try - catch문을 이용하거나 예외를 던지는 것임
		 * 
		 * 예외를 던지는 기본 문법
		 * 리턴 타입 매서드명 (변수) throws 예외 클래스명{
		 * 	//
		 * }
		 * 
		 * void abc(){
		 * 	try{
		 * 		bcd();
		 * 		} catch (예외 클래스 타입)
		 * 		// 예외 처리
		 * 		}
		 * }
		 * 
		 * void bcd(){
		 * 	// 여기서 예외 처리
		 * }
		 * 
		 * void bcd() throws 예외 클래스 타입{
		 * 	// 예외발생을 호출한 지점으로 던지기
		 * }
		 */
		
		A a = new A();
		a.abc();

	}

}

//class A{
//	void abc() {
//		bcd();
//	}
//	
//	void bcd() {
//		try {
//			System.out.println("start");
//			Thread.sleep(1000);
//			System.out.println("stop");
//		} catch(InterruptedException e) {
//			// 예외 처리 구문
//		}
//	}
//}

/* 두 개의 매서드 abc(), bcd() 가 있고 bcd()매서드의 내부에는 예외 발생 가능 코드가 포함되어 있음
* Thread.sleep()은 일반 예외가 발생할 수도 있기 때문에 매서드 사용을 위해서는 반드시 예외처리를 해야만 함
* 하지만 bcd() 매서드가 직접 예외처리를 하는 대신에 자신을 호출한 매서드로 던지게 됨
* 죽 예외처리 의무를 자신을 호출한 매서드로 전가했음
* 따라서 abc() 매서드가 예외를 처리해야만 함
* 
* 반드시 예외 처리 방식을 사용해야만 하는 매서드들이 있음
*/

class A{
	void abc() {
		try{
			bcd();
		} catch(InterruptedException e) {
			
		}
	}
	
	void bcd() throws InterruptedException{
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");
			}
	}

