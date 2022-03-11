package pm;

public class Exam7_1 {
// import am.F; default로 선언한 F클래스는 임포트 할 수 없음
// public으로 선언된 클래스만 다른 패키지에서 임포트 가능함

	public static void main(String[] args) {
		// 클래스의 접근 지정자
		// 클래스는 public과 default 접근지정자만 사용할 수 있음
		// 다시 말해 클래스 키워드 앞에는 public이 붙어있거나 안 붙어있거나 둘 중 하나임
		// default 클래스는 같은 패키지 내에서만 사용할 수 있고 public 클래스는 다른 패키지에서도 사용 가능함
		// 따라서 클래스를 default로 선언하면 같은 패키지 내에서만 사용할 수 있고
		// public 클래스는 다른 패키지에서도 사용할 수 있음.
		// 따라서 클래스를 default로 선언하면 다른 패키지에서는 임포트가 불가능해짐
		

	}

}
