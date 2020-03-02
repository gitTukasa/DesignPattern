package simpleFactory;

/**
 * Factoryと直接は関係ないけど、引数を列挙型で
 * 呼んだほうがいい？
 * 
 * @author tukasa
 *
 */
enum Type {
	HUMAN(0),
	DOG(1);

	/** Enumのフィールドは、コンストラクタを呼び出して生成するらしい */
	private final int code;

	/** コンストラクタ　SimpleFactoryでは全く使わないけど練習的なやつ */
	private Type(int code) {
		this.code = code;
	}
	
	int getCode() {
		return code;
	}
}
