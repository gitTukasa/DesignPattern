package decorator;

/**
 * Decorator
 * abstract で宣言して、継承したクラスで使用する<br>
 * フィールドにスーパークラス型をもち、マトリョーシカのようにフィールドの値を利用し呼ぶ
 * @author tukasa
 *
 */
public abstract class Decorator extends Product{

	/** コンポーネントをラップして使用する */
	protected Product product;
	
	/**
	 * コンストラクタ
	 * @param product
	 */
	protected Decorator(Product product) {
		this.product = product;
	}
}
