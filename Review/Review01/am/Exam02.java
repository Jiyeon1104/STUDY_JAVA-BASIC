package am;

public class Exam02 {
        
        /* 변수명 짓기
        * 1. 영문 대소문자와 한글도 사용할 수는 있음 (되도록이면 한글은 쓰지 말자)
        * 2. 특수문자는 밑줄과 $만 사용할 수 있음
        * 3. 숫자를 사용할 수는 있지만 단 첫 번째 글자로는 쓸 수 없음 a1 (O) 1a(X)
        * 4. 이미 예약어로 지정된 단어는 사용할 수 없음 ex. int, public (X)
        * *. 영문 소문자로 시작하자, 한글은 쓰지 말자
        * *. 영단어를 두 개 이상 사용할 때는 새로운 단어의 첫 글자는 대문자로
        * myClass, minVal, bestLoc
        
        * 상수명 짓기
        * final int MY_DATA; 상수명은 대문자 그리고 언더바 snake case
        
        * 변수의 생존 기간
        
        */
    public static void main(String[] args) {
        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        } // value2 소멸
        System.out.println(value1);
        // System.out.println(value2); 블록 안에서 선언했기 때문에 value2라는 변수가 없어지고 호출 불가

        // 형변환 (Casting)
        float value3 = 1.2F; // 실수형 float은 F를 붙여서 정의함
        double value4 = 1.5; // 실수형 double은 기본 실수 자료형

        double value5 = 5; // 자동 타입 변환
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);

        int value6 = (int) 5.3; // 강제 타입 변환
        System.out.println(value6);
        long value7 = (long) 10;

        // 형변환은 자바가 자동으로 수행하는 자동 형변환과 개발자가 직접 형변환을 수행해야 하는
        // 수동 형변환이 있음. 크기가 작은 자료형을 큰 자료형에 대입할 때는 어떤 손실도 발생하지 않음
        // 따라서 작은 자료형을 큰 자료형에 담으면 개발자가 변환 코드를 넣어주지 않아도
        // 자바가 자동으로 타입을 변환해주는데 이것을 업캐스팅이라고 함
        // 정수형 자료형 크기 순서 : byte < short < int < long
                
    }
}
