package pm;

public class Exam4 {
	
	public static void main(String[] args) {
		
		//int a  = 85;
		//if(a >= 70 && a < 80) {
		//	System.out.println("C학점");
		//} else if(a >= 80 && a < 90) {
		//	System.out.println("B학점");
		//} else if(a >= 90 && a < 100) {
		//	System.out.println("A학점");
		//} else {
		//	System.out.println("F학점");
		//}
		
		// int a  = 85;
		// if(70 <= a < 80) { 			// 자바에서는 반드시 각각을 분리하고 논리 연산자로 연결해야만 함
		//	System.out.println("C학점");
		//} else if(a >= 80 & a < 90) { // 
		//	System.out.println("B학점");
		//} else if(a >= 90 && a < 100) {
		//	System.out.println("A학점");
		//} else {
		//	System.out.println("F학점");
		//}
		
		// int a = 1;
		// int b = 2;
		
		// 효율성  & 나 |를 하나만 사용하면 모든 조건을 모두 확인하여 결정함
		// 	    &&나 || 두 개를 사용하면 조건을 전부 확인하지 않고 하나만으로도 결정함
		//      논리 연산자는 비트 연산자와 매우 비슷하지만 피연산자로 블리언(true or false)
		//	         만 올 수 잇고 연산 결과 또한 불리언 타입만을 지님, 논리 and (&&)는 두 값이 모두 참일 때만
		//		true, 나머지는 모두 false일 때만 false값을 가짐. 
		//		반면 논리 or ||는 두 값이 모두 false일 때만 false이고 나머지는 모두 true임.
		
		
		// if(a < 3 | b < 3) {
		//	System.out.println("둘 다 3 미만입니다.");
		// }else {
		// 	System.out.println("둘 다 3 미만이 아닙니다");
		// }
		
		// switch 구문
		// switch는 변수 값에 따라서 특정 위치 case로 이동하여 구문을 길행하는 선택 제어문
		
		int a = 2;
		
		switch(a) {
		case 1:
			System.out.println("A");
			break; // break문을 만나면 구문을 빠져 나감
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default : 
			System.out.println("0");
		}
		
		int b = 8;
		switch(b) {
		case 10: case 9: case 8: case 7:
			System.out.println("pass"); break;
		default : 
			System.out.println("fail");
		}
		
		int c = 8;
		if (c < 11 && c > 6) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		int score = 85;
		switch((int)score / 10) {
		case 10 : case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		default : System.out.println("F"); break;
		}
		
		int mon = 5;
		
		switch((int)mon / 3){
		case 1 : System.out.println("봄입니다."); break;
		case 2 : System.out.println("여름입니다."); break;
		case 3 : System.out.println("가을입니다."); break;
		default : System.out.println("겨울입니다."); 
		}
		
	}
}
