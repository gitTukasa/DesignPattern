package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * TempleteMethod Class
 * コンソールから文字の入力を受け取りリストに挿入し
 * サブクラスで実装した処理を行いコンソールに表示する
 * @author tukasa
 *
 */
abstract class InputKeybord {

	/**
	 * finalで宣言し、abstractなメソッド
	 * をSubClassで実装する
	 */
	final void execute() {
		List<String> list = new ArrayList<>();
		input(list);
		prosessing(list);
		print(list);
		if(hook()) {
			System.out.println("Hookの実行");
		}
	}

	/**
	 * endと入力されるまでキーボードからの入力受け取るループ処理を行う<br>
	 * 数字が入力されたらExceptionを発生させる
	 * @param list List<String>
	 * @exception IOException 数字の入力時（無効な入力） 
	 */
	void input(List<String> list) {
		String str = "";
		System.out.printf("  %s%n  %s%n",
				"文字を入力してください",
				"終了する場合はend");

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		while(true) {
			try {
				str = br.readLine();
				if (str.matches("end")) {
					break;
				}
				if (str.matches(".*[0-9].*")) {
					throw new IOException("無効な値の入力");
				}
				list.add(str);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/** Sub Class で実装する*/
	abstract List<String> prosessing(List<String> list);

	/**
	 * Listをコンソール上で表示する<br>
	 * 例:a b c d
	 * @param list List<String>
	 */
	void print(List<String> list) {
		System.out.println("----print-----");
		list.stream()
			.map(s -> s + " ")
			.forEach(System.out::print);
		System.out.println();
	}
	
	/** 必要に応じSubClassでオーバーライドして使用する */
	boolean hook() {
		return false;
	}
}