package pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// static 제어자
		// static은 필드, 메서드, 이너클래스에 사용되는 제어자임
		// 지금까지는 클래스의 멤버를 다른 클래스에서 사용하기 위해서는 먼저 객체를 생성하고 사용해왔음
		// 객체로 사용할 수 있는 상태가 되는 멤버를 인스턴스 멤버 instance member라고 함
		// 다시 말하면 인스턴스 멤버는 멤버 앞에 static이 붙지 않은 것을 말함
		// 반면 static이 붙은 멤버들은 정적 멤버 static member라고 부름
		// 정적 멤버의 가장 큰 특징은 객체 생성 없이 '클래스명. 정적멤버명' 만으로 접근 가능함
		// 정적 멤버도 객체 생성 후에도 객체를 통해서 사용할 수도 있음	
		// 반드시 기억해야 할 static의 특징은 static이 객체들 간의 공유 변수의 성질을 가지고 있다는 점임
		// 정적 필드는 클래스 변수라고도 함
		
		
		Q q1 = new Q();
		
		System.out.println(q1.m);
		System.out.println(q1.n);
		System.out.println();
		
		System.out.println(Q.n);
		// System.out.println(Q.m); static 제어자가 붙지 않은 경우에는 객체를 생성하지 않고서는 호출할 수 없음
		
		Q q2= new Q();
		q1.m = 5;
		q2.m = 6;
		System.out.println(q1.m);
		System.out.println(q2.m);
		
		q1.n = 7;
		q2.n = 8;
		Q.n = 9;
		
		System.out.println(q1.n);
		System.out.println(q2.n);
	}

}

class Q {
	int m = 3;
	static int n = 5; // 정적 필드 
	
}
