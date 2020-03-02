package simpleFactory;

/**
 * SimpleFactoyClass
 * New　を外部で行う　作成と何かの処理をセットで毎回行う際などに使用する
 * @author tukasa
 *
 */
class SimpleFactory {
	private int num = 0; 
	
	/**
	 * スイッチ文で引数からNew　を行う 
	 * @param type 製造種類
	 * @return Product 
	 */
	Product create(Type type) {
		Product product = new Robot();
		
		switch(type) {
		case HUMAN: product = new Robot();
			break;
		case DOG : product = new DogRobot();
			break;
//		default : product = デフォルトで作るクラスを指定する場合 
		}

		product.setNum(num++);
		return product;
	}

}
