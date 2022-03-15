package pm;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();	// 자료형 interface, 참조 변수의 타입으로 인터페이스를 사용할 수 있음
		// 인터페이스가 가진 매서드들만 사용할 수 있음
		tv.turnOn();
		tv.changeVolume(8);
		tv.changeChannel(39);
		tv.turnOff();

	}

}
