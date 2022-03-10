package pm;

public class Exam6 {

	public static void main(String[] args) {
		// 가변 길이 메서드
		// 메서드 오버로딩은 입력 변수의 개수 혹은 자료형에 다라서 구분됨
		// 만약 입력 변수로 1 - 100 개 사이의 불특정 개수로 입력이 들어오게 되면 
		// 메서드도 100개를 만들어야 함
		// 이것을 간단하게 할 수 있는 방법이 바로 가변 길이 매개변수를 사용하는 매서드임
		
//		sum(1);
//		sum(1,2);
//		sum(1,2,3);
//		sum(1,2,3,4);
		
	method1(1,2);
	method1(1,2,3);
	method1();
	
	method2("안녕", "방가");
	method2("땡큐", "베리", "감사");
	method2();
	}
	
	public static void method1(int ...values) {
		System.out.println("길이 : " + values.length);
		
		for(int num : values) {
			System.out.print(num + " ");
		}
		
		System.out.println();
	}
	
	public static void method2(String ...values) {
		System.out.println("길이 : " + values.length);
		
		for(String each : values) {
			System.out.print(each + " ");
		}
		
		System.out.println();
	}
}
