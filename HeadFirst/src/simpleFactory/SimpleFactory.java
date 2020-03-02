package simpleFactory;

class SimpleFactory {
	private int num = 0; 
	
	Product create(Type type) {
		Product product = new Robot();
		
		switch(type) {
		case HUMAN: product = new Robot();
			break;
		case DOG : product = new DogRobot();
			break;
			
		}

		product.setNum(num++);
		return product;
	}

}
