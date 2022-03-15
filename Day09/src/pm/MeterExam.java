package pm;

public class MeterExam {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		
		boolean a = Meter.class.isInstance(taxi);
		
		if(a!= true) {
			System.out.println("Taxi 클래스는 Meter 인터페이스를 구현해야 합니다.");
		}
		
		else if(taxi.stop(200)!= 400) {
			System.out.println("stop(200)의 값은 400이어야 합니다.");
		} else {
			System.out.println("정답입니다.");
		}
	}

}
