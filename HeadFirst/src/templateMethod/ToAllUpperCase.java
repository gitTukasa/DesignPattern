package templateMethod;

import java.util.List;

/**
 * ConcreteMethod クラス
 * Stringのリストをもらい、全て大文字にする
 * @author tukasa
 */
public class ToAllUpperCase extends InputKeybord{

	/**
	 * SuperClassの実装
	 * @param list Strigのリスト
	 * @see InputKeybord
	 */
	@Override
	List<String> prosessing(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		return list;
	}
	
	/** SuperClass Hookのオーバーライド、必要に応じて使用する */
	@Override
	boolean hook() {
		System.out.println(getClass().getSimpleName()
				+ "でHookのオーバーライド");
		return true;
	}
}