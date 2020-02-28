package decorator;

//import java.util.function.Consumer;

/**
 * Mainクラス
 * 
 * @author tukasa
 * 
 */
public class StarbuzzCoffe {

	public static void main(String[] args) {
		
//		ラムダ式　toStoringをオーバーロードした為、使用はしてない
//		Consumer<Beverage> cons = e ->
//			System.out.println(e.getDescription() + "$" + e.cost());
			
		
		Beverage beverage = new Espresso(); 
		System.out.println(beverage);
		// エスプレッソ$1.99
				
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2);
		// ダークロースト, モカ, モカ, ホイップ$1.49

	}

}
