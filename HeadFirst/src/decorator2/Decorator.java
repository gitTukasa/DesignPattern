package decorator2;

public abstract class Decorator extends Food {
	String name = "Decorator";
	int price = 0;
	
	public abstract String getName();

	public abstract int getPrice();

}