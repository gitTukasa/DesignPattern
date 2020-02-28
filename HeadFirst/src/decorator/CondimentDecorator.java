package decorator;

/**
 * 
 * トッピングを表すクラス
 * @author tukasa
 
 */
public abstract class CondimentDecorator extends Beverage{
	Beverage beverage;

	public abstract String getDescription();
	
}
