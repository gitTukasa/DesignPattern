package abstractFactory;

public class NormalFactory extends Factory{

	@Override
	Product create(Type type) {
		Product product;
				switch(type) {
				case NORMAL : product = new HumanRobot();
					break;
				default : product = null;
				}
		return product;
	}
	

}
