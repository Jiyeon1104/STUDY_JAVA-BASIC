package pm;

public class Exam4_1 {

	public static void main(String[] args) {
		B b = new B();
		b.printFieldValue();
	}

}

class B {
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() { // void는 이 메서드의 출력값이 없을 때 사용
		System.out.println(m1); // 필드는 초기화하지 않아도 강제 초기화 됨
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void fieldLocalValue() {
		boolean n1;
		int n2;
		double n3;
		String n4;
		
//		System.out.println(n1); 지역변수를 초기화 하지 않으면 오류가 발생 (자동 초기화 불가)
//		System.out.println(n2); 
//		System.out.println(n3); 
//		System.out.println(n4); 
		// 자바 문법은 서로 얽히고 섥혀 있어서 하나를 설명하다 보면 아직 배우지 않은
		// 뭔가를 먼저 얘기해야할 때가 있다. 지금은 잘 이해가 가지 않더라도
		// 다른 부분을 공부하는 과정에서 쉽게 이해하는 일이 많다. 
	}
}