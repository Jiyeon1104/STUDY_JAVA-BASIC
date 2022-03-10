package pm;

public class Exam4 {

	public static void main(String[] args) {
		// 객체의 생성과 활용
		
		/*
		 * 객체 생성
		 * 클래스명 개체명 = new 생성자();
		 * 
		 */
		A a = new A();
		
		a.m = 5;
		
		System.out.println(a.m);
		a.print();
	}

}


class A { // 클래스 A 에는
	int m = 3; 	   // field가 한 개 있음, field값은 3으로 초기화되어 있음
	
	void print() { // print라는 메서드 한 개와 
		System.out.println("객체 생성");
	}
}

/*
 * 필드 (field) : 클래스에 포함된 변수
 * 필드는 지역 변수와는 다른 개념으로 지역변수는 '메서드에 포함된 변수'
 * 즉 필드와 지역 변수는 구분해야 함
 * 클래스의 중괄호 내에 선언된 변수는 '필드'
 * 메서드의 중괄호 내에 선언된 변수는 '지역변수' 라고 생각하면 ok
 * 필드와 지역변수의 또 다른 차이점은 초기값인데, 필드는 직접 초기화하지 않아도
 * 그냥 강제로 초기화되는 반면, 지역 변수는 직접 초기화 하지 않으면 저장 공간이 그대로 있어서
 * 그냥 출력하면 오류가 발생함.
 */