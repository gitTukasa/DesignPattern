package decorator;

class Robot extends Product{

	@Override
	String getName() {
		return "Robot";
	}

	@Override
	int getPrice() {
		return 100;
	}

}
