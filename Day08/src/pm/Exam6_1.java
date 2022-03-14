package pm;


public class Exam6_1 {
	public static void main(String[] args) {
		
		/* class A{
		 * void print(){
		 * System.out.println("A클래스 print1")
		 * } 
		 *
		 * void print2(){
		 * System.out.println("A클래스 pritn2")
		 * }
		 * 
		 * class B extends A{
		 * void print(){		<매서드 오버라이딩
		 * System.out.println("B클래스 print1")
		 * }
		 * 
		 * void print(int a){	< 매서드 오버로딩
		 * System.out.println("B클래스 print2")
		 * }
		 */
		
		// Q. 클래스 b는 총 몇개의 매서드를 사용가능한가?
		// 3개
		
		P p = new P();
		R r = new R();
		
		p.print();
		p.print2();
		System.out.println();
		
		r.print();
		r.print2(3);
		r.print2();
		System.out.println();
		
		P po = new R();
		po.print();
		po.print2();
		// po.print2(3);
		System.out.println();
	}
}

class P{
	  void print(){
	  System.out.println("P클래스 print1");
	  } 
	 
	  void print2(){
	  System.out.println("P클래스 pritn2");
	  }
}
	  
class R extends P{
	@Override // annotation과 주석의 차이점 : @는 컴퓨터도 읽는 주석
	  void print(){		//<매서드 오버라이딩
	  System.out.println("R클래스 print1");
	  }
	  
	  void print2(int a){	//< 매서드 오버로딩
	  System.out.println("R클래스 print2");
	  }
}

