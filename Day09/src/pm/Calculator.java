package pm;

public interface Calculator {
	
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	// java 8 이후부터 default를 붙이면 매서드 구현까지 가능하도록 기능을 추가함
	default int exec(int i, int j) {
		return i + j;
	}
		
	public static int exec2(int i, int j) {
		return i * j;
	}

}
