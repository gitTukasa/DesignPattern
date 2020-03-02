package decorator;

/**
 * Decorator
 * abstract で宣言して、継承したクラスで使用する<br>
 * フィールドにスーパークラス型をもち、マトリョーシカのようにフィールドの値を利用し呼ぶ
 * @author tukasa
 *
 */
abstract class Decorator extends Product{

	/** コンポーネントをラップして使用する */
	Product product;
	
	/**
	 * コンストラクタ
	 * @param product
	 */
	Decorator(Product product) {
		this.product = product;
	}
}
