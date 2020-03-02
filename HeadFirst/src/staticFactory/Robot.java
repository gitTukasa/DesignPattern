package staticFactory;

import java.util.Random;

class Robot extends Product{
	public Robot() {
		super.name = "Robot";
		super.num = new Random().nextInt(100);
	}
}
