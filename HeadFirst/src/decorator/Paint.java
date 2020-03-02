package decorator;

class Paint extends Decorator{

	Paint(Product product) {
		super(product);
	}

	@Override
	String getName() {
		return product.getName() + " ,Painted";
	}

	@Override
	int getPrice() {
		return product.getPrice() + 10;
	}

}
