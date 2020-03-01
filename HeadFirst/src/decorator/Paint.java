package decorator;

public class Paint extends Decorator{

	public Paint(Product product) {
		super(product);
	}

	@Override
	public String getName() {
		return product.getName() + " ,Painted";
	}

	@Override
	public int getPrice() {
		return product.getPrice() + 10;
	}

}
