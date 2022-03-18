package am;

import java.util.Scanner;
public class Exam04 {
    public static void main(String[] args) {
        // 제어문 - 조건문 if / switch~case, 반복문 while / do  ~ while / for
        
        /* 제어문
        * 기본적으로 소스 코드를 위에서부터 아래로 차례대로 1줄씩 처리됨
        * 프로그램을 의도적으로 흐름을 바꿔야 할 필요가 있는데 이 때 사용되는 것이 제어문임
        * 즉, 제어문은 '프로그램의 처리 순서를 바꾸는 것'
        * 자바에서는 5개의 제어문과 2개의 제어 키워드 (break, continue)
         
        * if - 조건에 따라 실행문의 실행 여부를 결정하는데 사용
        */

        int val = 5;
        if(val > 3){
            System.out.println("실행1");
        } else {
            System.out.println("실행2");
        }

        int score = 85;
        String c = " ";
        if(score >= 90) {
            c = "A";
        } else if(score >= 80){
            c = "B";
        } else if(score >= 70){
            c = "C";
        } else if(score >= 60){
            c = "D";
        }else {
            c = "F";
        }

        System.out.println("당신의 학점은 " + c + "입니다.");

        // int x = 1;
        // 입력하신 x는 양의 정수입니다.
        Scanner sc = new Scanner(System.in);
        System.out.print("int x = ");
        int x = sc.nextInt();
        
        // if로 만든 모든 것은 switch문으로 변경할 수 없을 수도 있음
        // 그러나 switch로 만든 모든 것은 if로 변경할 수 있음

        if(x > 0){
            System.out.printf("입력하신 %d는 양의 정수입니다.", x);
        } else if (x ==0){
            System.out.println("0입니다.");
        } else {
            System.out.printf("입력하신 %d는 음의 정수입니다.", x);
        }
        
        int a = 2;
        switch(a){
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
        }

        // if를 switch로 바꾸지 못하는 예

        switch(x){
            case -1 :
                System.out.println("입력하신 값은 음의 정수입니다.");
                break;
            case 0 :
                System.out.println("0입니다.");
                break;
            case 1 :
                System.out.println("입력하신 값은 양의 정수입니다.");
                break;
        }

        int month = 3;

        switch (month){
            case 3: case 4: case 5:
            System.out.println("봄입니다.");
            break;

            case 6: case 7: case 8:
            System.out.println("여름입니다.");
            break;

            case 9: case 10: case 11:
            System.out.println("가을입니다.");
            break;

            default:
            System.out.println("겨울입니다.");
            break;
        }
    }
}
