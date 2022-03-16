package abs;

//interface PredatorBarkable extends Predator, Barkable { // 인터페이스끼리는 상속이 가능함
	// 상속은 단일 상속만 가능하다고 했는데 왜 다중 상속이 가능해졌을까?
	// 일반클래스는 단일 상속만 가능하지만 인터페이스는 일반 클래스와는 달리 다중 상속이 가능함
	// Predator의 기능과 Barkable 기능이 둘 다 구현 가능함
//}

abstract class Predator extends Animal{
	abstract String getFood();
	
	void printFood() {	// 오버라이딩 가능
		System.out.printf("my food is %s\n", getFood());
	}
	
	static int LEG_COUNT = 4;
	static int speed() {
		return LEG_COUNT * 30;
	}
}

interface Barkable{
	void bark();
}

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Predator implements Barkable{	// Lion은 predator, animal 두 개를 다 상속 받아야 하는데 다중 상속이 불가하니
	public String getFood() { // predator이 animal을 상속받고 있으니까 결국 다중 상속의 효과를 냄
		return "apple";
	}
		
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable{
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

class ZooKeeper{
	
	void feed (Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
//	void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}
//	
//	void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	
//	void feed(Crocodile crocodile) {
//		System.out.println("feed strawberry");
//	}
//	
//	void feed(Leopard leopard) {
//		System.out.println("feed orange");
//	}
}

class Bouncer{
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}

public class Sample {

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger(); 
		Lion lion = new Lion();
		zooKeeper.feed(lion);
		zooKeeper.feed(tiger); // 매서드 오버로딩
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		// 인터페이스는 왜 필요한가?
		/* 처음에는 동물의 종류만큼 feed 매서드가 필요했음
		 * 인터페이스를 구현했더니 단 한 개의 feed 매서드로 구현이 가능해짐
		 * ZooKeeper 클래스가 동물들의 종류에 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 되었음
		 * USB포트는 물리적 세계의 인터페이스
		 * 상속은 자식 클래스가 부모 클래스의 매서드를 오버라이딩 하지 않고 사용할 수 있기 때문에 해당 매서드를 반드시 구현해야 한다는 "강제성"을 갖지 못함
		 * 상황에 맞게 상속을 사용할 것인지 인터페이스를 사용해야 할지를 결정해야 겠지만
		 * 인터페이스는 매서드를 반드시 구현해야 하는 "강제성"을 갖는다
		 */
	}
}
