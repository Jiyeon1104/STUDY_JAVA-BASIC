package pm;

import am.A;
// import java.util.Random;
// import java.util.Scanner;
import java.util.*; // import 문 10개만 사용하는데 100 몇 개 있는 *을 사용하게 되면 비효율을 불러올 수도 있음

public class Exam5 {

	public static void main(String[] args) {
		// Package & import
		// 패키지 (Package)는 비슷한 목적으로 생성된 클래스 파일들을 모아둔 폴더를 의미함
		// 1개의 프로젝트에 한 개 또는 여러 개의 패키지를 생성할 수 있음
		// 패키지를 아예 생성하지 않아도 전혀 문제는 없음
		// 하지만 패키지 사용을 권장함
		// 패키지를 생성하면 클래스를 만들 때 첫 번째 줄에 반드시 'package 패키지명';
		// 이 명시되어야만 함

		// 패키지 사용의 장점은 패키지의 영향으로 클래스가 저장되는 공간이 분리되어
		// 클래스명의 충돌을 방지할 수 있다는 점
		
		// 임포트는 다른 패키지 내의 클래스를 사용하기 위한 문법
		// 코드 상에서는 패키지 선언 다음 줄에 위치함
		// 일반적으로 자바가 동작할 때는 자신이 속한 패키지 내부에 위치한
		// 클래스만을 사용할 수 있음
		// 그러면 다른 패키지에 있는 클래스를 사용하는 방법은 2가지가 있음
		// 방법 1 : 클래스의 풀네임을 사용하는 방법. 클래스의 풀네임은 '패키지명.클래스명'
		// 		     같은 패키지 내의 타 클래스 사용법 A a = new A();
		//		     다른 패키지 내의 타 클래스 사용법 am.A a = new am.A();
		// 		     다른 패키지의 클래스를 사용하려면 그 클래스는 접근 제어자로 public이 선언되어 있어야만 함 (뒤에서 자세히)
		// 방법 2 : 임포트 사용
		// 		     실제로 프로그램을 작성하다 보면 자신이 작성한 클래스보다 다른 클래스들을
		//		     훨씬 더 많이 가져다가 사용하게 됨
		// 		     그 때마다 패키지명까지 풀네임을 사용하는 것은 비효율적임
		//		     그래서 import를 사용하게 됨
		// 여러 개의 패키지를 임포트 > *를 사용함
		// import am.A;
		// import am.B;
		// import am.C;
		// 복잡하고 긴 import문 -- > import am.*
		// 임포트는 마치 자신의 내부에 있는 것처럼 사용하는 것
		// 사실 실제 임포트 되는 대상은 .java가 아니라 컴파일이 완료된 .class
		
		
		// 방법 1
//		am.A a = new am.A();
//		
//		System.out.println(a.m);
//		System.out.println(a.n);
//		a.print();
		
		// 방법 2
		A c = new A();
//		System.out.println(c.m);
//		System.out.println(c.n);
		c.print();
	}

}
