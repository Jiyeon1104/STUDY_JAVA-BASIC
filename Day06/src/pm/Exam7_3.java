package pm;

public class Exam7_3 {

	public static void main(String[] args) {
		// 명시적으로 this 키워드를 붙여야 하는 경우 
		// this 키워드 : 그 객체를 가리킴
		X x = new X();
		x.init(2, 3);
		System.out.println(x.m);
		System.out.println(x.n);
		
		Y y = new Y();
		y.init(2, 3);
		System.out.println(y.m);
		System.out.println(y.n);
	}

}


class X {
	int m;						// 자동으로 초기값이 0으로 세팅
	int n;						// 자동으로 초기값이 0으로 세팅
	void init(int m, int n) {	// int m =2, int n = 3
		m = m;					// 이름이 같음으로써 오는 혼동
		n = n;
	}
}


class Y{
	int m;
	int n;
	void init(int m, int n) {	// 2, 3
		this.m = m;				// y.m = 2, this 자리에는 호출한 객체명이 옴
		this.n = n;				// y.n = 3
		// 근본적인 이야기는 this는 생략 가능하더라도 쓰는 습관을 들이는 것이 좋음 > 혼동 방지
		
	}
}