package pm;

public class Exam7_4 {

	public static void main(String[] args) {
		// this() 메서드 (this 키워드와는 완전 다른 개념)
		// this() 메서드는 this키워드와 비슷하게 보이지만 의미가 완전히 다름
		// this() 메서드는 자신이 속한 클래스 내부의 다른 생성자를 호출할 때 사용됨
		// 1. 생성자의 내부에서만 사용함
		// 2. 생성자의 첫 줄에 위치함
		// 두 개 조건 중 하나라도 지켜지지 않으면 에러가 발생됨
		
		T t1 = new T();
		System.out.println();
		T t2 = new T(3);
	}

}

class T{
	T(){
		System.out.println("첫 번째 생성자");
	}
	
	T(int a){ //생성자 오버로딩
		this(); // 생성자의 내부에서 첫 번재 생성자를 호출하게 됨
		System.out.println("두 번째 생성자");
	}
	
}
