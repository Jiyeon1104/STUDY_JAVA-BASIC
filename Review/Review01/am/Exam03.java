package am;

// import java.util.Scanner;

public class Exam03 {
    /*
    * 연산자 -, +, *, /, % 홀수 짝수 배수
    */
    public static void main(String[] args) {
        int a = 3;
        ++a; // 전위형
        System.out.println(a);

        int b = 3;
        b++; // 후위형 b = b + 1;
        System.out.println(b);

        // quiz a가 홀수인지 짝수인지를 출력하세요
        
        a = 5;
        if(a % 2 == 0){
            System.out.println("a는 짝수입니다.");
        } else {
            System.out.println("a는 홀수입니다.");
        }

        // Scanner sc = new Scanner(System.in);
        // int ans = sc.nextInt();
        // if (ans % 3 == 0){
        //     System.out.printf("%d는 3의 배수입니다.", ans);
        // } else {
        //     System.out.printf("%d는 3의 배수가 아닙니다.", ans);
        // }

        // int q = 3;
        // int w = 2;
        // int e = 5;

        // System.out.println(q == w);
        // System.out.println(q == e);

        String str1 = new String("안녕");
        String str2 = new String("안녕");

        // 글자를 비교할 때는 .equals를 씀
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        
    }
}
