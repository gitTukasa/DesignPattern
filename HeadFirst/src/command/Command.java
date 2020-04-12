package command;

/**
 * Command クラス
 * 具象クラスで実装、コンストラクタではなくSetterを使うのが正規
 * @author tukasa
 *
 */
abstract class Command {
	public Command() {};
	public Command(ConcreteReceiver concreteReceiver) {};

	/**	具象クラスで実装する */
	abstract void execute();

}