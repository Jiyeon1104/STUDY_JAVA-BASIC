package am;

public class B {
	public void print() {
	// 객체 생성
	A a = new A();
		
	// 사용
	System.out.println(a.a);
	System.out.println(a.b);
	System.out.println(a.c);
	// System.out.println(a.d); // private 접근 지정자로 지정된 필드는 접근 불가능
	}
}
