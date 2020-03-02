package staticFactory;

class Product {
	protected String name;
	protected int num;
	
	@Override
	public String toString() {
		return this.name + " : " +this.num;  
	}

}
