package pm;

public class Exam5_1 {

	public static void main(String[] args) {
		// 클래스 내부에서 메서드 호출하기
		// 클래스 내부에 있는 메서드끼리는 객체를 생성하지 않고도 서로 호출할 수 있음
		// 필드 역시 클래스 내부의 모든 매서드 안에서 객체를 생성하지 않고 사용할 수 있음
		// 조건, 메서드 앞에 static이 붙어있을 경우에만 호출할 수 있음
		// static은 객체를 찍지 않고도 접근할 수 있도록 허용해줌
		
		
		print();
		
		int result = twice(5);
		System.out.println(result);
		
		double result1 = sum(4,2.6);
		System.out.println(result1);

	}

	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int k) {
		return k * 2;
	}
	
	public static double sum(int m, double n) {
		return m + n;
	}
}
