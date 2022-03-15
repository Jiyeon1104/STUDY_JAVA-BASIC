package pm;

public class Exam5 {

	public static void main(String[] args) {
		// 추상화 (abstract)
		/*
		 * abstract 추상 - 구체적이지 않음
		 * abstract method - 중괄호가 없는 매서드, 매서드의 기능이 정의되지 않고 ; 로 끝남
		 * abstract 리턴 타입 매서드명();
		 * 
		 * abstract class
		 * 
		 * class Animal{
		 * 	void cry(){
		 * 	} // 기능을 구현하지는 않음 > 추상매서드로 정의하는 것이 효율적임
		 * 						    추상매서드를 포함하는 클래스는 반드시 추상 클래스로 정의해야 함
		 * 						    추상 클래스도 클래스이므로 상속도 가능함 > 클래스니까!
		 * 						    그러나 추상 클래스로 객체를 생성할 수는 없음
		 * }
		 * 
		 * class Cat extends Animal{
		 *  @Override
		 * 	void cRy(){
		 * 	System.out.println("야옹");
		 * 	}
		 * }
		 * 
		 * class Dog extends Animal{
		 *  @Override
		 *  void cry(){
		 *  System.out.println("멍멍");
		 *  }
		 * }
		 * 
		 * Animal animal1 = new Cat();
		 * animal1.cry(); // 야옹
		 * Animal animal2 = new Dog();
		 * animal2.cry(); // 멍멍
		 * 
		 * 다형적 표현을 사용할 때도 cry 매서드를 호출함
		 * 
		 * 추상 매서드의 장점
		 * - 일반클래스로 정의했을 때와 추상 클래스로 정의했을 때 자식 클래스에서 cry()매서드를 오버라이드 하는 과정에서
		 *   만약에 매서드 명에 오타가 발생했다고 가정 시 이 때, 일반 클래스를 상속한 자식 클래스에서는 오버라이딩이 아닌
		 *   추가로 새로운 매서드를 정의했다고 판단, 따라서 cry() cRy()매서드 두 개의 매서드가 존재하게 됨
		 *   이러한 경우 객체를 생성하고 cry() 매서드를 호출해도 아무것도 출력되지 않음 > 부모의 cry()가 아무것도 정의 X
		 * - 추상 클래스를 생각해보면
		 *   자식 클래스가 오버라이딩 하려고 하는 과정에서 오타가 발생하면 문법 오류가 발생함
		 *   이유는 추상 클래스를 상속하면 추상 매서드도 상속 받고 즉, 추상 클래스를 상속받는 cat클래스 내부에서는 
		 *   추상 매서드가 한 개라도 있으면 해당 클래스는 추상 클래스를 일반 매서드로 오버라이딩 하거나
		 *   자신을 추상 클래스로 정의해야 함, 그런데 cat 클래스는 오버라이딩도 하지 않고 자신을 추상 클래스로 정의하지도 않음
		 *   > 오류가 발생하게 됨
		 *   
		 * 추상 클래스를 상속받으면 추상 클래스에 정의해놓은 추상 매서드들을
		 * 구체화한 클래스를 만들어야만 함, 매서드 오버라이딩을 강제하는 방식으로 생각하면 됨
		 * 
		 * 겨우 오타찾는 정도의 장점이라고 가볍게 볼 수도 있겠지만 여러 사람들이나 여러 회사들이
		 * 협업을 하게 되는 경우 많은 필요성을 느끼게 됨
		 * 
		 * 정리
		 * 만약 abc()라는 추상 매서드를 포함하고 있는 추상 클래스가 있을 때
		 * '이것을 상속한 모든 자식 클래스들 내부에는 항상 반드시 abc() 매서드가 정의되어 있어야만 한다.'
		 * 라는 사실을 보장하게 되는 것
		 * 
		 * tv를 만드는 회사 
		 * tv의 공통된 기능 : 켠다() 끈다() 볼륨up() 볼륨 down() // 이들을 추상클래스로 만들게 되면
		 * 스마트() 벽걸이() 콤포()						  // 해당 4가지의 요소는 강제로 반드시 구현하게 됨
		 */

		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}

}

abstract class Animal{ // 추상클래스 선언
	abstract void cry(); // 내용을 구현하지 않는 추상매서드 선언
}

class Cat extends Animal{
	// 만약 cry() 매서드를 오버라이딩 하지 않고 다형성을 구현하기 위해 다른 일반매서드만 작성하게 되면 에러
	void cry() {	// 추상 클래스를 상속 받으면 그 추상 클래스 안의 추상 매서드를 반드시 오버라이딩 해야 함
		System.out.println("야옹");
	}
	// void cRy(){ 
	// System.out.println("야옹");
	// }
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}
