package am;

import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(j == 3) {
//					continue;
//				}
//				System.out.println(i + ", " + j);
//			}
//		}
		
//		for (int i = 10; i > 0; i -= 2) {
//			System.out.println(i);
//		}
		
//		int i = 10;
//		while (i < 0) {
//			System.out.println(i);
//			i -= 2;
//		}
		outer:
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 3 & j == 2) {
					break outer;
				}
				System.out.println(i + " " + j);
			}
		}
	
		// 메뉴 선택 1) 빅맥 2) 타코 3) 백반
	
		// 원하는 메뉴를 선택하시오 (종료 > 0)
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("메뉴 선택 \n 1) 빅맥 \n 2) 타코 \n 3) 백반 \n 0) 종료");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("선택하신 메뉴는 빅맥입니다.");
				continue;
			} else if (menu == 2) {
				System.out.println("선택하신 메뉴는 타코입니다.");
				continue;
			} else if (menu == 3) {
				System.out.println("선택하신 메뉴는 백반입니다.");
				continue;
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");		
				continue;
			}
		}
	
	}
}
