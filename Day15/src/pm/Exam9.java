package pm;

public class Exam9 {

	public static void main(String[] args) {
		/* class A{}
		 * class B extends A {}
		 * A a1 = new A();
		 * A a2 = new B(); // 자식 클래스를 부모 클래스로 부를 때 업 캐스팅이라고 함
		  
		 * class A{}
		 * class B extends A{}
		 * class C extends B{}
		 * class D extends B{}
		  
		 * A a1 = new B();
		 * A a1 = new C(); //ok
		 * A a1 = new D(); //ok
		  
		 * B b1 = new C(); // ok
		 * B b2 = new D(); // ok
		  
		 * B b1 = new A(); // false
		 * C c1 = new B(); // false
		 * C c3 = new A(); // false
		 * C c4 = new D(); // false
		 
		 * D d1 = new A(); // false
		 * D d2 = new B(); // false
		 * D d3 = new C(); // false
		 
		 * class A{}
		 * class B extends A{}
		 * class C extends B{}
		 
		 * B b1 = new B();
		 * A a1 = b1; // (A) b1;
		 
		 * C c2 = new C();
		 * B b2 = c2; // (B) c2;
		 
		 * A a2 = c2; // (A) c2;
		 
		 * A a1 = new A();
		 * B b1 = a1; (X)
		 * A a2 = new B();
		 * B b2 = a2; (O)	// 다운 캐스팅은 경우에 따라 가능하기도 불가능하기도 함
		 * C c2 = (C)a2; (X) 
		 
		 * 무슨 타입으로 선언되어 있는지보다 오히려 어떤 생성자로 생성되었는지가 더 중요함
		 * C()로 만들었다면 A와 B로 모두 캐스팅할 수 있음
		 */
		
		A a1= new A();
		A a2= new B(); // 업캐스팅
		A a3= new C(); // 업캐스팅
		A a4= new D(); // 업캐스팅
		
		B b1= new B();
		A b2= b1; // 업캐스팅은 언제나 가능
		
		A aa = new A();
		// B b = aa; 다운캐스팅 불가
		// C c = aa; 다운캐스팅 불가
		
		B bd = new D();
		D d = (D) bd; // 다운캐스팅 가능
		
		A ad = new D();
		B b3 = (B) ad;
		D d1 = (D) ad;
	}

}

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

