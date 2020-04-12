package singleton;

/**
 * synchronizedによる同期処理をスレッド待機する
 * マルチスレッド動作で同期化を行うとコストがとても悪い
 * 
 * @author tukasa
 *
 */
class SynchronizedSingleton {
	static SynchronizedSingleton singleton;
	
	private SynchronizedSingleton() {};
	
	static synchronized SynchronizedSingleton getInstance() {
		if (singleton == null) {
			singleton = new SynchronizedSingleton();
		}
		return singleton;
	}
}
