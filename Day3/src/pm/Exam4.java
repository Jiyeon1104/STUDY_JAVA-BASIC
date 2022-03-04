package pm;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		// 숫자를 하나 입력 받아서 0인지의 여부를 판단하는 프로그램을 만드시오
		// 입력하신 숫자는 0입니다.
		// 입력하신 숫자는 0이 아닙니다.
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		} else {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}
		
		// 삼항연산자
//		System.out.println("숫자 입력  : ");
//		int num1 = sc.nextInt();
//		String ans = (num1 == 0) ? "입력하신 숫자는 0입니다" :  "입력하신 숫자는 0이 아닙니다.";
//		System.out.println(ans);
//	}
		
//		System.out.println("점수 입력  : ");
//		int score = sc.nextInt() / 10;
//		String grade = "";
		
//		switch(score) {
//		case 10: case 9 : grade = "A"; break;
//		case 8 : grade = "B"; break;
//		case 7 : grade = "C"; break;
//		case 6 : grade = "D"; break;
//		default : grade = "F"; 
//		}
		
		
//		int semi_grade = score / 3;
//		switch(semi_grade) {
		
//		}
		System.out.println("점수 입력  : ");
		int num = sc.nextInt();
		char grade = ' ';
		char opt = ' ';
		
		if (num >= 90) {
			grade = 'A';
		} else if (num >= 80) {
			grade = 'B';
		} else if (num >= 70) {
			grade = 'C';
		} else if (num >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		if (num == 100) {
			opt = '+';
		}else if (num % 10 >= 7) {
			opt = '+';
		} else if (num % 10 <= 3) {
			opt = '-';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.\n", grade,opt);
	}
}
