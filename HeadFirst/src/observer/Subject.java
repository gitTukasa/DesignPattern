package observer;

/**
 * 
 * オブザーバーの登録、更新等
 * 具体的な処理は具象クラスにて実行する。 
 * @author tukasa
 */
public interface Subject {
	Subject addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
