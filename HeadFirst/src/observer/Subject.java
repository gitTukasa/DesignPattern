package observer;

/**
 * オブザーバーの登録、更新等
 * 具体的な処理は具象クラスにて実装する。 
 * @author tukasa
 */
interface Subject {
	/**
	 * 具象化クラスにて実装 Observerの登録
	 * @param o 登録するObserver
	 * @return Subject
	 * 
	 */
	Subject addObserver(Observer o);
	
	/**
	 * 具象化クラスにて実装 Observerの削除
	 * @param o 削除するObserver 
	 */
	void removeObserver(Observer o);
	
	/**
	 * 具象化クラスにて実装 observersの更新
	 */
	void notifyObservers();
}
