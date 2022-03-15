package pm;

public class myCalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		int j = cal.plus(3, 4);
		System.out.println(j);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		// static 매서드는 반드시 인터페이스명.매서드명(); 형식으로만 호출해야 사용할 수 있음
		Calculator.exec2(3,4);
	}

}
