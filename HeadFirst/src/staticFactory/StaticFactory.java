package staticFactory;

class StaticFactory {
	
	static Product create() {
		Product product = new Robot();
		return product;
	}

}
