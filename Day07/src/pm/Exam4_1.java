package pm;

// import am.C;

public class Exam4_1 {
	public static void main(String[] args) {
		// 가변 길이 자료형을 이용하여 여러 개의 정수를 개수와 상관 없이 
		// 입력 받아 그 평균값을 출력하는 메서드를 만드시오
		
		C c = new C();
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
	}
}

class C{
	void averageScore(int ... values) {
		double sum = 0;
		for(int i : values) {
			sum += i;
		}
		double avg = sum / values.length;
		System.out.println(avg);
	}
}

