package pm;

public class Exam4 {

	public static void main(String[] args) {
		// final ... 필드, 메서드, 클래스 앞에 위치
		// 위치에 따라 의미가 각각 다름
		
		/* 1. final 변수
		 * 변수를 선언할 때만 지정할 수 있고 한 번 대입된 값을 수정할 수 없음
		 * 처음 대입한 값이 최종 값이 됨 > 변수를 상수로 사용할 때 사용
		 * final은 일단 한 번 값이 입력되고 나면 절대로 값을 수정할 수 없음
		 * 생성자라도 더 이상은 변경이 불가능함
		 * 
		 * class A1 { // 선언과 동시에 값을 대입
		 * 		int a = 3;
		 * 		final int b = 5;
		 * 		A1(){}
		 * 		}
		 * 
		 * class A2 { // 선언과 값 대입을 분리
		 * 		int a;
		 * 		final int b;
		 * 		A2(){
		 * 		a = 3;
		 * 		b = 5; // 대입을 하면서 final이기 때문에 더 이상은 수정 불가
	  	 *		}
	  	 *
	  	 * class A3 {
	  	 * 		int a = 3;
	  	 * 		final int b = 5; // 일단 한 번 값을 대입하면 더 이상 변경이 불가능
	  	 * 		A3(){
	  	 * 		a = 7;	// a는 그냥 일반 변수이기 때문에 값을 변환하여 사용 가능
	  	 * 		b = 9;  // 불가능, final 변수로 이미 선언하고 값을 대입했기 때문에 한 번 값을 대입하면 바꿀 수 없음
	  	 * 
	  	 * class B {
	  	 * void bcd(){
	  	 * int a = 3;
	  	 * final int b = 5;
	  	 * a = 7;
	  	 * b = 9; // 불가능
	  	 * 	}
	  	 * }
	  	 * 
	  	 * final double c = 3.14; 
	  	 * 어떤 필요에 따라서 복사본을 하나 만들어 원본이 삭제된 후에도 그 값을 활용할 수 있도록 하는 것 
		 */
		
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		
		a1.a = 7;
		// a1.b = 3; b가 final 변수로 선언되었기 때문에 값 변경 불가
		a2.a = 7;
		// a2.b = 3; 
		// a2.b = 5; 똑같은 값이라도 재할당 불가

	}

}

class A1 { // 선언과 동시에 값을 대입
 		int a = 3;
 		final int b = 5;
 		A1(){}
}
 
class A2 { // 선언과 값 대입을 분리
 		int a;
 		final int b;
 		A2(){
 		a = 3;
 		b = 5; // 대입을 하면서 final이기 때문에 더 이상은 수정 불가
			}
}
	 
class A3 {
	int a = 3;
	final int b = 5; // 일단 한 번 값을 대입하면 더 이상 변경이 불가능
	A3(){
		a = 7;	// a는 그냥 일반 변수이기 때문에 값을 변환하여 사용 가능
	  	// b = 9;  // 불가능, final 변수로 이미 선언하고 값을 대입했기 때문에 한 번 값을 대입하면 바꿀 수 없음
	}
}
