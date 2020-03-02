package simpleFactory;

import java.util.List;
import java.util.ArrayList;

public class SimpleFactoryTest {
	public static void main(String... args) {
		List<Product> list = new ArrayList<>();
		SimpleFactory simpleFactory = new SimpleFactory();
		
		list.add(simpleFactory.create(Type.HUMAN)
					.setName("a"));
		
		list.add(simpleFactory.create(Type.DOG));

		list.stream()
			.forEach(System.out::println);
		
	}

}
