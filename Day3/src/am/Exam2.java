package am;

public class Exam2 {

	public static void main(String[] args) {
		// continue 제어 키워드
		// 반복 과정에서 특정 구문을 실행하지 않고 건너 뛰는 용도로 사용됨
		
		for(int i =0; i<10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
