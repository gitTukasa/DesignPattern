package simpleFactory;

import java.util.List;
import java.util.ArrayList;

/**
 * SimpleFactoryのTestクラス、Productを作るSimpleFactory
 * のテストクラス
 *  
 * @author tukasa
 *
 */
public class SimpleFactoryTest {

	public static void main(String... args) {

		/** Productのリスト */
		List<Product> list = new ArrayList<>();
		
		/** SimpleFactory Productを作成する */
		SimpleFactory simpleFactory = new SimpleFactory();
		
		list.add(simpleFactory.create(Type.HUMAN)
					.setName("a"));
		
		list.add(simpleFactory.create(Type.DOG));

		/**
		 * for(Product p : list)
		 *     System.out.println(p);
		 * と同じ意味
		 */
		list.stream()
			.forEach(System.out::println);
		//a, 0
		//DogRobot, 1
		
	}

}
