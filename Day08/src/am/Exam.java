package am;
import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		// 배열, 조건, 반복
		// 주석, 클래스, 객체
		
		int[] a = {1,3,4,5,6};
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		
		// Q1. 각각 첫 수부터 숫자 2개씩을 나누어 출력하라
		Test test = new Test();
		test.ex(a);
		
		// Q2. 첫 수부터  숫자 2개씩을 더한 값이 짝수인 그 해당 숫자 2개의 인덱스 번호를 배열로 만들어 출력하시오

	}

}


class Test{
	void ex(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			if((a[i] + a[i+ 1]) % 2 == 0) {
				int[] test = new int[2];
				for (int j = 0; j < test.length - 1; j ++) {
					test[j] = i;
					test[j + 1] = i + 1;
				}
				System.out.println(Arrays.toString(test));
			}
		}
	}
}
	
