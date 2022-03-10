package pm;

public class Exam4_2 {

	public static void main(String[] args) {
		// 메서드
		// 메서드는 클래스의 기능에 해당하는 요소
		// For Example, 사람 클래스라면 먹기, 잠자기, 공부하기
		// 자동차 클래스라면 앞으로 가기, 후진하기, 유턴하기 등 동작 및 기능을 나타내는 것들
		// 메서드명은 관례적으로 소문자로만 만듦
		
		// 제어자 반환타입 메서드명(인수){
		// }
		// public static int sum(int a, int b){
		// }
		// 입력값으로 int형 a,b 2개를 입력받아서 처리함
		
		// 1. input도 없고 return도 없는 케이스 
		// 여러가지 형태의 반환타입
		// void print(){
		// System.out.println("HI");
		// } 리턴타입이 void 이기 때문에 (리턴이 없음, 인수(파라미터)도 없음)
		
		// 2. input은 없고 return은 있는 케이스
		// int / double / String 등 print(){
		// return 3 / 0.0 / "HI";
		// } 
		
		// 3. input은 있고 return은 없음
		// void print(String name){
		// System.out.println(name);
		// } 
		
		// 4. input도 있고 return도 있는 경우
		// int / double / boolean / String 등 print(int / double / boolean / String name){
		// return 앞에서 지정한 형태의 파라미터 반환;
		
		// 매서드 화출
		// 매서드를 사용하려면 먼저 객체를 생성해야 함
		// A a = new A();
		// a.method();
	}

}
