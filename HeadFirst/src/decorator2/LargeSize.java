package decorator2;

public class LargeSize extends Decorator {
	Food food;
	
	public LargeSize(Food food) {
		this.food = food;
	}

	public String name = ", 大盛り";
	public int price = 50;

	@Override
	public String getName() {
		return food.name + name;
	}

	@Override
	public int getPrice() {
		return food.price + price; 
	}
}
