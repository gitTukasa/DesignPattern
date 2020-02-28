package decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.description = "ダークローロースト";
	}

	@Override
	public double cost() {
		return .99;
	}

}
