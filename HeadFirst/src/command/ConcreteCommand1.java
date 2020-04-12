package command;

/**
 * ConcreteCommand クラス
 * Comanndの実装　execute()をオーバーライドして使用
 * @author tukasa
 * @see Command
 *
 */
class ConcreteCommand1 extends Command{
	private Receiver receiver;
	
	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	
	/**
	 * receiver のaction()を実行する
	 */
	@Override
	void execute() {
		System.out.println(this.getClass().getSimpleName()
				+ " : execute()");
		receiver.action();
	}
}


