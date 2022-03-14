package pm;

public class Exam4_1 {
	public static void main(String[] args) {
		// 객체의 다형적 표현
		
		
		Human h = new Human(); // 다른 점이 무엇인가? 
							   // 해당 코드는 객체를 만드는 것이고 아래 Student는 붕어빵 기계를 만드는 것
		h.name = "홍길동";
		h.age = 13;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "김지연";
		s.age = 24;
		s.studentID = 001;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "유태경";
		w.age = 23;
		w.workerID = 002;
		w.goToWork();
	}
}

//class Human{
//	String name;
//	int age;
//	
//	void eat() {
//		
//	}
//	
//	void sleep() {
//		
//	}
//}
//
//class Student extends Human{ // Human 클래스를 상속
//	int studentID;
//	void goToSchool() {
//		
//	}
//}
//
//class Worker extends Human{ // Human 클래스를 상속
//	int workerID;
//	void goToWork() {
//		
//	}
//}