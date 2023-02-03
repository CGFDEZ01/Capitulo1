package paquete1;

public class suma {
	static int n1 = 50;
	
	public static int test() {
		int n1 = 10;
		return n1;
	}
	
	public static void main(String [] args) {
		int n2 = 30, suma;
		System.out.println(n1);
		suma = n1 + n2;
		System.out.println("LA SUMA ES: " + suma);
		test();
		System.out.println(n1);
		System.out.println(test());
	}
}
