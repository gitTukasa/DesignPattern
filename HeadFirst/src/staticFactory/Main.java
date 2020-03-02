package staticFactory;

public class Main {
	public static void main(String... args) {
		Product product1 = StaticFactory.create();
		System.out.println(product1);
	}

}
