package am;

public class Exam05 {
    public static void main(String[] args) {
        // for문으로 0 1 2 3 4 5
        
        // for(int i = 0; i < 6; i++){
        //     System.out.print(i + "\t");
        // } 

        // int i = 0;
        // while (i < 6){
        //     System.out.print(i + "\t");
        //     i++;
        // }

        // 구구단 출력
        // for(int i = 2; i < 10; i++){
        //     for(int j = 1; j < 10; j++){
        //         System.out.printf("%d * %d = %d \n", i, j, i * j);
        //     }
        // }

        // System.out.println();

        int i = 2;
        while (i < 10){
            int j = 1;
            while (j < 10){
                System.out.printf("%d * %d = %d \n", i,j, i*j);
                j++;
            }
            i++;
        }
    }
}
