import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Runnable run = () ->{
			int count = 0;
			while(count <= 50) {
				System.out.println(count++);
				try{
					Thread.sleep(500);
				}catch(InterruptedException e) {
				}
			}
		};
		
		JFrame myFrame = new MyFrame("MyFrame");

		run.run();
	}
}