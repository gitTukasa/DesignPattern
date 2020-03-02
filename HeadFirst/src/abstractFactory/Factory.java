package abstractFactory;

abstract class Factory {
	static enum Type{
		NORMAL(0),
		DOGROBOT(1);

		private final int num;

		Type(int num){
			this.num = num;
		}

		int getNum() {
			return num;
		}
	};
	
	final Product orderRobot(Type type) {
		Product product = create(type);
		
		/* Other Codes */

		product.onCreate();
		return product;
	}
	
	abstract Product create(Type type);
}
