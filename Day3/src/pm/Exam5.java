package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 가위바위보 게임
		// input) 가위 (1), 바위 (2), 보(3) 중 하나를 입력하세요 >>
		// 단신은 1입니다.
		// 컴은 1입니다.
		// 비겼습니다.
		// input) 가위 (1), 바위(2), 보(3) 중 하나를 입력하세요 >>
		// 당신은 3입니다.
		// 컴은 2입니다.
		// 당신이 이겼습니다.
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >> ");
//		int choice = sc.nextInt();
//		int comp = (int)(Math.random() * 3 + 1);
//		String ans = " ";
//		switch(choice) {
//		case 1: ans = (comp == 2) ? "당신이 졌습니다." : (comp == choice) ? "비겼습니다" : "당신이 이겼습니다."; break;
//		case 2: ans = (comp == 3) ? "당신이 졌습니다." : (comp == choice) ? "비겼습니다" : "당신이 이겼습니다."; break;
//		case 3: ans = (comp == 1) ? "당신이 졌습니다." : (comp == choice) ? "비겼습니다" : "당신이 이겼습니다.";
//		}
//		System.out.printf("당신은 %d입니다. \n컴은 %d입니다.\n%s", choice, comp, ans);
		
		// 2개의 변수 a, b를 입력받아서 대소관계를 표시하는 프로그램을 작성하시오.
		// a가 크다. b가 크다. 같다.
//		System.out.println("숫자 2개를 입력하세요 >> ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		String ans = " ";
//		
//		ans = (a < b) ? "b가 크다." : (a == b) ? "같다." : "a가 크다.";
		
//		System.out.println(ans);
		
		// 사용자로부터 3개의 정수를 입력받아 그 중 최소값을 출력하는 프로그램을 작성하자
//		System.out.println("숫자 a를 입력 >> "); int a = sc.nextInt();
//		System.out.println("숫자 b를 입력 >> "); int b = sc.nextInt();
//		System.out.println("숫자 c를 입력 >> "); int c = sc.nextInt();
//		
//		int min = a;
//		
//		if (b < min) min = b;
//		if (c < min) min = c;
//		
//		System.out.println("최소값은 " + min);
		
		// 3개의 정수값을 입력받아 오름차순으로 정렬하는 프로그램을 작성하시오
//		System.out.println("숫자 a를 입력 >> "); int a = sc.nextInt();
//		System.out.println("숫자 b를 입력 >> "); int b = sc.nextInt();
//		System.out.println("숫자 c를 입력 >> "); int c = sc.nextInt();
		
//		int min = a;
//		int mid = 0;
//		int max = 0;
//		
//		if(b < min) {
//			min = b;
//			mid = a;
//			if (c < mid) {
//				mid = c;
//				max = a;
//			}
//			} else if(b > min) {
//				mid = b;
//				if (c > mid) {
//					max = c;
//				}else if (c < mid){
//					mid = c;
//					max = b;
//				}
//		}
		// a가 b보다 크면 a와 b를 교환 > 12 13 11
//		if (a > b) {int t = a; a = b; b = t;}
//		// b가 c보다 크면 b와 c를 교환 > 12 11 13
//		if (b > c ){int t = b; a = b; b = t;}
		// a가 b보다 크면 a와 b를 교환 > 11 12 13
//		if (a > b) {int t = a; a = b; b = t;}
		
//		System.out.printf(a + " " + b + " " + c + " ");
		
		// 3 자리의 양의 정수값 (100 - 999)를 읽는 프로그램을 작성하세요
		
//		System.out.print("세자리 정수 입력");
//		int num = 0;
		
//		do {
//			num = sc.nextInt();
//			
//		} while (num < 100 || num > 999);
		
//		System.out.printf("입력한 갑은 %d입니다.", num);
		
		// 숫자 맞추기 게임
		// 10부터 99 사이의 숫자를 맞추세요.
		
		Random rand = new Random();
		int comp = 10 + rand.nextInt(90);
		int num;
		do {
			System.out.println("어떤 숫자일까요?");
			num = sc.nextInt();
		
			if (num > comp) {
				System.out.println("더 작은 숫자입니다.");
			} else if (num < comp) {
				System.out.println("더 큰 숫자입니다.");
			} 
			
		}while (num != comp);
			
			System.out.println("정답입니다.");
		
			
	}
}
