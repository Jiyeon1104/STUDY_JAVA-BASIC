package pm;

public class Exam5_1 {

	public static void main(String[] args) {
		// 메서드 오버라이딩 (Method overriding)
		// 메서드 덮어쓰기
		// 부모 클래스에게 상속받은 매서드와 동일한 이름의 매서드를 재정의하는 것
		// 1. 부모 클래스의 매서드와 타입과 갯수가 완전히 동일해야 함
		// 2. 부모 클래스의 매서드보다 접근 지정자의 범위가 같거나 넓어야 함
		
		/*
		 * class A {
		 * void print(){
		 * System.out.println("A클래스");
		 * }
		 * }
		 * 
		 * class B extends A{
		 * void print(){
		 * Sytem.out.println("B클래스");
		 * }
		 * }
		 * 
		 * 오버라이딩을 덮어쓰기라고 표현은 했으나 실질적으로 차이가 존재함
		 * 덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념
		 * 오버라이딩은 이전 print() 매서드 위에 새로운 매서드가 올라타는 개념임
		 * 사실은 부모의 print() 매서드를 강제로 호출할 수도 있음
		 * 
		 * 매서드 오버라이딩을 사용하는 이유
		 * class Animal{
		 * void cry() {
		 * }
		 * }
		 * 
		 * class Bird extends Animal{
		 * void cry(){System.out.println("짹짹")}
		 * }
		 * 
		 * class Cat extends Animal{
		 * void cry(){System.out.pritnln("야옹")}
		 * }
		 * 
		 * class Dog extends Animal{
		 * void cry(){System.out.prinltn("멍멍")}
		 * }
		 * 
		 * Bird bird = new Bird();
		 * Cat cat = new cat();
		 * Dog dog = new dog();
		 * 
		 * Animal bird = new bird();
		 * Animal cat = new cat();
		 * Animal dog = new dog();
		 * 
		 * bird.cry(); // 짹잭
		 * cat.cry(); // 야옹
		 * dog.cry(); // 멍멍
		 * 
		 * 모든 객체를 부모 타입 한 가지로 선언하면 배열로 한 번에 관리할 수 있다는 장점이 있음
		 * 
		 * Animal[] animals = new Animal[] {bird, cat, dog};
		 */
		
		Q q = new Q(); // A 자료형 - A 생성자
		q.print();
		W w = new W(); // W 자료형 - W 생성자
		w.print();
		
		Q qw = new W(); // Q 자료형 - W 생성자
		qw.print();
	}

}

class Q {
	void print() {
		System.out.println("Q 클래스");
	}
}

class W extends Q{
	void print() {
		System.out.println("W 클래스");
	}
}