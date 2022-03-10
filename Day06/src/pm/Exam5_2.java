package pm;

public class Exam5_2 {

	public static void main(String[] args) {
		// 메서드 오버로딩 (Method Overloading)
		
		// printa(); //인수가 없을 때
		
		// printb(3); // 인수가 하나인데 int형일 때
		
		// printc(5.8); 인수가 하나인데 double형일 때
		
		// printd(2,5); 인수가 2개일 때
		
		// print(); 하나의 메서드 명으로 인수의 개수와 형에 따라 동작을 다르게 하는 것
		print();
		
	}

//	public static void printa() {
//		System.out.println("데이터가 없습니다");
//	}
//	
//	public static void printb(int a) {
//		System.out.println(a);
//	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double b) {
		System.out.println(b);
	}
	
	public static void print(int c, int d) {
		System.out.println(c + d);
	}
}
