package am;

public class C {

	public void print() {
		A a = new A();
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		// System.out.println(a.d); // 접근 지정자로 지정된 필드는 접근 불가
		// C.java 를 pm 패키지로 옮기면 default와 protected 접근 제어자로 인해 line 8과 line 9가 에러 남
	}
}
