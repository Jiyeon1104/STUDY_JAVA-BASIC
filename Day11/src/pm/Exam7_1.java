package pm;

public class Exam7_1 {
	class FoolException extends RuntimeException{
		// 디폴트 생성자를 자동으로 만들어줌
	}
		
	// 프로그래머의 실력을 어느정도 가늠해볼 수 있음
	
		public void sayNick(String nick) throws FoolException{
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + nick + "입니다.");
		}
	
		public static void main(String[] args) {
			Exam7_1 sample = new Exam7_1();
			try {
				sample.sayNick("fool"); // 예외가 발생하고 프로그램 종료
				sample.sayNick("genious"); // 실행되지 않음
		} catch (FoolException e) {
			System.out.println("FoolException이 발생했습니다.");
		}

	



	}

}
