package Q1;

public class A {

	public int a;
	protected int b;
	int c;
	private int d;
	
	void abc() {
		System.out.println(this.a);
	}
}

/* 패키지 q1에는 a,b클래스 q2에는 c,d가 있음
 * 이들 4개의 소스파일에서 클래스 A에 포함된 4개의 필드를 사용하려고 함
 * 이 때, 각 클래스의 위치에서 사용할 수 있는 모든 필드를 쓰시오
 * A - a,b,c,d
 * B - a,b,c
 * C - a
 * D - a,b
 */
