package pm;

public class Quiz1 {

	public static void main(String[] args) {
		// 사용자 예외 클래스를 정의하여 예외를 발생시키시오
		// 예외 발생 조건 - 100점 초과 예외 발생 : 100점 초과 
		// 예외 발생 조건 - 0점 미만 예외 발생 : 음수값 입력
		// 정상값 0점 ~ 100점 : 정상적인 값입니다.
		AA aa = new AA();
		
		try {
		aa.checkScore(85);
		aa.checkScore(110);
		} catch(MinusException | OverException e) {
			System.out.println(e.getMessage());
		}

}
}

class AA{
	void checkScore(int score) throws MinusException, OverException{
		if(score < 0) {
			throw new MinusException("예외 발생 : 음수값 입력");
		} else if(score > 100) {
			throw new OverException("예외 발생 : 100점 초과");
		} else {
			System.out.println("정상적인 값입니다.");
		}
	}
}


class OverException extends RuntimeException{
	public OverException(String message) {
		super(message);
	}
}

class MinusException extends Exception{
	public MinusException(String message) {
		super(message);
	}
}

