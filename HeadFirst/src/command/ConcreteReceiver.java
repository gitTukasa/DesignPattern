package command;


/**
 * ConcreteResever クラス
 * Comanndクラスのexecute()によってaction()が実行される
 * @author tukasa
 * @see Command
 * @see Invoker
 *
 */
class ConcreteReceiver implements Receiver{
	private boolean state = false;

	/**
	 * Comandクラスから呼び出されて実行される
	 */
	@Override
	public void action() {
		if (state) {
			state = false;
		}else {
			state = true;
		}

		System.out.println(getClass().getSimpleName() + 
				" : action()" +  ", State : "  + state);
	}
}