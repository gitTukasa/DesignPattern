package decorator2;

public abstract class Food {
	
	String name = "Food";
	int price = 0;
	
	public String getName(){
		return name;
	}
	
	public int getPrice(){
		return price;
	}
	
	@Override
	public String toString() {
		return getName() + " : $" +getPrice();  
	}
}
