package pm;

public class Exam4 {

	public static void main(String[] args) {
		// 상속 (inherentance) 과 다형성 (polymorphism)
		
		/* 클래스는 객체 지향에서 가장 기본적인 요소로 객체 지향적 관점에서 가장 중요한 부분은 '상속'임
		 * 상속을 이해하는 것이 객체지향적인 프로그램에서 가장 중요함
		 * 상속에 대한 이해를 통해 객체 타입 변환, 매서드 오버라이딩 super키워드, super() 메서드
		 * 등도 쉽게 이해할 수 있음
		 * 
		 * 1. 상속의 개념 
		 * 인간세계의 상속과 매우 유사함.
		 * 부모의 자원을 자식이 마음대로 가져다 쓰는 것
		 * 학생		직장인	공통요소추출	사람				>공통요소 추출 : 추상화
		 * 이름		이름					이름
		 * 나이		나이					나이
		 * 학번	<->	사번					먹기()
		 * 						-------	잠자기()----
		 * 먹기()		먹기()		학생				직장인
		 * 잠자기()	잠자기()		학번				사번
		 * 등교()	<->	출근()		등교하기()			출근하기
		 * 
		 * 2. 상속의 장점
		 * - 코드의 중복성 제거
		 * - 다형적 표현 가능		*학생은 사람이다. * 직장인은 사람이다.
		 * 
		 * 사과[] apple = {사과1, 사과2};
		 * 포도[] grape = {포도1, 포도2};
		 * 키위[] kiwi = {키위1, 키위2, 키위3};
		 * 
		 * 과일 fruit1 = new 사과();
		 * 과일 fruit2 = new 포도();
		 * 과일 fruit3 = new 키위();
		 * 
		 * 사과, 포도, 키위는 모두 과일임
		 * 따라서 '과일'이라는 부모 클래스를 만들어서 각각 상속을 시키면 다형적 표현을 할 수 있음
		 * 
		 * 과일[] fruits = {사과, 포도, 키위};
		 */

	}

}

class Human{
	String name;
	int age;
	
	void eat() {
		
	}
	
	void sleep() {
		
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		
	}
}

class Worker extends Human{
	int workerID;
	void goToWork() {
		
	}
}