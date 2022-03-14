package pm;

public class Exam7_2 {
	public static void main(String[] args) {
		X x = new X();
		/* 모든 생성자의 첫 줄에는 반드시 this() 또는 super()가 있어야 함
		 * 없으면 자동으로 자바가 삽입함
		 * 즉 상속 관계에 있을 때 생성자를 호출하면 항상 부모 클래스의 생성자가
		 * 호출된다는 것. 자식 클래스로 객체를 생성할 때는 부모 클래스의
		 * 객체도 만들어짐
		 */
	}
}

class V{
	V(){
		System.out.println("V 생성자");
	}
}

class X extends V{ // 자식 클래스는 생성할 때 부모의 생성자를 자동으로 호출함
	X(){
		//super(); 부모가 있어야 자식을 생성할 수 있기 때문에 생성자는 자동으로 호출됨
		System.out.println("X 생성자");
	}
}