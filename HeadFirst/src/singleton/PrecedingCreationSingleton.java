package singleton;

/*
 * 先行インスタンス生成
 * 同期化を行うよりコストが軽く、インスタンス生成がオーバーヘッドを起こさないなら
 * パフォーマンス的には無難な手段
 * @author tukasa
 *
 */
class PrecedingCreationSingleton {
	private static PrecedingCreationSingleton singleton = new PrecedingCreationSingleton();
	private PrecedingCreationSingleton() {};
	
	static PrecedingCreationSingleton getInstance() {
		return singleton;
	}

}
