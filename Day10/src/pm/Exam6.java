package pm;

public class Exam6 {

	public static void main(String[] args) {
		// exception 예외
		/* 개발자가 프로그램을 작성하는 과정에서의 실수 혹은 사용자가 잘못된 값을 입력하는 경우에서도 예외(즉, 오류)가 발생함
		 * 다양하게 발생하는 오류 중 개발자가 해결할 수 있는 오류를 '예외'라고 함
		 * 이러한 예외가 발생했을 때 이를 적절하게 처리하는 것을 '예외 처리'라고 함
		 * 
		 * ? 예외와 에러의 차이
		 * 예외는 '연산오류, 숫자 포맷오류' 등과 같이 상황에 따라 개발자가 해결할 수 있는 오류
		 * 여기서 '해결할 수 있는'의 의미는 오류 자체를 수정할 수 있다는 것이 아니라
		 * 오류가 발생했을 때 차선책으로 선택을 하는 것을 말함
		 * 반면 에러는 자바에서 발생하는 오류로 개발자가 해결할 수 없는 오류를 말함
		 * 
		 * 자바에서는 예외도 객체로 처리됨
		 * 자바에서 예외의 최상위 클래스는 Exception 클래스임
		 * 에러의 최상위 클래스는 Error 클래스
		 * 
		 * 이 2개의 클래스는 모두 Throwable이라는 클래스를 상속받고 있음
		 * 따라서 이 2개의 클래스 모두 Throwable 클래스의 모든 기능을 포함함
		 * 
		 * Throwable 클래스를 상속받는 Exception클래스는 다시 또 
		 * 일반 예외 (checked exception)클래스와 실행 예외(unchecked exception)클래스로 나뉨
		 * 
		 * 일반 예외는 컴파일 전에 체크되며 실행 예외는 실행 중에 체크함
		 * 
		 * Exception클래스에게서 직접 상속받은 예외 클래스들이 처리하는 일반 예외는
		 * 컴파일 전에 예외 발생 문법을 검사함
		 * 반면 실행 예외는 컴파일 전이 아니라 실행할 때 발생하는 예외로 예외 처리를 하지 않더라도 실행은 됨
		 * 따라서 프로그램 실행 중에 프로그램이 강제 종료되는 이유는 대부분 실행 예외때문임
		 * 
		 * - 일반 예외  : 일반 예외는 예외 처리를 하지 않으면 컴파일 자체가 불가능해짐
		 *   > InterruptedException - Thread.sleep (시간) 메서드는 일정 시간동안 
		 *   해당 스레드를 일시 정지 상태로 만드는 Thread 클래스의 매서드임
		 *   이 매서드는 일반 예외가 발생할 수 있고 그래서 반드시 예외 처리를 해야 함
		 *   예외처리를 생랴갛면 문법 오류가 발생하여 컴파일 자체가 불가능해짐
		 *   > classNotFoundException
		 *   > IOException
		 *   > FileNotFoundException
		 *   > CloneNotSupportedException
		 */
		
		// > InterruptedException
		// Thread.sleep(1000);
		
		// > ClassNotFoundException
		// Class cls = Class.forName("java.lang.Object");
		
		/* - 실행 예외 : 일반 예외는 예외처리를 하지 않으면 오류가 발생하여 실행 자체가 불가능함
		 * 실행 예외는 오류가 발생하지 않고 일단 실행은 가능함
		 * 그렇기 때문에 예외 처리 없이 컴파일과 실행은 가능하지만 실행 중에 실행 예외가 발생하면 프로그램 강제 종료
		 * 
		 * > ArithmeticException
		 * Arithmetic의 사전적인 의미는 '산술'또는 '연산'임
		 * 연산 자체가 불가능할 때 발생되는 실행 예외임
		 * 분모가 0일 때 즉 0으로 나눌 때 에러가 발생함
		 * > ClassCastException
		 * 상속 관계에 있는 클래스 간의 업캐스팅은 항상 가능하지만 다운캐스팅은 '가능할수도', '불가능할수도' 있음
		 * ClassCastException은 다운캐스팅이 불가능한 상황에서 다운캐스팅을 시도할 때 발생하는 에러
		 * > ArrayIndexOutOfBoundsException
		 * 배열의 인덱스를 잘못 사용할 때 발생
		 * 
		 * 자바에서는 예외처리 구문이 있으면 적절히 예외가 처리됐다고 판단을 하기 때문에 프로그램을 강제 종료하지 않음
		 * 심지어는 예외처리 구문 내에 아무런 코드를 작성하지 않아도 예외처리된 것으로 간주하기도 함
		 */
		
		//System.out.println(3/0);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero at pm.Exam6.main(Exam6.java:60)
		
		// A a = new A();  Exception in thread "main" java.lang.ClassCastException: pm.A cannot be cast to pm.B
		// B b = (B) a;	   at pm.Exam6.main(Exam6.java:68)
	}

}

// class A{}
// class B extends A{}