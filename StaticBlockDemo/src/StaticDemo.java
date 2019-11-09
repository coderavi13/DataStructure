
public class StaticDemo {

	private int a;
	private static int b=10;
	
	public StaticDemo(int i) {
		System.out.println("constructor");
		a=i;
	}
	static {
		b=30;
		System.out.println("Static block");
	}
	
	public void show() {
		System.out.println("a "+ a);
		System.out.println("b "+ b);
	}
	
}
