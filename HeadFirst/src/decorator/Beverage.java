package decorator;

/**
 * 飲み物を表すクラス
 * @author tukasa
 */
public abstract class Beverage {
	String description = "不明な飲み物";
	
	/**
	 * 継承クラスにてオーバーロードして使用、名称を返す
	 * @return description 飲み物名
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 継承クラスにて実装、金額を返す
	 * @return cost 金額
	 */
	public abstract double cost();

	/**
	 * toString
	 * name$cost を返す
	 * @return String 名称$金額 
	 */
	@Override
	public String toString() {
		return getDescription() + "$" + cost(); 
	}
}
