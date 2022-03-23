package pm;

public class Exam5 {

	public static void main(String[] args) {
		/* Generic 제네릭
		 * 자바에서는 다양한 종류의 클래스와 인터페이스를 제공함
		 * 이런 클래스와 인터페이스를 내부 멤버에서 활용하는 클래스를 작성할 때는 제공되는 
		 * 클래스나 인터페이스의 다양성만큼 많은 가지수의 클래스를 생성해야 함 
		 * 또한 동일한 이름의 매서드가 다양한 타입의 입력 매개변수를 가질 수 있도록 하려면
		 * 고려하는 입력 매개변수 타입의 수만큼 오버로딩을 수행해야 함
		 * 이러한 비효율성을 한 번에 해결하는데 필요한 문법 요소가 바로 '제네릭'임
		 
		 * - 제너릭을 사용하지 않고 여러 객체를 저장하는 클래스를 작성
		 * class Apple{}
		 
		 * class Goods1 {
		 * private Apple apple = new Apple();
		 * public Apple get(){
		 * 	return apple;
		 * }
		 
		 * public void set(Apple apple){
		 * this.apple = apple;
		 * }
		 
		 * class Pencil{}
		 
		 * class Goods2{
		 * private Pencil pencil = new Pencil();
		 * public Pencil get(){
		 * return pencil;
		 * }
		 
		 * public set(Pencil pencil){
		 * this.pencil = pencil;
		 * }
		 
		 * 사과를 저장 setter하고 가져오기 getter
		 * Goods1 goods1 = new Goods1();
		 * goods1.set(new Apple());
		 * Apple apple = goods1.get();
		 
		 * 연필을 저장 setter하고 가져오기 getter
		 * Goods2 goods2 = new Goods2();
		 * goods2.set(new Pencil());
		 * Pencil pencil = goods2.get();
		 
		 * 먼저 클래스 Goods1은 Apple 타입의 필드, 이 필드 값을 쓸 수 있는 getter 매서드와
		 * setter 매서드를 가지고 있음. 따라서 이 클래스의 객체를 생성함으로 사과를 저장 set하고
		 * 저장된 사과를 가져오는 get기능을 수행할 수 있음
		 
		 * 클래스 Goods2는 Pencil을 저장하고 관리할 수 있는 클래스로 필드가 pencil 타입이라는 것만
		 * 제외하면 클래스 Goods1과 동일함
		  
		 * 즉 사과와 연필을 저장하고 관리하기 위해 각각의 기능을 수행하는 클래스를 2개 만들어야 했던 것
		 
		 * 그렇다면 새로운 상품이 추가될 때마다 새로운 클래스를 생성해야 한다는 이야기
		 * > 1개의 상품 클래스로 모든 타입의 상품을 저장하고 관리할 수는 없을까?
		 * 간단한 해결책은 모든 자바의 최상위 클래스인 Object타입으로 선언하면 
		 * 사과든 연필이든 모두 저장하고 읽어올 수 있음
		 */
		
		// 사과를 저장 setter하고 가져오기 getter
		 Goods1 goods1 = new Goods1();
		 goods1.set(new Apple()); // Apple 타입만 입력 가능
		 Apple apple = goods1.get();

		// 연필을 저장 setter하고 가져오기 getter
		 Goods2 goods2 = new Goods2();
		 goods2.set(new Pencil()); // Pencil 타입만 입력 가능
		 Pencil pencil = goods2.get();


	}

}

class Apple{}

class Goods1 {
	private Apple apple = new Apple();
	public Apple get(){
		return apple;
	}

	public void set(Apple apple){
	 this.apple = apple;
	}
}
 class Pencil{}

 class Goods2{
	 private Pencil pencil = new Pencil();
	 public Pencil get(){
		 return pencil;
	 }

 public void set(Pencil pencil){
	 this.pencil = pencil;
 	}
}

