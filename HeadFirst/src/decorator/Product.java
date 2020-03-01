package decorator;

/**
 * Component
 * abstract で宣言して、継承したクラス全てで実装するメソッドを宣言する
 * 尚、コーポネントクラスでも実装しサブクラスでオーバーロードして使用も可能
 * 
 * @author tukasa
 *
 */
public abstract class Product {
	
	/**
	 * <pre>
	 * 継承したクラスで実装する 名称を返す
	 * 
	 * フィールドをゲッターで返却でも良い 
	 *	 	private String str = "name";
	 * 		public String getName(){
	 * 			return this.name;
	 * 		}
	 * 
	 * @return String 名称 
	 * </pre>
	 */
	public abstract String getName();
	
	/**
	 * 継承したクラスで実装する　金額を返す
	 * @return int 金額
	 */
	public abstract int getPrice();

	@Override
	public String toString() {
		return getName() + " : $" + getPrice();
	}
	

}
