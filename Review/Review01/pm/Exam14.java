package pm;

public class Exam14 {
    public static void main(String[] args) {
        /*this 매서드 
        * this 키워드와 매우 비슷해보이지만 의미가 전혀 다름 like 인도, 인도네시아
        * this() 매서드는 자신이 속한 클래스의 내부의 다른 생성자를 호출함
        * this() 매서드의 특징
        * 1. 생성자의 내부에서만 사용됨
        * 2. 생성자의 첫 줄에서만 사용됨
        * 이 두 개의 규칙 중 하나라도 지켜지지 않으면 에러 발생
        */ 

        Y y = new Y();
        System.out.println();
        Y y2 = new Y(3);
        System.out.println();
    }
}

class Y {
    Y(){
        // 기본생성자
        System.out.println("첫 번째 생성자");
    }

    Y(int a){
        this(); // 첫 줄에 위치함
        System.out.println("두 번째 생성자");
    }
}
