package decorator2;


public class Main {

	public static void main(String[] args) {
		Food food1 = new Hamburger();
		food1 = new LargeSize(food1);
		
		System.out.println(food1);

	}
}
