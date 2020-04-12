package adaptor;


/**
 * Adaptor クラス
 * catをdogとして扱う為、継承を行いコンポジションにより実現する
 * 継承元のクラスのメソッドをオーバーライドして使用する
 * @author tukasa
 *
 */
class CatToDogAdapter extends Dog {
	private Cat cat;
	
	public CatToDogAdapter(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void cry() {
		System.out.print("<< CatToDogAdapter >> ");
		cat.cry();
	}


}
