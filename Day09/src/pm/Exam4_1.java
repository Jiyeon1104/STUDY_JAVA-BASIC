package pm;

public class Exam4_1 {

	public static void main(String[] args) {
		// final 매서드와 final class
		/* 
		 * final 변수는 변수가 저장된 값이 최종값의 의미를 가진 것처럼 final 매서드와 final 클래스도 
		 * 각각 최종 매서드, 최종 클래스의 의미를 가짐
		 * 
		 * 최종 매서드의 의미
		 * 기본적으로 상속할 때 부모의 매서드를 오버라이딩하면 자식 클래스에서는 매서드의 기능이 변경됨
		 * 그러나 final 매서드는 매서드의 기능을 변경할 수 없는 매서드임
		 * 즉, 매서드를 fianl로 선언하면 자식 클래스에서 해당 매서드를 오버라이딩 할 수 없다는 것을 의미
		 * 
		 * class A {
		 * 	void abc(){}
		 * }
		 * 
		 * 	final void bcd(){}
		 * }
		 * 
		 * class B extends A {
		 * @ override
		 * 	void abc(){ // 부모의 abc() 매서드를 오버라이딩
		 * 	}
		 * 
		 * 	void bcd(){ // 에러 발생, 불가능. 오버라이딩할 부모의 매서드에 final이 걸려있음
		 * 	}
		 * }
		 * 
		 * final class
		 * final로 선언된 클래스는 상속이 불가능함
		 * 
		 * final class AAA{
		 * 
		 * }
		 * 
		 * class BBB extends AAA{ // 불가능
		 * 
		 * }
		 * 
		 * final 변수는 값을 변경할 수 없고
		 * final 매서드는 오버라이딩을 할 수 없고
		 * final 클래스는 상속을 할 수 없음
		 */
	}

}

class A{
	void abc() {
		
	}
	
	final void bcd() {
		
	}
}

class B extends A {
	@Override
	void abc() {
		
	}
	
	//void bcd() { // final 매서드로 지정되었기 때문에 자식 클래스인 B에서 매서드 오버라이딩이 불가능해짐
		
	//}
}

final class C{
	void abc() {
	}
	}

// class D extends C{ // final로 선언된 클래스는 상속 자체가 불가
	
// }
