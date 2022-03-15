package pm;

// 인터페이스는 일종의 작업 지시서 
public class LedTV implements TV { // LedTV는 TV인터페이스를 구현함, TV인터페이스가 가진 모든 기능들을 LedTV도 모두 갖게 하겠다는 뜻

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조절하다");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 변경하다");
	}

}
