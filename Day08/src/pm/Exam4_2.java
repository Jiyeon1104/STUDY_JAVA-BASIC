package pm;

public class Exam4_2 {

	public static void main(String[] args) {
		// 객체의 다형적 표현
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		// B b1 = new A(); // 에러
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
		// C c1 = new A(); // 에러
		// C c2 = new B(); // 에러
		C c3 = new C();
		// C c4 = new D(); // 에러
		
		//D d1 = new A(); // 에러
		//D d2 = new B(); // 에러
		//D d3 = new C(); // 에러 
		D d4 = new D();

	}

}

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

class D extends B{
	
}