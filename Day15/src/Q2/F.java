package Q2;

public class F {
	int a = 2;
	static int b =3;
	
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void bcd() {
		/* System.out.println(a); 
		 * static이 걸려있으면 static이 걸려있는 것만 가져다 쓸 수 있음
		 */
		System.out.println(b);
	}
	
}
