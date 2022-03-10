package pm;

public class Exam7 {

	public static void main(String[] args) {
		// 생성자 constructor
		// 객체를 최초 생성할 때 자동으로 호출되어 생성됨 
		// 생성자 규칙
		// 1. 생성자는 반드시 클래스명과 동일한 이름이어야 함
		// 2. 생성자는 리턴이 없음 (리턴 타입도 없고 리턴도 없음)
		
		// 지금까지 생성자를 만들지 않았음.
		// 생성자를 만들지 않았어도 정상적으로 객체가 생성됐는데 그 이유는
		// 개발자가 생성자를 직접 만들지 않으면 자바가 기본 생성자 default constructor
		// 를 자동으로 생성해주기 때문임
		
		H h = new H();
		I i = new I();
		J j = new J(3);
		// 에러 발생 사례 : J j = new J(); 생성자에서 파라미터로 반드시 int a를 받아야 하기 때문에 파라미터를 꼭 넣어주어야 함
		// 생성자가 하나라도 있을 시에는 자바가 기본 생성자를 추가로 생성하는 일은 없음
		
		h.work();
		i.work();
		j.work();
		

	}
}

	class H{
		// H(){
		// 개발자가 직접 생성자를 만들지 않으면 자바가 자동으로 기본 생성자를 만듦
		// } 
		int m;
		void work() {
			System.out.println(m);
		}
	}
	
	class I{
		I(){
			// 아무런 기능이 없는 디폴트 생성자 default constructor 
		}
		
		int m;
		void work() {
			System.out.println(m);
		}
	}
	
	class J{
		// 뭔가를 동작시키기 위하여 직접 생성자를 만들어야 하는 경우
		J (int a) { // 생성자명은 클래스명과 동일해야 함 
			m = a;
		}
		int m;
		void work() {
			System.out.println(m);
		}
	}

