package pm;

public class Exam12 {
    public static void main(String[] args) {
        R r = new R();
        R r1 = new R(3);
        R r2 = new R(3,5);
    }
}

class R {
    R() {
        System.out.println("첫 번째 생성자");
    }

    R(int a) {
        System.out.println("두 번째 생성자");
    }

    R(int a, int b) {
        System.out.println("세 번째 생성자");
    }
}