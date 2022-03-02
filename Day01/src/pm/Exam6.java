package pm;

public class Exam6 {
	public static void main(String[] args) {
	
	//문자 저장 방법
	char value1 = 'A';
	char value2 = '가';
	char value3 = '3'; //숫자가 아닌 문자3
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	
	//숫자로 문자 저장
	char value4 = 65;
	System.out.println(value4);
	
	//유니코드로 문자 저장
	char value5 = '\u0065';
	System.out.println(value5);
	
	// 형변환 type casting
	// Boolean을 제외한 기본 자료형은 서로 형을 변환할 수 있음
	// 타입 변환을 수행할 때는 저장할 수 있는 값의 범위나 종류가 달라지므로 값이 변화할 수 있음
	
	int value11 = (int) 5.3;
	System.out.println(value11);
	
	float value21 = 3; // int > float 업캐스팅
	long value22 = 5; //int > long 업캐스팅
	
	int value27 = (int)3.5; //double > int 다운 캐스팅
	//float value29 = 7.5; //실수 기본은 double 임
	float value30 = (float)7.5;
	
	float value31 = 2.453214321F;
	
	// 자료형 간의 연산
	// Boolean을 제외한 기본 자료형은 서로 연산이 가능함
	// 이 때, 모든 연산은 같은 자료형끼리만 가능하고 연산 결과 역시 같은 자료형으로 나옴
	
	int value41 = 3 + 5;
	int value42 = 8 / 5;
	float value43 = 3.0f + 5.0f;
	
	byte data1 = 3;
	byte data2 = 5;
	// byte data3 = data1 + data2; 결과가 int로 나옴
	int data4 = data1 + data2;
	
	//int value45 = 5 + 3.5; 결과가 double이므로 오류
	double value46 = 5 + 3.5;
	
	double value48 = 5 / 2.0;
	byte data13 = 3;
	short data14 = 5;
	int value49 = data13 + data14;
	double value50 = data13 + data14;
	//int를 double로 자동 형 변환
	
	// quiz 1
	//int a = 3;
	//{
	//	int b;
	//	b = 5;
	//}
	//int c = 7;
	//}
	
	//quiz 2
	// 1 byte a = 3;
	// 2 byte b = 5;
	//int c = 130
	//int d = a + b
	//long e = 100L
	//float f = 3.5f
	
	}
}
