package pm;

public class Exam7 {
	public static void main(String[] args) {
		// #1. 1부처 1000까지의 자연수 중 3의 배수의 합을 계산하시오. for
//		int sum = 0;
//		for (int i = 0; i <= 1000; i+=3) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// #2. * ** *** **** *****
//		for (int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				if(i <= j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		// #3. 정삼각형 (각자 풀어보시오)
//		for (int i = 0; i < 5; i++) {
//			for(int j = 1; j <= 2 * i + 1; j++) {
//				if(j )
//				System.out.print();
//				System.out.print("*");
//			}
//		}
		
		// #4. for - each 문
		// 70, 60, 55, 75, 95, 90, 80, 80, 85, 100
		
		int sum = 0;
		int avg = 0;
		int maxi = 0;
		int mini = 50;
		
		int[] scores = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		for(int score : scores) {
			sum += score;
		}
		System.out.println("sum : " + sum);
		
		avg = sum / scores.length;
		System.out.println("avg : " + avg);
		
		for (int score : scores) {
			maxi = score;
			mini = score;
			if(score >= maxi) {
				maxi = score;
			} else if (score < mini){
				mini = score;
			}
		}
		System.out.println("maxi : " + maxi);
		System.out.println("mini : " + mini);
	}
}
