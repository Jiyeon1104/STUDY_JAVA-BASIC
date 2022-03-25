package pm;

public class Exam6 {

	public static void main(String[] args) {
		/* 접근지정자 (Modifier)
		 * 클래스, 필드, 매서드, 생성자 등에게 특징을 부여하는 문법 요소
		 * 예를 들면 다른 패키지에서도 클래스를 사용할 수 있도록 하기 위해서는 public 클래스로 선언을 함
		 
		 * 멤버와 생성자에는 public > protected > (생략하면) default > private
		 * 4가지 종류의 접근 지정자 modify를 사용할 수 있음
		 * 아무것도 적용하지 않으면 default가 자동으로 적용됨
		 
		 * public 동일 패키지의 모든 클래스  + 다른 패키지의 모든 클래스에서 사용 가능
		 * protected 동일 패키지의 모든 클래스 + 다른 패키지의 자식 클래스에서 사용 가능
		 * default 동일 패키지의 모든 클래스에서만 사용 가능
		 * private 동일 클래스 안에서만 사용 가능 
		 * 클래스 안의 변수는 private, 매서드는 public으로 선언
		 
		 * static 제어자
		 * 클래스 멤버에서 사용하는 제어자로 객체를 생성하지 않고도 '클래스명.멤버명'으로
		 * 직접 접근하여 사용할 수 있음 물론 객체를 생성하고도 사용할 수 있음
		 */
		
//		System.out.println(B.n); // 클래스로 직접 접근
//		
//		B b = new B();
//		System.out.println(b.m); // 객체로 접근
		
//		B b1 = new B();
//		B b2 = new B();
//		
//		b1.m = 5;
//		b2.m = 6;
//		
//		System.out.println(b1.m);
//		System.out.println(b1.n);
//		
//		B.n = 7;
//		System.out.println(b1.n);
//		
//	}
//
//}
//
//class A {
//	private int a = 1;
//	private String b = "연습";
//	
//	public void abc() { 
//		a = 5;
//	}
//}
//
//class B {
//	int m = 3; // 객체를 생성한 후에만 사용 가능
//	static int n = 5; //객체를 생성하지 않아도 사용 가능
//}
	}
}