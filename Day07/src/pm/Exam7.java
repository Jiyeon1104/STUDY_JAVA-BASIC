package pm;

import am.A; 

public class Exam7 {
	// 접근 제어자 (지정자) modifier는 클래스, 필드, 메서드, 생성자 등에게
	// 어떤 특징을 부여하는 문법 요소. 일종의 형용사로 생각할 수 있음.
	// 사용 범위를 정의하는 역할을 함
	// public protected default(아무 표시가 없으면) private
	// public(가장 넓음) > protected > default > private(가장 강력함)
	/* 
	 * public	protected	default		private
	 * public : 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래스에서 접근 가능함
	 * protected : 같은 패키지 내의 모든 클래스와 다른  패키지의 자식클래스에서  접근 가능함
	 * default : 같은 패키지 내의 모든 클래스에서 접근 가능함
	 * private : 동일 클래스에서만 사용 가능함
	 */
	
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.a);
//		System.out.println(a.b);	// protected
//		System.out.println(a.c);	// default
//		System.out.println(a.d);	// private
		
		a.print(); 
		
		// 변수값들에는 외부에서 직접적으로 접근을 못하게 해놓고 메서드를 만들어서 메서드를 이용해 끌어다쓰게끔 하는 형태를 종종 취함
	}
}