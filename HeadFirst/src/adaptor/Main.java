package adaptor;

import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {

		List<? super AllLivingCreatures> animals =
				new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new CatToDogAdapter(new Cat()));
		
		/*
		 * animals内の犬のみがなく
		 * また、map().forEach()はまとめて`下の表現も同じ
		 * .forEach(o -> ((AllLivingCreatures) o).cry());
		 */
		System.out.println("-----All Dog Cry-----");
		animals.stream()
			.filter(t -> t instanceof Dog)
			.map(o ->(AllLivingCreatures)o)
			.forEach(AllLivingCreatures::cry);
		
	}
}