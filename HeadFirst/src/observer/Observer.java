package observer;

/**
 * <pre>
 * 継承して使用する  Subjectから引数でデータをもらっている為,これはpushモデルになる
 *  
 * &ltPush型&gt update(E e);
 * 	利点：引数でもらうデータがすべてのObserverで統一されていれば、
 * 		update（E e）の内容がシンプル
 * 	欠点：必要の無い情報まで渡すことになる<br>
 * 		※下では引数としてSubjectを受け取っているが、<br>
 * 		実際はSubjectのstrだけしか使用してない 
 *
 * &ltpull型&gt update(); 
 * 	利点：Observerの各々自由に処理を行える 
 * 	欠点：その分コードが冗長になる? 
 * 
 * @author tukasa
 * 
 * </pre>
 */
public interface Observer {
	void update(Subject sub);
}
