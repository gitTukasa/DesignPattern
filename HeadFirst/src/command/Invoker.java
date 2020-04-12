package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker クラス
 * Commandを複数持つ、下のようなメソッドで実行する
 * 履歴を持つリストを作れば、undoも可能
 * 
 * @author tukasa
 *
 */
class Invoker {
	List<Command> list = new ArrayList<Command>();
	
	void push(int i) {
		list.get(i).execute();
	}
	
	void actionAll(){
		list.stream()
		.forEach(Command::execute);
	}


}
