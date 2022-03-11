package pm;

public class Exam4 {
	public static void main(String[] args) {
		// 생성자가 this()를 사용하는 이유
		// 객체를 생성하는 것과 함께 생성자의 주요 역할은 필드를 초기화하는 것
		
		/*
		 * class A{
		 * 	int m1, m2, m3, m4;
		 *  A () {
		 *  m1 = 1;
		 *  m2 = 2;
		 *  m3 = 3;
		 *  m4 = 4;
		 *  }
		 *  
		 *  A(int a){	// 생성자 오버로딩
		 *  m1 = a; // 두 번재 생성자가 첫 번째 생성자와 다른 점
		 *  m2 = 2;
		 *  m3 = 3;
		 *  m4 = 4;
		 *  }
		 *  
		 *  A(int a, int b){	//생성자 오버로딩
		 *  m1 = a;
		 *  m2 = b;	// 세 번째 생성자가 두 번째 생성자와 다른 점
		 *  m3 = 3;
		 *  m4 = 4;
		 *  }
		 *  
		 *  클래스 A에는 4개의 필드와 3개의 생성자가 있음
		 *  각 생성자에는 필드드를 초기화하는데 방법이 약간씩 다름
		 *  첫 번째 생성자는 네 개의 필드를 각각 초기화하고
		 *  두 번째 필드는 첫 번째 필드에만 입력받은 값을 대입하고 나머지는 첫 번째 생성자와 동일하게 초기화 함
		 *  마지막 생성자도 두 번째 생성자와 비슷하게 2개의 필드를 전달받은 값으로 초기화 한다는 점이 상이함
		 *  즉, 중복되는 값이 있다는 것
		 *  
		 *  각 생성자마다 중복되는 코드를 많이 포함하고 있음
		 *  만약 20개의 필드라면 각 생성자는 모두 20줄의 초기화 코드를 포함해야 함
		 *  만약 두 번째 생성자에서 첫 번째 생성자를 호출할 수 있다면
		 *  두 번째 생성자 내에서는 한 개의 필드만 추가로 초기화하면 됨
		 *  마찬가지로 세 번째 생성자도 두 번째 생성자를 호출하게 되면
		 *  추가로 한 개의 필드만 초기화 하면 됨
		 *  
		 *  이것이 바로 this()메서드가 사용되는 이유임
		 *  this() 메서드를 이용하면 생성자의 중복을 제거할 수 있음
		 */
		
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A(10,20);
		
		a1.print();
		a2.print();
		a3.print();
		
//		D b1 = new D();
//		D b2 = new D(10);
//		D b3 = new D(10,20);
//		b1.print();
//		b2.print();
//		b3.print();
	}
}

class A{
	int m1, m2, m3, m4;
	A () {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		}
		   
	A(int a){	// 생성자 오버로딩
		m1 = a; // 두 번재 생성자가 첫 번째 생성자와 다른 점
		m2 = 2;
		m3 = 3;
		m4 = 4;
		}
		  
	A(int a, int b){	//생성자 오버로딩
		m1 = a;
		m2 = b;	// 세 번째 생성자가 두 번째 생성자와 다른 점
		m3 = 3;
		m4 = 4;
		}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
		}
}

class B{
	int m1, m2, m3, m4;
	B () {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		}
		   
	B(int a){	// 생성자 오버로딩
		this();
		m1 = a; // 두 번재 생성자가 첫 번째 생성자와 다른 점
		}
		  
	B(int a, int b){	//생성자 오버로딩
		this(a);
		m2 = b;	// 세 번째 생성자가 두 번째 생성자와 다른 점
		}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
		}
}

