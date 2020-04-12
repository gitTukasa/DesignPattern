package templateMethod;

/**
 * Main Class テンプレートメソッドパターン
 * @author tukasa
 *
 */
class Main {
	public static void main(String... args) {
		InputKeybord inToUpper = new ToAllUpperCase();
		System.out.println("<<Start ToAllUpperCase>>");
		inToUpper.execute();
		
		System.out.println("<<Start ToAllLowercase>>");
		InputKeybord inToLower = new ToAllLowerCase();
		inToLower.execute();
	}
}
