package am;

public class Exam2 {

	public static void main(String args[]) {
		// 연산자의 종류
		// 산술연산자 + - * / %
		// 증감연산자 ++ --
		// 비트연산자 & and | or
		// 비교연산자 < > <= >= == !=
		// 대입연산자 = += -= *= /=
		// 삼항연산자 (조건식) ? true : false
		
		// int a = 1;
		// a = a + 1; a += 1;
		// a ++; 후위형
		// ++ a; 전위형
		
		int a  = 3;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		int c = 3;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		// 삼항연산자 : 3개의 피연산자가 있는 연산자
		// (조건식) ? true : false
		
		int score = 85;
		char credit = (score >= 90) ? 'A' :(score >= 80)? 'B': (score >= 70)? 'C': (score >= 60)? 'D' : 'F';
		System.out.println(credit);
	}
}
