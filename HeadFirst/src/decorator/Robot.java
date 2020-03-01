package decorator;

public class Robot extends Product{

	@Override
	public String getName() {
		return "Robot";
	}

	@Override
	public int getPrice() {
		return 100;
	}

}
