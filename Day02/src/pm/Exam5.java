package pm;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 사용자로부터 월을 직접 입력받아서 해당 월을 영어로 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 >>> ");
		int mon = sc.nextInt();
		
		switch(mon) {
		case 1 : System.out.println("January"); break;
		case 2 : System.out.println("Feburary"); break;
		case 3 : System.out.println("March"); break;
		case 4 : System.out.println("April"); break;
		case 5 : System.out.println("May"); break;
		case 6 : System.out.println("June"); break;
		case 7 : System.out.println("July"); break;
		case 8 : System.out.println("August"); break;
		case 9 : System.out.println("September"); break;
		case 10 : System.out.println("October"); break;
		case 11 : System.out.println("November"); break;
		case 12 : System.out.println("December");
		
		
		}
		

	}

}
