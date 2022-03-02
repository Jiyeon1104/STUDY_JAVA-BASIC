/* 
 * 여러 줄 주석
 */

//패키지 선언부
package pm;

//클래스 선언부
//public - 접근 지정자 (나중에 상세히 설명)
//class Test - Test라는 class를 나타냄
//			   클래스명은 반드시 파일명과 이맃해야만 함
//			   관용적으로 시작을 대문자로 사용함
public class Exam1{

// main 메서드
// public - 접근 지정자 (나중에 상세히 설명)
// static - 객체를 생성하지 않고도 실행 가능
// void - return이 없음을 의미
// main - 자바는 반드시 1개의 메인 메서드가 있어야만 한다. 시작점
// String [] - 배열을 의미 args 인수를 의미
	
	public static void main(String args[]) {

		// 자바의 한 줄 주석
		//System.out.println 인쇄 후 줄바꿈을 의미
		System.out.println("Hello!");
		System.out.println("World!");
		
		System.out.println("화면" + "출력");
		System.out.println(3.14);
		System.out.println(3+ 5);
		System.out.println("안녕하세요" + 5);
		System.out.println("화면" + 3 + 5);
		System.out.println(3+ 5+ "화면");
		// int 정수형 변수 선언
		int a  = 3;
		// String 문자열 변수 선언
		String b = "화면";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b + "출력");
		System.out.println(a + b + "출력");
		
		System.out.print(a + "\n"); // 개행문자
		System.out.print(b);
		
		// printf()
		System.out.println();
	
		System.out.printf("%d\n", 30);
		System.out.printf("%s\n", "출력");
		System.out.printf("%f\n", 3.14);
		
	}
}
