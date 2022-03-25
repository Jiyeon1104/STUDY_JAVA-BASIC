package am;

public class Exam2 {

	public static void main(String[] args) {
		/* - 매서드 (method)
		 * 매서드는 클래스의 기능에 해당하는 요소로 클래스 밖에서는 함수라고 부르고 클래스 안에서는 매서드라고 부름
		 * 매서드는 동작을 정의함. 예를 들면 공부하기, 춤추기, 달리기, 정지하기, 후진하기 등
		 *  
		 * 클래스 외부에서 매서드 호출
		 * B b = new B();
		 * System.out.println(b.m);
		 * b.work1();
		   
		 * 클래스 내부에서 매서드 호출
		 * 클래스의 내부에 있는 매서드끼리는 객체를 생성하지 않고 서로를 호출하여 사용할 수 있음
		 * 단, 매서드 앞에 static이 붙은 매서드는 static이 붙은 필드나 매서드만 호출할 수 있음
		 
		 * 매서드 오버로딩
		 * 매서드의 이름이 동일할 때 입력되는 매개변수의 개수 또는 자료형에 따라 각각 다른 매서드가 실행됨
		 
		 * print(); print(3); print(3,4); print(3, 3.14); > 입력된 매개변수 혹은 자료형에 따라 각각 다른 매서드가 실행됨
		 
		 * 생성자
		 * 객체를 생성
		 * 1. 반드시 클래스명과 동일해야 함
		 * 2. 리턴과 리턴형이 없음
		 * 개발자가 클래스에 생성자를 만들지 않으면 자동으로 컴파일 시에 자바가 기본 생성자를 만들어줌
		 * 따라서 모든 클래스에는 1개 이상의 생성자가 반드시 존재하게 됨
		 * class A{
		 * 		A(){
		 * 		}
		 * }
		 * 
		 * this() 매서드 - 자신이 속한 클래스 내부의 다른 생성자를 호출함
		 * 생성자의 내부에서만 사용되고 생성자의 첫 줄에만 위치해야 함
		 * 
		 */
		
		
		print(); // 객체 안 찍음
		
		int a = twice(3); // 객체 안 찍음
		System.out.println(a); // 객체 안 찍음
		
		C c1 = new C();
		C c2 = new C(3);
	}

	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int a) {
		return a*2;
	}
}

//class A{
//	int m;
//	static void work1(){
//		System.out.println(m);
//	}
//}

class C{
	C(){
		System.out.println("첫 번째 생성자");
	}
	
	C(int a){
		this(); // C() 생성자를 불러옴
		System.out.println("두 번째 생성자");
	}
	
	void abc() { 
		// this(); 매서드에서 생성자를 호출하는 것은 에러, 즉 this() 사용 불가
	}
}