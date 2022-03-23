package pm;

public class Exam8 {

	public static void main(String[] args) {
		/* 제너릭 매서드
		 * 클래스 전체를 제너릭으로 선언하는 대신에 일반 클래스의 내부의 특정 매서드만 제너릭으로 선언할 수 있음
		 * 이것을 제너릭 매서드라고 하고 리턴 타입 또는 매개변수 타입을 제너릭 타입 변수로 선언함
		 
		 * 제너릭 클래스가 객체를 생성하는 시점에 실제 타입을 지정하는 것과는 다르게
		 * 제너릭 매서드는 호출되는 시점에 실제 제너릭 타입을 지정하게 됨
		 */

		GenericMethods gm = new GenericMethods();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");		// 제너릭 생략 가능
		
		System.out.println(str1);
		System.out.println(str2);
		
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.5, 2.5);
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		gm.<String, Integer>method3("친구야", 50);
		gm.method3("오바야", 100);
	}

}

class GenericMethods{
	public <T> T method1 (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3 (K k, V v) {
		System.out.println(k + ":" + v);
	}
}

/* 제너릭 매서드의 제너릭 타입 변수는 매서드가 호출되는 시점에 결정됨
* 즉, 정의하는 시점에는 아직 어떤 타입이 입력될지 전혀 모르는 것
*/