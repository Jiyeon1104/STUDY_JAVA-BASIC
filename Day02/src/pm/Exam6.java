package pm;

public class Exam6 {
	public static void main(String[] args) {
		// import 방법
		// Ctrl + Shift + o > 여러 개를 모두 import 하는 방법
		// Ctrl + Space > 해당  라이브러리만 import 하는 방법
		
		// 반복(for)문
		// 실행 구문을 반복적으로 수행하는 반복 제어문으로 일반적으로 반복 횟수가 정확할 때 사용함 
		// 즉, for문의 구문을 보면 몇 번 반복할지 유추할 수 있어야 함
		
		/*for (start; stop; step) {
			for문의 기본적인 형태
		}*/
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		int j;
//		for (j = 0; j <= 10; j++) {
//			System.out.println(j);
//		}
		
//		for (int i = 0, j = 0; i <= 10; i++, j++) {
//			System.out.println(i + j + "");
//		}
		// for 문에서의 무한 루프
//		for (int i = 0; ; i++);
//		for (;;){
//			System.out.println("무한루프");
		
		//이중 for문
		for(int i = 1; i <= 3; i ++) {
			for (int j = 1; j<=5; j++) {
				System.out.println(i + "일차" + j + "교시");
			}
		}
		
		// for - each문
		// array 배열
		
		//String name = "홍길동"; > 변수 1개에 데이터 한 개 저장 
		String[] names = {"홍길동", "이몽룡", "성춘향"};
		int[] numbers = {1,2,3,4,5};
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
