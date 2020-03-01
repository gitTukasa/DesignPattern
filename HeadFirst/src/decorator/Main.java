package decorator;

public class Main {
	public static void main(String... args) {
		Product testProduct = new Robot();
		testProduct = new Paint(testProduct);
		testProduct = new Paint(testProduct); 

		System.out.println(testProduct);
		
	}

}
