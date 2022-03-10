package pm;

public class Exam5 {

	public static void main(String[] args) {
		C c = new C();
		c.print();
		int k = c.data();
		System.out.println(k);
		double result = c.sum(3, 5.2);
		System.out.println(result);
		c.printMonth(13);
		c.printMonth(5);
	}

}

class C {
	void print() { 
		// no input no out > return이 없으면 output도 없음
		System.out.println("안녕");
	}
	
	// no input yes output
	int data() { // int는 return의 타입
		return 3;
	}
	
	// yes input yes output
	double sum(int a, double b) { // double은 return의 타입
		return a + b;
	}
	
	void printMonth(int m) {
		if(m <= 0 || m > 12) {
			System.out.println("월을 잘못 입력하셨습니다.");
			return; // 메서드를 빠져나가기 위한 return
		}
		System.out.println(m + "월입니다.");
	}
}