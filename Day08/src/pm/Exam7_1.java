package pm;

public class Exam7_1 {

	public static void main(String[] args) {
		
		/*
		 * 부모 클래스에도 init() 매서드가 있고
		 * 그 매서드에 500줄의  코드가 있음
		 * 그런데 자식 클래스는 그 부모 클래스의 기능에다가 어떤 한 줄만 추가하고 싶음
		 * 그럴 때 super가 없다면 자식 클래스에는 부모 클래스의 매서드에 있는 500줄과
		 * 그리고 한 줄을 모두 작성해야 함
		 * 이 때, super를 사용하면 자식 클래스의 매서드에서 
		 * 부모 클래스의 매서드를 호출하고 추가 코드 한 줄만 작성하면 됨
		 */
	}
}

class U {
	void init() {
		// 어쩌고 저쩌고 500줄
	}
}

class O extends U {
	void init(){
		// 어쩌고 저쩌고 500줄
		// 화면 출력 매서드
	}
}

class K extends U {
	void init() {
		super.init(); // 부모의 init을 호출
		// 롸면 출력 매서드
	}
}