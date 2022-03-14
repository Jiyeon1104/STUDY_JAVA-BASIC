package pm;

class superA{
	superA(){
		System.out.println("A생성자");
	}
}

class superB extends superA{
	superB(){
		// superA(); > 생략하면 자바가 자동으로 만들어주기 때문에 꼭 명시할 필요는 없음
		System.out.println("B생성자");
	}
}

class superC{
	superC(int a){
		System.out.println("C생성자");
	}
}

class superD extends superC{
	/* 자바가 자동으로 추가하는 내용은
	 * superD(){
	 * super();
	 * }
	 */
	superD(){
		super(3);
		
	}
}
public class Exam7_3 {

	public static void main(String[] args) {
		superA sa = new superA();
		System.out.println();
		
		superB sb = new superB();

	}

}
