package am;

public class Exam4 {

	public static void main(String[] args) {
		G g = new G();
		System.out.println(g.a);	// 5
		System.out.println(g.b);	// 5
		System.out.println(g.c);	// 5
		System.out.println(g.d);	// 5

	}

}

class G {
	int a, b, c, d;
	G() {
		this(5);
	}
	
	G(int k) {
		a = k;
		b = k;
		c = k;
		d = k;
	}
}