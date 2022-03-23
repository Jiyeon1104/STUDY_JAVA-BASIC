package pm;

public class Exam6 {

	public static void main(String[] args) {
		/* 제너릭 (Generic) 을 사용하면 모든 타입의 상품을 저장할 수도 있으면서
		 * 잘못된 캐스팅을 할 때 문법 오류를 발생시키는 문제를 사전에 예방할 수 있음
		 
		 * 제너릭 클래스와 제너릭 인터페이스 정의
		 * public class MyClass<T> {
		 * 	private T t;
		 * 	public T get(){
		 * 		return T
		 * }
		 
		 * 	public void set(T t){
		 * 		this.t = t;
		 * }
		 * }
		  
		 * public interface MyInterface <K,V> {
		 * 	public abstract void setKey(K k);
		 * 	public abstract void setValue(V v);
		 * 	public abstract K getKey();
		 * 	public abstract V getValue();
		 * }
		 
		 * 제너릭 클래스인 MyClass<T>는 제너릭 타입 변수 1개를 갖고 있음
		 * 이 제너릭 타입은 필드 타입 getter 매서드의 리턴 타입, setter매서드의 입력 타입에 사용됨
		 
		 * 제너릭 인터페이스인 MyInterface <K,V>는 2개의 제너릭 타입 변수를 갖고 있고
		 * 각각 setter 와 getter 매서드의 입력과 리턴 타입으로 사용됐음
		 
		 * 제너릭 클래스라고 해도 역시 클래스의 객체 생성 등의 기능을 모두 갖고 있음
		 * 다만 클래스명 다음에 제너릭 타입을 명시한다는 점에서 차이가 있음
		 * 즉 객체를 생성할 때 제너릭 타입 변수에 실제 타입을 대입하게 되는 것임
		  
		 * MyClass<String> mc2= new MyClass<String>();
		 * String 타입을 저장하거나 꺼내올 수 있는 객체로 지정
		 */
		
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.set("안뇽"); 오류발생
//		System.out.println(mc2.get());
		
		/* 단순하게 하나의 클래스로 다양한 타입의 객체를 저장하고 관리할 수 있도록 하는 것은
		 * Object 타입의 필드를 사용하는 것만으로도 가능함
		 * 하지만 모든 객체는 Object 타입이기 때문에 실수로 엉뚱한 객체를 저장하더라도
		 * 오류를 발생하지는 않음 
		 * getter 매서드로 꺼내온 값도 Object타입이므로 항상 다운캐스팅을 수행해야만 했음
		 * 하지만 제너릭 클래스를 사용한 mc1, mc2 객체 생성 예를 보면 입출력익 각각 객체를 생성할 때
		 * 정해진 타입으로 확정되기 때문에 setter 매서드를 사용할 때 입력 타입을 정확히 확인할 수 있고
		 * 출력할 때도 해당 타입으로 리턴되기 때문에 다운 캐스팅 자체가 필요없어짐
		 * 
		 */
	}

}

class MyClass<T> {
 	private T t;
 	public T get(){
 		return t;
 }
	 
 	public void set(T t){
 		this.t = t;
 }
 }
