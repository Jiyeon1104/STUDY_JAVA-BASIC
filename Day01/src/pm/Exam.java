package pm;

public class Exam {

	public static void main(String[] args) {
		// 자료형
		// 변수 선언과 함께 값 대입
		int a = 3;
		
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		
		// 변수명 짓기
		// 1. 영문 대소 문자와 한글도 사용할 수 있음 (한글은 사용하지 말자)
		// 2. 특수 문자는 밑줄(_)과 달러 ($)만 사용할 수 있음
		// 3. 숫자는 사용할 수 있으나 첫 글자로는 사용할 수 없음 (a3 (o), 3a (x))
		// 4. 예약어는 사용할 수 없음 (int (x), public (x))
		// 영어 소문자를 사용, 의미있는 다넝 사용, 여러 단어를 사용할 때는 두번째 단어부터는 첫 글자를 대문자로
		
		boolean aBcD; //대문자는 새로운 단어의 앞글자로 사용
		byte 가나다; //한글도 변수명으로 사용은 가능함
		short _abvd; // _로 시작할 수 있음
		char $ab_cd; // $로 시작할 수 있음
		// int, 3abc; // 숫자로 시작할 수 없고 예약어를 사용할 수 없음
		// double main; // 예약어 main은 사용할 수 없음
		String myClassName; // 두 번재 단어의 첫 글자는 대문자
		String ABC; //사용은 가능하지만 비추 (전부 대문자)
		
		// 변수의 범위
		// 변수의 생존 기간은 메모리에 변수가 만들어진 이후 사라지기까지의 기간으로 불 수 있음
		// 자바는 개발자가 직접 변수를 생성, 하지만 변수를 삭제하는 작업은 자바가 알아서 함
		// 그러나 개발자가 아니기 때문에 메모리에서 변수가 사라지는 시점을 이해하는 것은 중요
		// 만약 사라진 변수값을 읽거나 값을 대입하려고 하면 문법 오류가 발생
		int value = 3;
		{
			int value2 = 5; // 변수 value2가 생성되는 시점 
			System.out.println(value);
			System.out.println(value2);
		} // 변수 value2가 사라지는 시점
		System.out.println(value);
		//System.out.println(value2);
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		float value5 = 1.3F;
		double value6 = -1.5;
		double value7 = 5;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
		
		
	}

}
