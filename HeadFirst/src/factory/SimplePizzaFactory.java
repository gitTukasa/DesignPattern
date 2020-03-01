package factory;

/**
 * Class SimpleFactotry
 * 正確にはデザインパターンではなく、イディオムらしい、
 * Abstract Factory pattern がデザインパターン？
 * 
 * @author tukasa
 *
 */
public class SimplePizzaFactory {

	/**
	 * createメソッド typeを受け取り pizzaを作成し返却する
	 * 
	 * @param type Product
	 * @return pizza Pizzaの具象化クラス 
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("チーズ")) {
			pizza = new CheesePizza();
		}else if (type.equals("ペパロニ")) {
			pizza = new PepperoniPizza();
		}else if (type.equals("クラム")) {
			pizza = new ClamPizza();
		}else if (type.equals("野菜")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
