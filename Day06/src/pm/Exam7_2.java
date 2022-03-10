package pm;

public class Exam7_2 {

	public static void main(String[] args) {
		// this 키워드 (파이썬 self)
		// 모든 메서드는 자신이 포함된 클래스의 객체를 가리키는 this가 있음
		// this는 생략이 가능하고 묵시적으로 사용됨
		// this. 를 생략해도 항상 자바가 자동으로 추가해주므로 전혀 신경쓰지 않아도 되지 않을까?
		// 하지만 this. 을 명시적으로 꼭 직접 붙여줘야 할 때도 있음
		
		Z z = new Z();
		z.work();
		System.out.println(z.m);
		System.out.println(z.n);
	}
}

	class Z {
		Z(){
			
		}
		int m;
		int n;
		void init(int a, int b) {
			int c;
			c = 3;
			this.m = a; // this 키워드를 생략하면 자동으로 추가됨
			this.n = b; // this 키워드를 생략하면 자동으로 추가됨
		}
		
		void work() {
			this.init(2, 3); // this 키워드를 생략하면 자동으로 추가됨
		}
}
