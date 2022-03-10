package pm;

public class Exam7_1 {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// 생성자의 모양 (개수, 자료형)에 따라 객체를 생성하는 방법이 결정됨
		
		K k1 = new K();
		K k2 = new K(3);
		K k3 = new K(3,5);
	}
}

	class K{
		K(){ // 생성자는 클래스명과 동일, 리턴이 없음
			System.out.println("첫 번째 생성자");
		}
		
		K(int a){
			System.out.println("두 번째 생성자");
		}
		K(int a, int b){
			System.out.println("세 번째 생성자");
		}
}
