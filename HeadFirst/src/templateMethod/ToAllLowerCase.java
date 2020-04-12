package templateMethod;

import java.util.List;

/**
 * ConcreteMethod クラス
 * Stringのリストをもらい、全て小文字にする
 * @author tukasa
 */
public class ToAllLowerCase extends InputKeybord{

	/**
	 * SuperClassの実装
	 * @param list Strigのリスト
	 * @see InputKeybord
	 */
	@Override
	List<String> prosessing(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toLowerCase());
		}
		return list;
	}
}