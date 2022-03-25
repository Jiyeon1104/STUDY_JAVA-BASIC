package am;

public class Exam3 {

	public static void main(String[] args) {
		/* Quiz 1
		 * class D 를 만드시오 (매서드 오버로딩)
		 
		 * Quiz 2
		 * int[] 객체를 입력받아서 그 배열의 모든 원소를 합하여 결과를 리턴하여 출력하는 arraySum() 매서드를 만드세요
		 */
		
		D d = new D();
		d.print();
		d.print(3);
		d.print(5.8);
		d.print("안녕");
		
		F f = new F();
		int[] arr = new int[] {1,2,3};
		int[] arr2 = {1,2,3};
		System.out.println(f.arraySum(arr));
		System.out.println(f.arraySum(arr2));
		
		// System.out.println(f.arraySum({1,2,3,4,5}));
		System.out.println(f.arraySum(new int[] {1,2,3}));
	}

}

class D {
	
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	
	void print(int a) {
		System.out.println("정수 입력값 : " + a);
	}
	
	void print(double a) {
		System.out.println("실수 입력값 : " + a);
	}
	
	void print(String a) {
		System.out.println("문자열 입력값 : " + a);
	}
	
}

class F{
	int arraySum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
}