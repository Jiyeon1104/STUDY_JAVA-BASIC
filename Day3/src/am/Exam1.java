package am;

public class Exam1 {

	public static void main(String[] args) {
		/*
		 * 제어문 - 반복문 - while
		 * 
		 * 중괄호 안의 실행 구문을 반복적으로 실행하는 반복제어문으로 조건을 만족하는 동안 반복은 지속됨
		 * 
		 * while (조건){
		 * 		실행구문;
		 * }
		 * 
		 * while문과 for문은 언제든지 상호 변환할 수 있음
		 */
//		int sum = 0;
//		int num = 0;
//		
//		while (sum < 100) {
//			sum += num;
//			num++;
//		}
		
//		System.out.println((num - 1)+ "까지의 합 = " + sum);

//		int a = 0;
//		while (a < 10) {
//			System.out.println(a + " ");
//			a++;
//		}
		
//		System.out.println();
		
//		for(int a = 0; a < 10; a++) {
//			System.out.println(a + " ");
//		}
	
	
//		int c = 0;
//		while(true) {
//			if (c < 9) {
//				break;
//			}
//			System.out.println(c);
//			c++;
//			}
		
		/* 
		 * do - while문
		 * while문과 매우 비슷한 반복 제어문, 
		 * 차이점은 조건식의 검사와 반복 실행의 순서에서 차이가 남
		 * while과 do - while의 가장 큰 차이점은 
		 * while은 실행구문이 단 한 번도 실행이 되지 않을 수도 있다는 점에 비해
		 * do - while은 실행구문이 반드시 한 번은 실행 되어야만 한다는 점
		 * 
		 * do {
		 * 	실행구문
		 * 	증감식
		 * }while(조건식);
		 * 
		 */
		
//		int a;
//		//while문
//		a = 0;
//		while (a < 0) {
//			System.out.println(a); // 0번 실행
//		}
//		
//		// do ~ while문
//		do {
//			System.out.println(a);
//			a++;
//		} while (a < 0); // 1회가 반드시 실행
		
		// 초기값이 a = 0이므로 처음부터 조건식 a < 0은 false임
		// 따라서 while문으로 진입할 수 없으므로 단 한 번도 실행되지 않음.
		// 반면 do - while 문일 때는 일단 한 번은 실행한 후에 조건식을
		// 검사하기 때문에 1회는 반드시 실행함
		// 마치 do - while 문은 while문보다 1회 더 실행된다고 생각할 수도 있지만 그것은 아님
		
		int a;
		//while문
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a ++;
		
		// do - while문
		a = 0;
		do {
			System.out.println(a + " ");
			a ++;
		} while (a < 10);
		}
	}

}
