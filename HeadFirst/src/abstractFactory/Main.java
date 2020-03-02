package abstractFactory;

import abstractFactory.Factory.Type;

public class Main {

	public static void main(String[] args) {
		Factory productFactory = new NormalFactory();
		
		Product product1 = productFactory.orderRobot(Type.NORMAL);
		product1.say();
		
//		Product product2 = productFactory.orderRobot(Type.DOGROBOT);
//		product2.say();
	}

}
